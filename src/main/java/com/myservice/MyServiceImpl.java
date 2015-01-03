package com.myservice;

import javax.jws.WebService;

/**
 * Created by kanishka on 1/4/15.
 */
@WebService(serviceName="HelloWorld")
public class MyServiceImpl implements MyService {
    @Override
    public String sayHello() {
        return "Hello there!";
    }
}
