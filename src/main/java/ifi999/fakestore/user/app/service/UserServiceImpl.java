package ifi999.fakestore.user.app.service;

import ifi999.fakestore.user.api.dto.*;
import ifi999.fakestore.user.domain.Users;
import ifi999.fakestore.user.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public String login(LoginRequest dto) {
        return null;
    }

    @Override
    public List<UserDto> getUsers() {
        return null;
    }

    @Override
    public UserDto getUser(Long id) {
        return null;
    }

    @Override
    public UserDto createUser(CreateUserRequest dto) {
        Users savedUser = userRepository.save(CreateUserRequest.toEntity(dto));
        return UserDto.of(savedUser);
    }

    @Override
    public UserDto updateUser(UpdateUserRequest dto) {
        return null;
    }

    @Override
    public UserDto deleteUser(UserDeleteRequest dto) {
        return null;
    }

}
