package shop.swengineering.home.security;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import shop.swengineering.home.domain.user.UserRepository;
import shop.swengineering.home.handler.exception.CustomException;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserDetailsService {


    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByUsername(username)
                .orElseThrow(() -> new CustomException(username + " 사용자를 찾을 수 없습니다."));
    }
}
