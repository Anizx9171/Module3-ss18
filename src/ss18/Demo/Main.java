package ss18.Demo;

import java.util.Random;

public class Main extends Thread{
    public static void main(String[] args) {
        Thread th3 = new Thread(new RunnableImpl("runnable"));
//        th3.start();
        System.out.println("end");
        Random gan = new Random();
        for (int i = 0; i < 10; i++) {
            long id = gan.nextLong();
            if(id < 0){
                System.out.println((id*-1));
                continue;
            }
            System.out.println(id);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("name: " + i);
        }
    }
}