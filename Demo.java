package day3.examples;


class MyClass extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getId()+" thread "+i);
			try {
				Thread.sleep(80);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	
}}

public class Demo {

	public static void main(String[] args) {
		MyClass mc=new MyClass();
		mc.start();
		MyClass mc1=new MyClass();
		mc1.start();
		
		
	

	}

}
