<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>FORM</title>
    </head>
    <body>
        <form:form modelAttribute="helloForm">
            ID: <form:input path="id" /><br>
            NAME: <form:input path="name" /><br>
            <input type="submit" value="SUBMIT"/>
        </form:form>
    </body>
</html>
