package patikaOrnekler;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		double tutar, kdvOrani1 = 0.18, kdvOrani2 = 0.08, kdvliTutar, kdvTutari1, kdvTutari2, kdvTutari;
		Scanner input = new Scanner(System.in);
		System.out.print("Tutarı giriniz: ");
		tutar = input.nextDouble();
		boolean kosul = tutar > 0 && tutar < 1000;
		kdvTutari1 = (tutar * kdvOrani1);
		kdvTutari2 = tutar * kdvOrani2;
		kdvTutari = kosul ? kdvTutari1 : kdvTutari2;
		System.out.println("KDV tutarı: " + kdvTutari);
		kdvliTutar = tutar + kdvTutari;
		System.out.println("KDV'li tutar: " + kdvliTutar);
		System.out.println("KDV oranı1: " + kdvOrani1);
		System.out.println("KDV oranı2: " + kdvOrani2);

	}

}
