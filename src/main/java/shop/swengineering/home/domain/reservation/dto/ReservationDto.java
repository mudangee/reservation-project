package shop.swengineering.home.domain.reservation.dto;

import lombok.Getter;
import lombok.Setter;
import shop.swengineering.home.domain.user.User;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
public class ReservationDto {

    private String rep_name;
    private String studentNumber;
    private String resPurpose;
    private int personNum;
    private LocalDateTime dateTime;
    private String detailPlace;
    private String choicePurpose;

}
