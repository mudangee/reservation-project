package shop.swengineering.home.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import shop.swengineering.home.domain.reservation.Reservation;
import shop.swengineering.home.domain.reservation.ReservationRepository;

import java.util.List;


public class HistoryController {



    private ReservationRepository reservationRepository;

    @GetMapping("/history")
    public String history(Model model) {
       List<Reservation> reservations =reservationRepository.findAll();
        model.addAttribute("reservaations",reservations);
        return "history";
    }
}

