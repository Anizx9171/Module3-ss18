package ss18.bt;

public class Bt2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    if (i % 2 != 0){
                        System.out.println(i);
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException ignored) {}
                    }
                }
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    if (i % 2 == 0){
                        System.out.println(i);
                        try {
                            Thread.sleep(15);
                        } catch (InterruptedException ignored) {}
                    }
                }
            }
        };
        try {
            t1.start();
            t1.join();
            t2.start();
            t2.join();
        }catch (InterruptedException e){
            System.out.println("Lỗi ");
        }
    }
}
