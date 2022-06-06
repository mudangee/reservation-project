package shop.swengineering.home.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import shop.swengineering.home.domain.user.User;
import shop.swengineering.home.domain.user.UserRepository;
import shop.swengineering.home.domain.user.UserRole;
import shop.swengineering.home.domain.user.dto.SignupDto;
import shop.swengineering.home.handler.exception.CustomException;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException(username));
    }

    @Transactional
    public Long save(SignupDto signupDto){
        if(userRepository.findByUsername(signupDto.getUsername()).isPresent()){
            throw new CustomException("사용중인 아이디 입니다.");
        }


        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        signupDto.setPassword(encoder.encode(signupDto.getPassword()));
        log.debug("signup user = {}", signupDto.getUsername());
        return userRepository.save(User.builder()
                .username(signupDto.getUsername())
                .password(signupDto.getPassword())
                .userRole(UserRole.ROLE_USER)
                .build()).getMemberId();
    }
}
