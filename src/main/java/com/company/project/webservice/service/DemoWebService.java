package com.company.project.webservice.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @author DeserveL
 * @date 2017/7/25 16:12
 * @since 1.0.0
 */
@WebService
public interface DemoWebService {
    @WebMethod
    String getName(@WebParam(name = "name") String name);

    @WebMethod
    String getNameAndAge(@WebParam(name = "name") String name, @WebParam(name = "age")int age);
}
