package day1.examples;

import day1.examples.men.student;

class men{
	
	int age;
	int height;
	private student no;
	public men veli;
	static int counter=0;
	public men(){
		
		counter++;
		
	}
	public men(student no){
		veli.no=no;
	}
	public men(int age,int height) {
		
		this();
		this.age=age;
		this.height=height;
		//System.out.println(counter);
	}
	
	static int getCounter() {
		return counter;
	}
	static void setCounter(int counter) {
		men.counter = counter;
	}

	class student{
		
		int no=701;
			class caliskan{
				
				int no=257;
				
				void ayikla(int no) {
					
					System.out.println(no);
					System.out.println(this.no);
					System.out.println(student.this.no);
				}
			}
	}
	
		
}

public class AcmeBisiklet implements bisiklet {
	
	int hiz;
	int vites;
	
	public void vitesdegistir(int deger) {
		
		vites=deger;
	}
	public void hizlan(int artis) {
		
		hiz=hiz+artis;
	}
	public void yavasla(int azalis) {
		
		hiz=hiz-azalis;
	}

	public static void main(String[] args) {
		
		AcmeBisiklet ac=new AcmeBisiklet();
		ac.hiz=40;
		ac.vites=2;
		ac.vitesdegistir(3);
		ac.hizlan(10);
		System.out.println(ac.vites +" "+ ac.hiz);
		ac.yavasla(15);
		System.out.println(ac.hiz);
		men jack=new men();
		men john=new men(14,150);
		System.out.println(jack.getCounter());
		
		/*System.out.println(john.age +" "+john.height);
		
		men tekin=new men();
		men.student metin=tekin.new student();
		men.student.caliskan emre=metin.new caliskan();
		emre.ayikla(738);
		*/
	}

}
