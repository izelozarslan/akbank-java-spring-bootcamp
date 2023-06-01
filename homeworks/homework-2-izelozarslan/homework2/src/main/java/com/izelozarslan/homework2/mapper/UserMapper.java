package com.izelozarslan.homework2.mapper;

import com.izelozarslan.homework2.dto.user.UserDTO;
import com.izelozarslan.homework2.dto.user.UserSaveRequest;
import com.izelozarslan.homework2.entity.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    List<UserDTO> convertToUserDTOList(List<User> userList);

    UserDTO convertToUserDTO(User user);

    User convertToUser(UserSaveRequest userSaveRequest);



}
