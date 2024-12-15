package edu.polytech.demochap5.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;


@Entity // This tells Hibernate to make a table out of this class
@AllArgsConstructor @NoArgsConstructor @Data @Builder
public class UserApp {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String username;
    private String password;
    @ManyToMany(fetch = FetchType.EAGER) //on a utilisé eager car à chque fois je vais charger un utilisateur, j'ai besion de telecharger ses roles
    private Collection<RoleApp> roles = new ArrayList<>();
    }
