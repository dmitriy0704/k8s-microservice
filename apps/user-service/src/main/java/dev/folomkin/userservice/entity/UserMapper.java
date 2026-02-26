package dev.folomkin.userservice.entity;

public class UserMapper {

    public static User dtoToEntity(UserDto dto) {
        return new User(dto.name(), dto.email());
    }
}
