package ifi999.fakestore.user.app;

import ifi999.fakestore.user.api.dto.CreateUserRequest;
import ifi999.fakestore.user.api.dto.UserDto;
import ifi999.fakestore.user.app.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@Transactional
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    // TODO - 아래 Mock 혹은 다른 가짜 객체 사용방법 알아보기
//    @Mock
//    private UserRepository userRepository;

//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.openMocks(this);
//        userService = new UserServiceImpl(userRepository);
//    }

    @Test
    public void 유저생성() {
        //given
        CreateUserRequest request = 유저정보_생성();

        //when
        UserDto user = userService.createUser(request);

        //then
        assertThat(request.getEmail()).isEqualTo(user.getEmail());
        assertThat(user.getName().getFirstName()).isEqualTo("FIRST");
        assertThat(user.getAddress().getGeolocation().getLatitude()).isEqualTo(1234.5678f);
    }

    private CreateUserRequest 유저정보_생성() {
        return CreateUserRequest.builder()
                .email("user@email.com")
                .username("USERNAME")
                .password("1234")
                .phone("010-0000-0000")
                .street("STREET")
                .zipcode("ZIPCODE")
                .number(1234)
                .city("CITY")
                .latitude(1234.5678f)
                .longitude(9876.5432f)
                .firstname("FIRST")
                .lastname("LAST")
                .build();
    }

}
