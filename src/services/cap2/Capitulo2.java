package services.cap2;

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

        System.out.println("ForEach default");
        for (User user : users) {
            System.out.println(user.getName());
        }

        System.out.println();
        System.out.println("ForEach Instantiating class Consumer");
        Consumer<User> display = new Consumer<User>() {
            @Override
            public void accept(User user) {
                System.out.println(user.getName());
            }
        };
        users.forEach(display);

        System.out.println();
        System.out.println("ForEach with param Consumer");
        users.forEach(new Consumer<User>() {
            @Override
            public void accept(User user) {
                System.out.println(user.getName());
            }
        });

        System.out.println();
        System.out.println("Lambda");
        Consumer<User> display1 = user -> System.out.println("Nome: " + user.getName());
        users.forEach(display1);

        System.out.println();
        System.out.println("ForEach with method Lambda and param Consumer simplified");
        users.forEach(u -> System.out.println(String.format("The name of user is %s", u.getName())));

        System.out.println();
        users.forEach(user -> user.makesModerator());
    }
}
