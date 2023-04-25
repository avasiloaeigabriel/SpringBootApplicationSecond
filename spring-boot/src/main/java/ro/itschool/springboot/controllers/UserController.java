package ro.itschool.springboot.controllers;

import org.springframework.web.bind.annotation.*;
import ro.itschool.springboot.models.dtos.UserDTO;
import ro.itschool.springboot.services.UserService;

import java.util.List;

@RestController
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {///dependency injection
        this.userService = userService;
    }

    @PostMapping("/api/users")
    public UserDTO createUser(@RequestBody UserDTO userDTO) {
        return userService.createUser(userDTO);

    }

    @PutMapping ("/api/users")
    public UserDTO updateUser(@RequestBody UserDTO userDTO) {
        return userService.updateUser(userDTO);

    }

    @GetMapping("/api/users")
    public List<UserDTO> getUsers() {
        return userService.getUsers();

    }

    @DeleteMapping("/api/users/{name}")
    public UserDTO deleteUserByName(@PathVariable String name) {
        return userService.deleteUserByName(name);

    }


}
