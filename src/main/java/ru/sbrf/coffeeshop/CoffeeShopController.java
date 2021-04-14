package ru.sbrf.coffeeshop;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class CoffeeShopController {

    private static int checker = 0;
    private static ArrayList<User> users;


    @RequestMapping("/coffeeshop/auth")
    @PostMapping
    public HashMap<String, Object> userAuth(@RequestParam String login) {
        User user = new User();
        HashMap<String, Object> hm = new HashMap<>();
        hm.put("status: ", BD.addUser(user));
        hm.put("user: ", user.getId() == 0 ? "User wasn't added" : user);

        return hm;
    }

    @RequestMapping("/coffeeshop/users")
    @GetMapping
    public ArrayList<User> getUsers() {
        return BD.getUsers();
    }


}
