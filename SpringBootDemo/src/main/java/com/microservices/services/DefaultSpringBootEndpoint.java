package com.microservices.services;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultSpringBootEndpoint implements ErrorController {
	@RequestMapping("/")
    public String index() {
        return "Hello from the other side";
    }
	
	private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    public String error() {
        return "OOPS!!! Something Went Wrong";
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }

}
