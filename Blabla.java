package day3.examples;

public  class Blabla {
	
	static boolean sigara;
	static int cancer;

	public boolean isSigara() {
		return sigara;
	}

	public void setSigara(boolean sigara) {
		this.sigara = sigara;
	}
	
	static void cal(boolean sigara) {
		
		if(sigara==true) {
			cancer++;
		}
		else {
			cancer=0;
		}
	}
	
	public static void main(String []args) {
		
		Blabla as=new Blabla();
		//System.out.println(as.isSigara());
		cal(false);
		cal(true);
		cal(true);
		System.out.println(as.cancer);
		
		
	}

}
