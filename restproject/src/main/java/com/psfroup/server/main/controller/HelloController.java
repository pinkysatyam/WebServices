package com.psfroup.server.main.controller;

//import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.psfroup.server.main.model.HelloBean;

@RestController
public class HelloController {
	@Autowired
private MessageSource messageSource;	
	
@GetMapping("/hello")
public String hello() {
		return "hello world";
	}
@GetMapping("/hello_bean")
public HelloBean hellobean() {
	return new HelloBean("hello bean");
}
@GetMapping("/hello_bean/path/{name}")
public HelloBean pathVaraibleHello(@PathVariable String name) {
return new HelloBean("hello mr ,%s"+name);
}
/*
@GetMapping(path="/hello-world-internationalized")  
public String helloWorldInternationalized(@RequestHeader(name="Accept-Language", required=false) Locale locale)  
{  
return messageSource.getMessage("good.morning.message", null, locale);  
} */
}