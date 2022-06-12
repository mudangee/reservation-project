package shop.swengineering.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "main";
    }

    @GetMapping("reservation")
    public String reservation() {
        return "reservation";
    }
    @GetMapping("history")
    public String history() {
        return "history";
    }
}
