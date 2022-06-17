package shop.swengineering.home.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import shop.swengineering.home.domain.reservation.Reservation;
import shop.swengineering.home.domain.reservation.ReservationRepository;
import shop.swengineering.home.domain.reservation.dto.ReservationDto;

import java.sql.SQLOutput;
import java.util.List;

@RequiredArgsConstructor
@Controller
public class ReserveController {

    private final ReservationRepository reservationRepository;

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
    public String reserve_gym() {
        return "/reserve_gym";
    }

    @GetMapping("/history")
    public String history(ReservationDto reservationDto, Model model) {
        List<Reservation> reservation = reservationRepository.findAll();
        model.addAttribute("reservation", reservation);
        return "/history";
    }

    @PostMapping("/reserve_Ct_library")
    public String reserve_ct_save(@ModelAttribute ReservationDto reservationDto, Model model) {
        model.addAttribute("reservation", reservationDto);

        Reservation reservation = new Reservation();
        reservation.setPlace("중앙도서관");
        reservation.setRep_name(reservationDto.getRep_name());
        reservation.setDateTime(reservationDto.getDateTime());
        reservation.setPersonNum(reservationDto.getPersonNum());
        reservation.setDetailPlace(reservationDto.getDetailPlace());
        reservation.setChoicePurpose(reservationDto.getChoicePurpose());
        reservation.setPhoneNum(reservationDto.getPhoneNum());
        reservation.setStudentNumber(reservationDto.getStudentNumber());
        reservation.setResPurpose(reservationDto.getResPurpose());
        reservationRepository.save(reservation);

        return "/history";
    }

    @PostMapping("reserve_ground")
    public String reserve_ground_save(@ModelAttribute ReservationDto reservationDto, Model model) {
        model.addAttribute("reservation", reservationDto);

        Reservation reservation = new Reservation();
        reservation.setPlace("운동장");
        reservation.setRep_name(reservationDto.getRep_name());
        reservation.setDateTime(reservationDto.getDateTime());
        reservation.setPersonNum(reservationDto.getPersonNum());
        reservation.setDetailPlace(reservationDto.getDetailPlace());
        reservation.setChoicePurpose(reservationDto.getChoicePurpose());
        reservation.setPhoneNum(reservationDto.getPhoneNum());
        reservation.setStudentNumber(reservationDto.getStudentNumber());
        reservation.setResPurpose(reservationDto.getResPurpose());
        reservationRepository.save(reservation);
        return "/history";
    }

    @PostMapping("reserve_elec_library")
    public String reserve_elec_save(@ModelAttribute ReservationDto reservationDto, Model model) {
        model.addAttribute("reservation", reservationDto);

        Reservation reservation = new Reservation();
        reservation.setPlace("전자정보도서관");
        reservation.setRep_name(reservationDto.getRep_name());
        reservation.setDateTime(reservationDto.getDateTime());
        reservation.setPersonNum(reservationDto.getPersonNum());
        reservation.setDetailPlace(reservationDto.getDetailPlace());
        reservation.setChoicePurpose(reservationDto.getChoicePurpose());
        reservation.setPhoneNum(reservationDto.getPhoneNum());
        reservation.setStudentNumber(reservationDto.getStudentNumber());
        reservation.setResPurpose(reservationDto.getResPurpose());
        reservationRepository.save(reservation);
        return "/history";
    }

    @PostMapping("reserve_gym")
    public String reserve_gym_save(@ModelAttribute ReservationDto reservationDto, Model model) {
        model.addAttribute("reservation", reservationDto);

        Reservation reservation = new Reservation();
        reservation.setPlace("체육관");
        reservation.setRep_name(reservationDto.getRep_name());
        reservation.setDateTime(reservationDto.getDateTime());
        reservation.setPersonNum(reservationDto.getPersonNum());
        reservation.setDetailPlace(reservationDto.getDetailPlace());
        reservation.setChoicePurpose(reservationDto.getChoicePurpose());
        reservation.setPhoneNum(reservationDto.getPhoneNum());
        reservation.setStudentNumber(reservationDto.getStudentNumber());
        reservation.setResPurpose(reservationDto.getResPurpose());
        reservationRepository.save(reservation);
        return "/history";
    }

    @PostMapping("/history")
    public String history_delete(@ModelAttribute Reservation reservation, Model model) {
        reservationRepository.delete(reservation);
        return "redirect:/history";
    }

}
