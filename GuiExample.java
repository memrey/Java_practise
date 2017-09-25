package day12.examples;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GuiExample {

	public static void main(String[] args) {
		
		String isim=JOptionPane.showInputDialog("lütfen isminizi giriniz");
		JOptionPane.showMessageDialog(null,"isminiz : "+isim);
		
		String deger1=JOptionPane.showInputDialog("ilk değeri giriniz");
		String deger2=JOptionPane.showInputDialog("ikinci değeri giriniz");
		
		int a=Integer.parseInt(deger1);
		int b=Integer.parseInt(deger2);
		int c=a*b;
		JOptionPane.showMessageDialog(null,"çarpım sonucu "+c);
		
		JFrame schema=new JFrame();
		schema.setTitle("ilk deneme");
		schema.setSize(300,250);
		schema.setLocation(100, 100);
		schema.setLayout(new FlowLayout());
		JLabel etiket=new JLabel("ilk etiket");
		etiket.setToolTipText("deneme");
		JTextField alan=new JTextField();
		alan.setText("             ");
		alan.setToolTipText("lütfen deger giriniz");
		schema.add(alan);
		schema.add(etiket);
		schema.setVisible(true);
		schema.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		
		JFrame frame=new JFrame("renkler");
		
		JPanel gui=new JPanel();
		gui.setLayout(null);
		
		
		JPanel yazilar=new JPanel();
		yazilar.setLayout(null);
		yazilar.setBackground(Color.black);
		yazilar.setLocation(10,0);
		yazilar.setSize(150,30);
		gui.add(yazilar);
		
		JPanel renkler=new JPanel();
		renkler.setLayout(null);
		renkler.setLocation(10,40);
		renkler.setSize(150,50);
		gui.add(renkler);
		
		JPanel redbox=new JPanel();
		redbox.setBackground(Color.red);
		redbox.setLocation(0,0);
		redbox.setSize(50, 50);
		renkler.add(redbox);
		
		JPanel whitebox=new JPanel();
		whitebox.setBackground(Color.white);
		whitebox.setLocation(100,0);
		whitebox.setSize(50,50);
		renkler.add(whitebox);
		
		JLabel red=new JLabel("kırmızı");
		red.setForeground(Color.red);
		red.setLocation(0,0);
		red.setSize(50,30);
		red.setHorizontalAlignment(0);
		yazilar.add(red);
		
		JLabel white=new JLabel("beyaz");
		white.setForeground(Color.white);
		white.setLocation(100,0);
		white.setSize(50,30);
		white.setHorizontalAlignment(0);
		yazilar.add(white);
		
		frame.setSize(250, 150);
		frame.setContentPane(gui);
		frame.setResizable(true);
		frame.setVisible(true);
		
		JFrame frame1=new JFrame("buton denemesi");
		frame1.setSize(300, 250);
		
		JPanel gui1=new JPanel();
		gui.setLayout(null);
		
		JPanel tree=new JPanel();
		tree.setLayout(null);
		tree.setLocation(10,10);
		tree.setSize(250,275);
		gui1.add(tree);
		
		JButton bt=new JButton();
		bt.setText("tıklayınız");
		bt.setSize(120,20);
		bt.setLocation(70,20);
		bt.setHorizontalAlignment(0);
		tree.add(bt);
		
		ImageIcon ic=new ImageIcon("C:\\Users\\mustafa.yilmaz\\eclipse-workspace\\FirstProject\\src\\New folder\\download.jpg");
		
		JButton btn=new JButton();
		btn.setText("tıklamayınız");
		btn.setLocation(70,45);
		btn.setSize(120,20);
		btn.setHorizontalAlignment(0);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane jop=new JOptionPane(); 
				jop.showMessageDialog(null,"tıklamasana olm");
				System.out.println("bak yine bastı");
			}

		});
		tree.add(btn);
		
		JButton dugme=new JButton();
		dugme.setText("tıklayınız");
		dugme.setSize(120,20);
		dugme.setLocation(70,65);
		dugme.setHorizontalAlignment(0);
		Color eski_renk=dugme.getBackground();
		dugme.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent a) {
				dugme.setBackground(Color.red);
				super.mouseEntered(a);
			}
			public void mouseExited(MouseEvent b) {
				dugme.setBackground(eski_renk);
				super.mouseExited(b);
			}
		});
		tree.add(dugme);
		
		
		
		
		frame1.setContentPane(gui1);
		frame1.setResizable(true);
		frame1.setVisible(true);
		
		
		JFrame frame2=new JFrame("box");
		frame2.setSize(300, 250);
		
		JPanel cb=new JPanel();
		JLabel et=new JLabel("hangi cephane");
		cb.add(et);
		
		ImageIcon kilic=new ImageIcon("C:\\Users\\mustafa.yilmaz\\eclipse-workspace\\FirstProject\\src\\New folder\\download.jpg");
		Image yeni_kilic=kilic.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		kilic=new ImageIcon(yeni_kilic);
		
		ImageIcon kalkan=new ImageIcon("C:\\Users\\mustafa.yilmaz\\eclipse-workspace\\FirstProject\\src\\New folder\\download2.jpg");
		Image yeni_kalkan=kalkan.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		kalkan=new ImageIcon(yeni_kalkan);
		
		JCheckBox sword=new JCheckBox("kılıç",kilic);
		JCheckBox shield=new JCheckBox("kalkan",kalkan);
		
		cb.add(sword);
		cb.add(shield);
		frame2.setContentPane(cb);
		frame2.setResizable(true);
		frame2.setVisible(true);
		
		
	}

}
