package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionarios;
import entities.Quartos;

public class Listas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionarios> list = new ArrayList<>();
		
		System.out.print("Quantos Funcionarios: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			sc.nextLine();

			System.out.println();
			System.out.println("Funcionario # "+ i);
			System.out.print("ID: ");
			int id = sc.nextInt();
			
			while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			list.add(new Funcionarios (id, nome, salary));
			
		}
		System.out.println();
		
		System.out.println("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		
		Funcionarios emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (emp == null) {
			System.out.println("Não existe");
		}else {
			System.out.println("Porcento: ");
			double porcentagem = sc.nextDouble();
			emp.increaseSalary(porcentagem);
		}
		
		System.out.println();
		
		for (Funcionarios x : list) {
			System.out.println(x);
			}
	
		sc.close();
	
	}
	public static boolean hasId(List<Funcionarios> list, int id) {
		Funcionarios emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
