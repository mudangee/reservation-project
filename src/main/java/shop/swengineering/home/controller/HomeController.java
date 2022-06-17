package shop.swengineering.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Controller
public class HomeController {


//    localhost:8080/reservation

    @GetMapping("/")
    public String home() {
        return "main";
    }



}
