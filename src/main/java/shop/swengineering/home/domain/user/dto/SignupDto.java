package shop.swengineering.home.domain.user.dto;

import lombok.Getter;
import lombok.Setter;
import shop.swengineering.home.domain.user.UserRole;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class SignupDto {

    @NotNull
    @Email
    private String username;

    @NotNull
    private String password;

    private UserRole userRole;
}
