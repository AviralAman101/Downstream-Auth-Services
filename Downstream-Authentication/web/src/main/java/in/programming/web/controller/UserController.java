package in.programming.web.controller;



import in.programming.web.proxy.TestFeignProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    TestFeignProxy tFeignProxy;

    @Autowired
    Environment env;

    @GetMapping("/status")
    public String welcoe(){
        System.out.println(env.getProperty("token.secret"));
        return tFeignProxy.getStatus();
    }

}
