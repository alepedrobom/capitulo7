package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Quartos;

public class Hotel {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Quartos[] vect= new Quartos[10];
		
		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			
			System.out.println("Nome: ");
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Quarto: ");
			int quarto = sc.nextInt();
			
			vect[quarto] = new Quartos(name, email);
		}

		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(i +"; " + vect[i]);
			}
		}
	
		sc.close();
	}

}
