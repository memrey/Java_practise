package day3.examples;

public class MyThread extends Thread {
    private int    end;
    private String name;

    public MyThread(String name, int end) {
        this.end = end;
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < end; i++) {
            System.out.println(name + " : " + i);
        }
    }
   
}
