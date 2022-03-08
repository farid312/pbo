package tugas;
import java.util.Scanner; 
public class TugasE2a{
	 public static void main(String[] args) {

	       double Keliling, phi=3.14;
	       int d;
	       
	       Scanner input=new Scanner(System.in);
	       System.out.print("Masukan Diameter : ");
	       d= input.nextInt();
	       Keliling=phi*d;
	       System.out.println("Keliling Lingkaran = "+Keliling);
	    } 
	}