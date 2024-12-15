package edu.polytech.demochap5.repositories;

import edu.polytech.demochap5.entities.RoleApp;
import edu.polytech.demochap5.entities.UserApp;
import org.springframework.data.repository.CrudRepository;


public interface RoleRepository extends CrudRepository<RoleApp, Long> {



}
