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
package com.company.project.service;

import com.company.project.AbstractSpringContextTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author DeserveL
 * @date 2017/7/20 15:44
 * @since 1.0.0
 */
public class DemoServiceTest extends AbstractSpringContextTest {

    @Value("${test.rondom.int1}")
    int rondomA;
    @Value("${test.rondom.int2}")
    int rondomB;
    @Value("${test.rondom.int3}")
    int rondomC;

    @Autowired
    DemoService demoService;

    @Test
    public void list(){
        System.out.println(rondomA);
        System.out.println(rondomB);
        System.out.println(rondomC);
        System.out.println(rondomA);
        System.out.println(rondomB);
        System.out.println(rondomC);
        System.out.println(demoService.findAll());
    }
}
