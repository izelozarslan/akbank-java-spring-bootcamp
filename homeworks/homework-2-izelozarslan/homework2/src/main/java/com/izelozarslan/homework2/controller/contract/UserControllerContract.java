package com.izelozarslan.homework2.controller.contract;

import com.izelozarslan.homework2.dto.user.UserDTO;
import com.izelozarslan.homework2.dto.user.UserDeleteRequest;
import com.izelozarslan.homework2.dto.user.UserSaveRequest;

import java.util.List;


public interface UserControllerContract {

    List<UserDTO> findAll();

    UserDTO findById(Long id);

    UserDTO findByUsername(String username);

    UserDTO save(UserSaveRequest userSaveRequest);

    UserDTO updateById(Long id, UserSaveRequest userSaveRequest);



    void deleteById(Long id, UserDeleteRequest userDeleteRequest);



}
