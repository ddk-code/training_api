package ru.sbrf.coffeeshop;

public class User {
    private static int counter = 0;
    private int id;
    private String login;

    public User(String login) {
        this.login = login;
        this.id = ++counter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        counter += 1;
        this.id = counter;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

}
