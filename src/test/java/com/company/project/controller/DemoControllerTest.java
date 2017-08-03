/*
 * Copyright 2002-2017 the original author or authors.
 *
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
package com.company.project.controller;

import com.company.project.AbstractSpringContextTest;
import com.company.project.web.DemoController;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * @author DeserveL
 * @date 2017/8/3 13:48
 * @since 1.0.0
 */
public class DemoControllerTest extends AbstractSpringContextTest{

    private MockMvc mvc;

    @Autowired
    DemoController demoController;

    @Before
    public void setUp(){
        mvc = MockMvcBuilders.standaloneSetup(demoController).build();
    }

    @Test
    public void demo() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.post("/demo/list").accept(MediaType.APPLICATION_JSON);
        String rs = mvc.perform(request).andReturn().getResponse().getContentAsString();
        System.out.println(rs);
    }
}
