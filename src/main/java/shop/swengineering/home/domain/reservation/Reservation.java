package shop.swengineering.home.domain.reservation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import shop.swengineering.home.domain.user.User;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "RESERVATIONS")
public class Reservation {

    @Id
    @GeneratedValue
    @Column(name = "RESERVATION_ID")
    private Long reservationId;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private User user;

    private String place;

    private String rep_name;
    private String studentNumber;
    private String resPurpose;
    private int personNum;
    private LocalDateTime dateTime;
    private String detailPlace;
    private String choicePurpose;
    private String phoneNum;

}
