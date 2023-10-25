package ss18.bt;

public class Bt1 implements Runnable{
    public static void main(String[] args) {
        Thread newThread = new Thread(new Bt1());
        newThread.start();
    }

    @Override
    public void run(){
        try {
            numberShow();
        }catch (InterruptedException e){
            System.out.println("error");
        }
    }

    private void numberShow() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            Thread.sleep(500);
        }
    }
}
