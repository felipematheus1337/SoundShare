package com.user.resources.mapper;


import com.user.domain.User;
import com.user.resources.dto.UserDTO;
import com.user.resources.dto.UserRequest;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.stream.Collectors;

@Configuration
@RequiredArgsConstructor
public class UserMapper {

    private final ModelMapper modelMapper;


    public User toModel(UserDTO userDTO) {
        return modelMapper.map(userDTO, User.class);
    }

    public UserDTO toDTO(User u) {
        return modelMapper.map(u, UserDTO.class);
    }

    public User requestToUser(UserRequest request) {
        return modelMapper.map(request, User.class);
    }

    public List<UserDTO> toDTOList(List<User> userList) {

        return userList.stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }
}
