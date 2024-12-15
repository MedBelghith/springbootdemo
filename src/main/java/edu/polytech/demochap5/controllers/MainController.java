package edu.polytech.demochap5.controllers;

import edu.polytech.demochap5.entities.UserApp;
import edu.polytech.demochap5.repositories.UserRepository;
import edu.polytech.demochap5.services.AccountService;
import edu.polytech.demochap5.services.AccountServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.server.DelegatingServerHttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller // This means that this class is a Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class MainController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private AccountService accountService;

   /* @PostMapping(path = "/add") // RequestParam
    public @ResponseBody String addNewUser(@RequestParam(value = "name") String name, @RequestParam String email) {
        System.out.println("name : "+ name);
        System.out.println("email : "+ email);
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request
        UserApp u = new UserApp();
        u.setName(name);
        u.setEmail(email);
        userRepository.save(u);
        return "Saved";
    }*/

    @PostMapping(path = "/add") // RequestBody
    public @ResponseBody String addNewUser(@RequestBody UserApp user) {
        System.out.println("user got : "+ user.toString());
    UserApp newUser = new UserApp();
      newUser=  accountService.addUser(user);
      if (newUser != null) {return "Saved";

      }
      else return "error";
    }



    /*@PostMapping(path = "/add/{name}/{email}") // PathVariable
    public @ResponseBody String addNewUser(@PathVariable String name, @PathVariable String email) {
        System.out.println("name : "+ name);
        System.out.println("email : "+ email);
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request
        UserApp u = new UserApp();
        u.setName(name);
        u.setEmail( email);
        userRepository.save(u);
        return "Saved";
    }*/
    @GetMapping(path = "/all")
    public @ResponseBody Iterable<UserApp> getAllUsers() {
        // This returns a JSON or XML with the users
        return accountService.getAllUserApps();
    }
}