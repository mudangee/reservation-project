package shop.swengineering.home.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import shop.swengineering.home.domain.user.User;
import shop.swengineering.home.domain.user.UserRepository;

import static org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.springSecurity;
import static shop.swengineering.home.domain.user.UserRole.ROLE_USER;

@SpringBootTest
class UserControllerTest {

//    @Autowired
//    private WebApplicationContext context;
//
//    @Autowired
//    private UserRepository userRepository;
//
//    PasswordEncoder passwordEncoder;
//
//    private MockMvc mockMvc;
//
//    private Account creatUser(String username, String password){
//        Account account
//    }
//
//    @BeforeEach
//    public void setup(){
//        mockMvc = MockMvcBuilders
//                .webAppContextSetup(this.context)
//                .apply(springSecurity())
//                .build();
//
//        User user = User.builder()
//                .username("hojin")
//                .password(passwordEncoder.encode("qwer1234"))
//                .userRole(ROLE_USER)
//                .build();
//    }
//
//    @Test
//    void test1()

}