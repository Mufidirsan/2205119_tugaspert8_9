package tugas.pertemuan.pkg8.pkg9;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        	
		Scanner input = new Scanner(System.in);           
		
		System.out.print("Masukan 3 sisi pada segitiga: ");
		double sisi1 = input.nextDouble();		
		double sisi2 = input.nextDouble();		
		double sisi3 = input.nextDouble();
		
		System.out.print("masukan warna: ");
		String warna = input.next();
	
		System.out.print("Apakah segitiga Terisi (true / false)? ");
		boolean filled = input.nextBoolean();

		
		Segitiga triangle = new Segitiga(sisi1, sisi2, sisi3);
		triangle.setWarna(warna);
		triangle.setfilled(filled);

		System.out.println(triangle.toString());
		System.out.println("Luas: " + triangle.getLuas());
		System.out.println("Keliling: " + triangle.getKeliling());
		System.out.println("warna: " + triangle.getWarna());
		System.out.println("Segitiga adalah" + (triangle.filled() ? "" : " not ") 
			+ "filled");
    }
    
}
