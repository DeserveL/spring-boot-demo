package com.company.project.webservice.service.impl;

import com.company.project.webservice.service.DemoWebService;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * @author DeserveL
 * @date 2017/7/25 16:12
 * @since 1.0.0
 */
@WebService(endpointInterface = "com.company.project.webservice.service.DemoWebService")
@Service
public class DemoWebServiceImpl implements DemoWebService{

    @Override
    public String getName(String name) {
        return "My name is"+ name;
    }

    @Override
    public String getNameAndAge(String name, int age) {
        return name +"今年" + age + "岁";
    }
}
