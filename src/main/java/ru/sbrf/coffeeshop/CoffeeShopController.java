package ru.sbrf.coffeeshop;

import org.springframework.web.bind.annotation.*;

@RestController
public class CoffeeShopController {

    private static int checker;
    private static String currentLogin;


    @RequestMapping("/coffeeshop/auth")
    @PostMapping
    public String userAuth(@RequestParam String login) {
        checker += 1;
        if (currentLogin == null) {
            currentLogin = login;
        }
        if (login.equals(currentLogin) && checker == 1) {
            return "Input login: " + login + "\nUser was successfully authorized";
        } else if (!login.equals(currentLogin)) {
            restart();
            return "Input login: " + login +
                    "\nERROR" +
                    "\nCurrent session was opened for another user" +
                    "\nSession has been closed";
        }
        checker -= 1;
        return "Input login: " + login +
                "\nERROR" +
                "\nWrong operation!" +
                "\nChoose another operation or use /coffeeshop/restart (POST) to start again";
    }

    @RequestMapping("/coffeeshop/purchase")
    @PostMapping
    public String purchase(@RequestParam String login) {
        checker += 1;
        if (currentLogin == null) {
            checker -= 1;
            return "Input login: " + login +
                    "\nERROR!" +
                    "\nWrong operation! First you need to authorize" +
                    "\nAuthorize or use /coffeeshop/restart (POST) to start again";
        }
        if (login.equals(currentLogin) && checker == 2) {
            return "Input login: " + login + "\nUser has successfully made a purchase";
        } else if (!login.equals(currentLogin)) {
            restart();
            return "Input login: " + login +
                    "\nERROR" +
                    "\nCurrent session was opened for another user" +
                    "\nSession has been closed";
        }
        checker -= 1;
        return "Input login: " + login +
                "\nERROR" +
                "\nWrong operation!" +
                "\nChoose another operation or use /coffeeshop/restart (POST) to start again";
    }

    @RequestMapping("/coffeeshop/payment")
    @PostMapping
    public String payment(@RequestParam String login) {
        checker += 1;
        if (currentLogin == null) {
            checker -= 1;
            return "Input login: " + login +
                    "\nERROR!" +
                    "\nWrong operation! First you need to authorize" +
                    "\nAuthorize or use /coffeeshop/restart (POST) to start again";
        }
        if (login.equals(currentLogin) && checker == 3) {
            return "Input login: " + login + "\nUser has paid successfully";
        } else if (!login.equals(currentLogin)) {
            restart();
            return "Input login: " + login +
                    "\nERROR" +
                    "\nCurrent session was opened for another user" +
                    "\nSession has been closed";
        }
        checker -= 1;
        return "Input login: " + login +
                "\nERROR" +
                "\nWrong operation!" +
                "\nChoose another operation or use /coffeeshop/restart (POST) to start again";
    }

    @RequestMapping("/coffeeshop/feedback")
    @PostMapping
    public String feedback(@RequestParam String login) {
        checker += 1;
        if (currentLogin == null) {
            checker -= 1;
            return "Input login: " + login +
                    "\nERROR!" +
                    "\nWrong operation! First you need to authorize" +
                    "\nAuthorize or use /coffeeshop/restart (POST) to start again";
        }
        if (login.equals(currentLogin) && checker == 4) {
            restart();
            return "Input login: " + login + "\nUser has successfully feedbacked" +
                    "\n you can choose another user";
        } else if (!login.equals(currentLogin)) {
            restart();
            return "Input login: " + login +
                    "\nERROR" +
                    "\nCurrent session was opened for another user" +
                    "\nSession has been closed";
        }
        checker -= 1;
        return "Input login: " + login +
                "\nERROR" +
                "\nWrong operation!" +
                "\nChoose another operation or use /coffeeshop/restart (POST) to start again";
    }

    @RequestMapping("/coffeeshop/restart")
    @PostMapping
    private String restart() {
        currentLogin = null;
        checker = 0;
        return "System was restarted successfully";
    }

}
