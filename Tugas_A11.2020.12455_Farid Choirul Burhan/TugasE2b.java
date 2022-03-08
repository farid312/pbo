package tugas;
import java.util.Scanner; 
public class TugasE2b{
	 public static void main(String[] args) {
		
	       double luas, phi=3.14;
	       int alas, tinggi;

	      
	       Scanner input=new Scanner(System.in);
	       System.out.print("Masukan Alas : ");
	       alas= input.nextInt();
	       System.out.print("Masukan Tinggi : ");
	       tinggi= input.nextInt();
	       luas=alas*tinggi/2;
	       //Tampilkan hasil
	       System.out.println("Luas Segitiga = "+luas);
	    } 
	}