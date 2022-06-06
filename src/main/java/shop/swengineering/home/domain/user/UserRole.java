package shop.swengineering.home.domain.user;

import org.springframework.security.core.GrantedAuthority;

public enum UserRole implements GrantedAuthority {
    ROLE_USER("사용자"), ROLE_ADMIN("관리자");

    private String description;

    UserRole(String description){
        this.description = description;
    }
    @Override
    public String getAuthority() {
        return name();
    }
}
