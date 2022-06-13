package shop.swengineering.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {


//    localhost:8080/reservation

    @GetMapping("/")
    public String home() {
        return "main";
    }

    @GetMapping("/reservation")
    public String reservation() {
        return "reservation";
    }

    @GetMapping("/reserve_Ct_library")
    public String reserve_Ct_library() {
        return "/reserve_Ct_library";
    }

    @GetMapping("/reserve_ground")
    public String reserve_ground() {
        return "/reserve_ground";
    }

    @GetMapping("/reserve_elec_library")
    public String reserve_elec_library() {
        return "/reserve_elec_library";
    }

    @GetMapping("/reserve_gym")
    public String reserve_gym() {return "/reserve_gym";
    }

}
