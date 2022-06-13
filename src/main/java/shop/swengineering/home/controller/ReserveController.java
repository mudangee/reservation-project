package shop.swengineering.home.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import shop.swengineering.home.domain.reservation.Reservation;

public class ReserveController {
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

    @PostMapping("/reserve_Ct_library")
    public String reserve_ct_save(@ModelAttribute Reservation reservation, Model model) {
        model.addAttribute("reservation",reservation);
        return "/history";
    }

    @PostMapping
    public String reserve_ground_save(@ModelAttribute Reservation reservation, Model model) {
        model.addAttribute("reservation",reservation);
        return "/history";
    }

    @PostMapping
    public String reserve_elec_save(@ModelAttribute Reservation reservation, Model model) {
        model.addAttribute("reservation",reservation);
        return "/history";
    }

    @PostMapping
    public String reserve_gym_save(@ModelAttribute Reservation reservation, Model model) {
        model.addAttribute("reservation",reservation);
        return "/history";
    }
}
