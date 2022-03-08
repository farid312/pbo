package tugas;
import java.util.Scanner; 
public class TugasE2c{
	 public static void main(String[] args) {
		
	       double volume, phi=3.14;
	       int d, t;

	       
	       Scanner input=new Scanner(System.in);
	       System.out.print("Masukan diameter : ");
	       d= input.nextInt();
	       System.out.print("Masukan Tinggi : ");
	       t= input.nextInt();	
	       volume=phi*d*t;

	       System.out.println("Volume Tabung = "+volume);
	    } 
	}