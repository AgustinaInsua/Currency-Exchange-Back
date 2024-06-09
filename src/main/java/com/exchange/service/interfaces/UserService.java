package com.exchange.service.interfaces;

import com.exchange.api.dto.UserDTO;

import java.util.List;

public interface UserService {

    public List<UserDTO> getUsers();

    public UserDTO findById(Long id) ;

    public UserDTO create(UserDTO userDTO);

    public UserDTO updateUser(Long id, UserDTO userDTO);

    public void deleteOneById(Long id);

}