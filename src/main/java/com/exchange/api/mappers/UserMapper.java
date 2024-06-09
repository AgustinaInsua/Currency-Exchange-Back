package com.exchange.api.mappers;

import com.exchange.api.dto.UserDTO;
import com.exchange.domain.entity.UserDE;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDTO userDEtoUserDTO(UserDE userDE);

    UserDE userDTOtoUserDE(UserDTO userDTO);
}
