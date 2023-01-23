package ifi999.fakestore.user.app.service;

import ifi999.fakestore.user.api.dto.*;

import java.util.List;

public interface UserService {

    String login(LoginRequest dto);
    List<UserDto> getUsers(); // paging, sort 관련 파라미터 필요
    UserDto getUser(Long id);
    UserDto createUser(CreateUserRequest dto);
    UserDto updateUser(UpdateUserRequest dto);
    UserDto deleteUser(UserDeleteRequest dto);

}
