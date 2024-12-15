package edu.polytech.demochap5.services;

import edu.polytech.demochap5.entities.RoleApp;
import edu.polytech.demochap5.entities.UserApp;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AccountService {
    public UserApp addUser(UserApp userApp);
    public UserApp getUserApp(Long id);
    public UserApp updateUserApp(Long id, UserApp userApp);
    public void deleteUserApp(Long id);
    public List<UserApp> getAllUserApps();

    public RoleApp saveRole(RoleApp role);
    public void addRoleToUser(String username, String roleName);//associer un role à un utilisateur
    public UserApp findUserByUserName(String username);//retourner l'utilisateur
    List<UserApp> listUsers();
}
