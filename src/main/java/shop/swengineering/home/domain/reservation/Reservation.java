package shop.swengineering.home.domain.reservation;

import shop.swengineering.home.domain.user.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Reservation {

    @Id
    @GeneratedValue
    @Column(name = "RESERVATION_ID")
    private Long reservationId;

    @OneToMany
    @JoinColumn(name = "RESERVATION_ID")
    private List<User> users = new ArrayList<>();


}
