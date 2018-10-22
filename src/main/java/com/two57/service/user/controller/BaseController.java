package com.two57.service.user.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class BaseController {
    @RequestMapping("/echo/{str}")
    public String echo(@PathVariable(value = "str") String str) {
        return "Hello " + str;
    }

    @RequestMapping("/health")
    public Boolean echo() {
        return true;
    }
}
