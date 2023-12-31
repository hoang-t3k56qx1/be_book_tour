package hoanglh.com.service;

import hoanglh.com.model.*;
import hoanglh.com.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long uid) {
        return userRepository.findById(uid).orElse(null);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User login(String username, String password) {
        return userRepository.login(username, password);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long uid) {
        userRepository.deleteById(uid);
    }
}
