package day7.examples;

public class Encap {
	
	Friend fr;
	
	public Encap(Friend fr) {
		this.fr=fr;
	}
	
	public void tellme() {
		
		switch(fr) {
		
		case AHMET:
		System.out.println("bağcılar style-tırrek-şu müziğin sesini aç ya");
		break;
		
		case OMER:
		System.out.println("spor önem... et mi lan o");
		break;
		
		case ALI:
		System.out.println("bi baktım ibre 190. dedim eee");
		break;
		
		case ENES:
		System.out.println("baba beni okula gönder");
		break;
		
		case BURAK:
		System.out.println("ooo kardeş afiyet olsun. tamam bize verm.. e hadi alayım biraz");
		break;
		
		case SUHEYL:
		System.out.println("olm Kur'an'da yazmıyo cahil yok öyle bişey");
		break;
		
		default:
		System.out.println("la senin ortalaman kaç kopek");
		break;
		}
	
	}
	
	public static void main(String[] args) {
		
		Encap en=new Encap(Friend.AHMET);
		en.tellme();
		
		Encap en1=new Encap(Friend.OMER);
		en1.tellme();

		Encap en2=new Encap(Friend.ALI);
		en2.tellme();
		
		Encap en3=new Encap(Friend.ENES);
		en3.tellme();
		
		Encap en4=new Encap(Friend.BURAK);
		en4.tellme();
		
		Encap en5=new Encap(Friend.SUHEYL);
		en5.tellme();
		
		Encap en6=new Encap(Friend.SELMAN);
		en6.tellme();
	}

}
