/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.examproject.controller;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.examproject.form.HelloForm;

/**
 * @author h.adachi
 */
@Slf4j
@RequiredArgsConstructor
@Controller
public class HelloController {

    @NonNull
    private final HelloForm helloForm;

    ///////////////////////////////////////////////////////////////////////////
    // public methods

    @RequestMapping(
        value={"/", "/index.html"},
        method=RequestMethod.GET
    )
    public String doGet(ModelMap model) {
        model.addAttribute(helloForm);
        return "form";
    }

    @RequestMapping(
        value={"/", "/index.html"},
        method=RequestMethod.POST
    )
    public String doPost(
        @ModelAttribute HelloForm helloForm
    ) {
        String greeting = "Hello! your name is " + helloForm.getName() + ".";
        log.info(greeting);
        helloForm.setName(greeting);
        return "show";
    }

}
