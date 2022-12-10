package services;

import entities.User;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Capitulo2 {

    public static void main(String[] args) {

        User user1 = new User("Felipe Moreira", 150);
        User user2 = new User("Felipe Silva", 120);
        User user3 = new User("Felipe Moreira da Silva", 190);

        List<User> users = Arrays.asList(user1, user2, user3);

        for (User user : users) {
            System.out.println(user.getName());
        }

        System.out.println();
        Consumer<User> display = new Consumer<User>() {
            @Override
            public void accept(User user) {
                System.out.println(user.getName());
            }
        };
        users.forEach(display);

        System.out.println();
        users.forEach(new Consumer<User>() {
            @Override
            public void accept(User user) {
                System.out.println(user.getName());
            }
        });

        System.out.println();
        users.forEach(u -> System.out.println(u.getName()));
    }
}
