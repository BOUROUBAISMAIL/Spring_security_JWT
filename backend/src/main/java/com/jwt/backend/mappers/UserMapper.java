package com.jwt.backend.mappers;

import com.jwt.backend.entites.User;
import com.jwt.backend.dtos.SignUpDto;
import com.jwt.backend.dtos.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);

    @Mapping(target = "password", ignore = true)
    User signUpToUser(SignUpDto signUpDto);

}
