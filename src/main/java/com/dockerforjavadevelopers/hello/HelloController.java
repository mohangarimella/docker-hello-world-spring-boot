package com.dockerforjavadevelopers.hello;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "<H3><center><p style="color:red">This is Capgemini's DevOps solution world\n</p></center></H3>";
    }
    
}
