package ro.itschool.springboot.services;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;
import ro.itschool.springboot.models.dtos.UserDTO;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    List<UserDTO> userDTOList = new ArrayList<>();

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        userDTOList.add(userDTO);
        return userDTO;
    }

    @Override
    public UserDTO updateUser(UserDTO userDTO) {
        //get user by name
        //update fields for user
        //return user
        for (UserDTO user : userDTOList) {
            if (user.getName().equalsIgnoreCase(userDTO.getName())) {
                user.setEmail(user.getEmail());
                user.setAge(user.getAge());
                return user;
            }
        }
        return null;
    }

    @Override
    public List<UserDTO> getUsers() {
        return userDTOList;
    }

    @Override
    public UserDTO deleteUserByName(String name) {

        for (UserDTO user : userDTOList) {
            if (user.getName().equalsIgnoreCase(name)) {
                userDTOList.remove(user);
                return user;
            }
        }
        return null;
    }
}
