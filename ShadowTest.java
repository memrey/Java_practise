package day2.examples;

import day1.examples.Insan;

class ogrenci extends Insan implements Cloneable{
	
	 Object kopyala() throws CloneNotSupportedException{
		
		return this.clone();
	}
}

public class ShadowTest {
	
	int x=0;
	
	class FirstLevel{
		
		int x=1;
		
		void method(int x) {
			
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(ShadowTest.this.x);
		}
	}
	


	public static void main(String[] args) throws CloneNotSupportedException {
		
		ShadowTest st=new ShadowTest();
		ShadowTest.FirstLevel fl=st.new FirstLevel();
		fl.method(23);
		
		
		ogrenci ayse=new ogrenci();
		ayse.boy=160;
		ogrenci ali=(ogrenci) ayse.kopyala();
		System.out.println(ayse.boy);
		System.out.println(ali.boy);
		ali.boy=180;
		System.out.println(ali.boy);
		
		
	}


}
