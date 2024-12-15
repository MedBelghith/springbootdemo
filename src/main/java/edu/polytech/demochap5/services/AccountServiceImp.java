package edu.polytech.demochap5.services;

import edu.polytech.demochap5.entities.RoleApp;
import edu.polytech.demochap5.entities.UserApp;
import edu.polytech.demochap5.repositories.RoleRepository;
import edu.polytech.demochap5.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class AccountServiceImp implements AccountService {
    private UserRepository userRepository;
    private RoleRepository roleRepository;

    @Override
    public UserApp addUser(UserApp userApp) {
        return userRepository.save(userApp);
    }

    @Override
    public UserApp getUserApp(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public UserApp updateUserApp(Long id, UserApp userApp) {
        return null;
    }

    @Override
    public void deleteUserApp(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<UserApp> getAllUserApps() {
        return (List<UserApp>) userRepository.findAll();
    }

    @Override
    public RoleApp saveRole(RoleApp role) {
        return roleRepository.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {

            UserApp user = findUserByUserName(username);

    }

    @Override
    public UserApp findUserByUserName(String username) {
        return null;
    }

    @Override
    public List<UserApp> listUsers() {
        return List.of();
    }
}
