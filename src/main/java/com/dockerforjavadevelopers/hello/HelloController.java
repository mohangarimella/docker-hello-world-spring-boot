package com.dockerforjavadevelopers.hello;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "<H1><center><p style='color:blue'>This is a Demo using spinnaker for different Kubernetes versions\n</p></center></H1>";
    }
    
}
