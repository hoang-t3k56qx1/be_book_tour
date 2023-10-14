package hoanglh.com.controller;

import hoanglh.com.model.*;
import hoanglh.com.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{uid}")
    public User getUserById(@PathVariable Long uid) {
        return userService.getUserById(uid);
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @PutMapping("/{uid}")
    public User updateUser( @RequestBody User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("/{uid}")
    public void deleteUser(@PathVariable Long uid) {
        userService.deleteUser(uid);
    }
}

