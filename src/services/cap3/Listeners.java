package services.cap3;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listeners {

    public static void main(String[] args) {

        Button button = new Button();

        System.out.println("Default form");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Event action click");
            }
        });

        System.out.println();
        System.out.println("Form using Lambda");
        button.addActionListener(event -> System.out.println("Event action click"));

    }
}
