package ss18.Demo;

public class RunnableImpl implements Runnable{
    String name;

    public RunnableImpl(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("hello");
        }
    }
}
