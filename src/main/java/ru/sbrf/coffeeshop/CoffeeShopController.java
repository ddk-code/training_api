package ru.sbrf.coffeeshop;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class CoffeeShopController {

//    private static int checker = 0;
    private static final ArrayList<User> users = new ArrayList<>();
    private static Processes process = Processes.AUTHORIZATION;


    @RequestMapping("/coffeeshop/auth")
    @PostMapping
    public HashMap<String, Object> userAuth(@RequestParam String login) {
//        checker += 1;
        HashMap<String, Object> hm = new HashMap<>();
        if (!isUserExist(login) && process == Processes.AUTHORIZATION ) {
            User user = new User(login);
            users.add(user);
            hm.put(process.successMsg, user);
        } else {
            hm.put(process.failMsg, "user wasn't added");
        }
        process = Processes.PURCHASE;
        return hm;
    }

    private static boolean isUserExist(String login) {
        for (User user : users) {
            if (user.getLogin().equals(login)) {
                return true;
            }
        }
        return false;
    }


//    @RequestMapping("/coffeeshop/users")
//    @GetMapping
//    public ArrayList<User> getUsers() {
//        return BD.getUsers();
//    }
//

}
