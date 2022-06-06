package shop.swengineering.home.domain.user.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
public class AccountRequestDto {

    private String username;

    private String password;

    private String password_confirm;

    @Builder
    public AccountRequestDto(String username, String password, String password_confirm){
        this.username = username;
        this.password = password;
        this.password_confirm = password_confirm;
    }
}
