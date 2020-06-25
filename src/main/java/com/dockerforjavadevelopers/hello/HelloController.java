package com.dockerforjavadevelopers.hello;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "<H1><center><p style='color:blue'>This is a Demo done using spinnaker for Kubernetes deployment on Linode\n</p></center></H1>";
    }
    
}
