package service.impl;

import com.herogi.server.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserRepository;
import service.UserService;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {


    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findUsers() {
        return userRepository.findAll();
    }

    public Optional<User> findUser(String userid) {
        Optional<User> user = userRepository.findById(userid);

        return user;
    }

    @Override
    public List<User> allUsers() {
        return null;
    }
}
