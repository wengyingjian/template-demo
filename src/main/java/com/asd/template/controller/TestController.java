/**
 * 
 */
package com.asd.template.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.asd.template.service.TestService;

/**
 * 
 * @author <a href="mailto:wengyj@59store.com">翁英健</a>
 * @version 1.1 2015年12月3日
 * @since 1.1
 */
@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("test")
    @ResponseBody
    public String test(String name) {
        return testService.test(name);
    }

    @RequestMapping("test1")
    @ResponseBody
    public String test1(String name) {
        return name;
    }

}
