package in.programming.profile2.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {
    @GetMapping("/status")
    public String getStatus(){
        return "Working";
    }
}
