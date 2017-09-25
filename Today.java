package day4.examples;

public class Today {

	private static int count=0;
	public synchronized static void inccount() {
		
		count++;
	}
	
	class myException extends Exception{
		
	}
	class deneme{
		void f(int x) throws myException{
			
			throw new myException();
		}
	}
	public static void main(String[] args) {
		
		try {
			int x=10;
			int []a=new int[x];
			System.out.println(a[19]);
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("array size is wrong");
		}
			
		
		Thread t1=new Thread(new Runnable() {
		public void run() {
			
			for(int i=0;i<1000;i++) {
				inccount();
			}
		}

	});
		Thread t2=new Thread(new Runnable() {
			public void run() {
				
				for(int i=0;i<1000;i++) {
					inccount();
				}
			}

		});
		
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("value : "+count);
		Today f=new Today();
		Today.deneme dn=f.new deneme();
		try {
			dn.f(5);
		} catch (myException e) {
			
			//e.printStackTrace();
		}
		
	}
}


