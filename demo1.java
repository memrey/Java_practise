package day3.examples;

class MyClass1 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getId() +" thread "+i);
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}

public class demo1{

	public static void main(String[] args) {
		
		Thread t1=new Thread(new MyClass1());
		Thread t2=new Thread(new MyClass1());
		t1.start();
		t2.start();
		
		

	}

}
