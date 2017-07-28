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
package com.company.project.webservice.client;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

import javax.xml.namespace.QName;

/**
 * @author DeserveL
 * @date 2017/5/31 14:51
 * @since 1.0.0
 */
public class DemoClient {
    //private static final String url = "http://localhost:8099/cxf/demo?wsdl";
    private static final String url = "http://localhost:57772/csp/gutaitest1/webserviceEnsem.demo.CLS?WSDL=1";
    //private static String nameSpace = "http://service.webservice.project.company.com/";
    private static String nameSpace = "http://tempuri.org";

    public static void callService() {
        try {
            JaxWsDynamicClientFactory clientFactory = JaxWsDynamicClientFactory.newInstance();
            Client client = clientFactory.createClient(url);
            QName qName = new QName(nameSpace,"getNameAndAge");
            Object[] rs = client.invoke(qName, "李响",18);
            System.out.println(rs[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        callService();
    }
}
