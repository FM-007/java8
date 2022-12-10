package services.cap3;

public class Capitulo3 {

    public static void main(String[] args) {

//        Runnable runnable = new Runnable() {
//            public void run() {
//                for (int i = 0; i <= 100; i++) {
//                    System.out.println(i);
//                }
//            }
//        };

//        Runnable runnable1 = () -> {
//            for (int i = 0; i <= 100; i++) {
//                System.out.println(i);
//            }
//        };
//
//        new Thread(runnable1).start();

        new Thread(() -> {
           for (int i = 0; i <= 100; i++) {
               System.out.println(i);
           }
        }).start();
    }
}
