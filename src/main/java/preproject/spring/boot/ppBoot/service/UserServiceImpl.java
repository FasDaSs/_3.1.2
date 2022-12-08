package preproject.spring.boot.ppBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import preproject.spring.boot.ppBoot.model.User;
import preproject.spring.boot.ppBoot.repository.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    //@Transactional
    public void add(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User> listUsers() {
        return userRepository.findAll();
    }

    @Override
    //@Transactional
    public void updateUser(User user) {
        userRepository.save(user);
    }

    @Override
    //@Transactional
    public void deleteUser(long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User getById(long id) {
        return userRepository.findById(id).orElse(null);
    }
}
