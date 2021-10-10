package application;
import java.util.Scanner;

public class Menu{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x, y, tempo, n;
		double w, z, t;
		int opcao;
		boolean resposta = true;
		while (resposta == true) {
			System.out.println("");
			System.out.println("1-Soma de dois números Inteiros");
			System.out.println("2-Áreas");
			System.out.println("3-Raiz Quadrada - Potencia - Vlr Absoluto");
			System.out.println("4-if - switch - comparação - dia de semana");
			System.out.println("5-Mod de uma divisão");
			System.out.println("6-Temperatura");
			System.out.println("7-Senha");
			System.out.println("8-Quadrantes");
			System.out.println("9-Posto de Gasolina");
			System.out.println("10-String bom dia");
			System.out.println("11-Tempo de jogo");
			System.out.println("12-Pedidos (if e switch)");
			System.out.println("13-FOR exemplos ");
			System.out.println("14-");
			System.out.println("15-");

			System.out.println("0-sair");
			System.out.println("");
			System.out.print("Digite a opção: ");

			opcao = sc.nextInt();
//			for (int i = 0; i < 50; ++i) System.out.println ();

			switch (opcao) {
			case 0:
				resposta = false;
				System.out.println("fim");
				break;
			case 1:
				System.out.println("=============================");
				System.out.println("Soma de dois números Inteiros");
				System.out.println("Digite dois números Inteiros: ");
				x = sc.nextInt();
				y = sc.nextInt();
				System.out.println("Soma = " + (x + y));
				System.out.println("=============================");
				break;
			case 2:
				System.out.println("=============================");
				System.out.println("Áreas");
				w = sc.nextDouble();
				z = sc.nextDouble();
				t = sc.nextDouble();
				System.out.println("Área Triangulo = " + (w * t) / 2);
				System.out.println("Área Círculo = " + (3.14159 * t * t));
				System.out.println("Área Trapézio = " + (w + z) / 2 * t);
				System.out.println("Área Quadrado = " + (z * z));
				System.out.println("Área Retangulo = " + (w * z));
				System.out.println("============================");
				break;
			case 3:
				System.out.println("============================");
				System.out.println("Raiz Quadrada - valor absoluto - potencia");
				w = sc.nextDouble();
				z = sc.nextDouble();
				t = sc.nextDouble();
				System.out.printf("Raiz = %.2f%n", Math.sqrt(z));

				double A, B, C;
				A = Math.sqrt(w);
				B = Math.sqrt(z);
				C = Math.sqrt(t);
				System.out.println("Raiz quadrada de " + w + " = " + A);
				System.out.println("Raiz quadrada de " + z + " = " + B);
				System.out.println("Raiz quadrada de " + t + " = " + C);
				A = Math.pow(w, t);
				B = Math.pow(w, z);
				C = Math.pow(t, z);
				System.out.println(w + " elevado a " + t + " = " + A);
				System.out.println(w + " elevado a " + z + " = " + B);
				System.out.println(t + " elevado a " + z + " = " + C);
				A = Math.abs(w);
				B = Math.abs(t);
				C = Math.abs(z);
				System.out.println("Valor absoluto de " + w + " = " + A);
				System.out.println("Valor absoluto de " + t + " = " + B);
				System.out.println("Valor absoluto de " + z + " = " + C);
				System.out.println("============================");
				break;
			case 4:
				x = sc.nextInt();
				String dia;
				if (x == 1) {
					dia = "domingo";
				} else if (x == 2) {
					dia = "segunda";
				} else if (x == 3) {
					dia = "terca";
				} else if (x == 4) {
					dia = "quarta";
				} else if (x == 5) {
					dia = "quinta";
				} else if (x == 6) {
					dia = "sexta";
				} else if (x == 7) {
					dia = "sabado";
				} else {
					dia = "valor invalido";
				}
				System.out.println("Dia da semana: " + dia);
				switch (x) {
				case 1:
					dia = "domingo";
					break;
				case 2:
					dia = "segunda";
					break;
				case 3:
					dia = "terca";
					break;
				case 4:
					dia = "quarta";
					break;
				case 5:
					dia = "quinta";
					break;
				case 6:
					dia = "sexta";
					break;
				case 7:
					dia = "sabado";
					break;
				default:
					dia = "valor invalido";
					break;
				}
				System.out.println("Dia da semana: " + dia);
				break;
			case 5:
				System.out.println("============================");
				System.out.println("Mod de uma divisão");
				x = sc.nextInt();
				y = sc.nextInt();
				System.out.println("Mod = " + (x % y));
				System.out.println("============================");

				break;
			case 6:
				System.out.println("============================");
				System.out.println("Temperatura C -> F%n");
				w = sc.nextDouble();
				System.out.printf("%.2f Cº = %.2f Fº%n", w, (9 * w / 5 + 32));
				System.out.print("============================");
				break;
			case 7:
				System.out.println("============================");
				System.out.print("Digite a senha: ");
				w = sc.nextDouble();
				while (w != 2002) {
					System.out.printf("Senha Invalida");
					w = sc.nextDouble();
				}
				System.out.printf("Acesso permitido");
				System.out.println("============================");
				break;
			case 8:
				System.out.println("============================");
				System.out.print("Coordenadas");
				System.out.println("Digite x,y: ");
				x = 1;
				y = 1;
				while (x != 0 || y != 0) {
					x = sc.nextInt();
					y = sc.nextInt();
					if (x == 0.0 && y == 0.0) {
						System.out.println("Origem");
					} else if (x == 0.0) {
						System.out.println("Eixo Y");
					} else if (y == 0.0) {
						System.out.println("Eixo X");
					} else if (x > 0.0 && y > 0.0) {
						System.out.println("Q1");
					} else if (x < 0.0 && y > 0.0) {
						System.out.println("Q2");
					} else if (x < 0.0 && y < 0.0) {
						System.out.println("Q3");
					} else {
						System.out.println("Q4");
					}
				}
				System.out.println("============================");
				break;
			case 9:
				System.out.println("============================");
				System.out.println("Posto Umbara Ltda: ");

				System.out.println("Digite o combustivel: ");

				int gasolina = 0;
				int alcool = 0;
				int diesel = 0;
				x = sc.nextInt();
				while (x != 4) {
					switch (x) {
					case 1:
						gasolina = gasolina + 1;
						break;
					case 2:
						alcool = alcool + 1;
						break;
					case 3:
						diesel = diesel + 1;
						break;
					case 4:
						break;
					default:
						System.out.printf("MUITO OBRIGADO");
					}
					x = sc.nextInt();
				}
				System.out.println("GASOLINA = " + gasolina);
				System.out.println("ALCOOL = " + alcool);
				System.out.println("DIESEL = = " + diesel);
				System.out.println("============================");
				break;
			case 10:
				String s1, s2, s3;
				s1 = sc.nextLine();
				s2 = sc.nextLine();
				s3 = sc.nextLine();
				System.out.println("DADOS DIGITADOS:");
				System.out.println(s1);
				System.out.println(s2);
				System.out.println(s3);
				break;
			case 11:
				x = sc.nextInt();
				y = sc.nextInt();
				if (x < y) {
					tempo = y - x;
				} else {
					tempo = 24 - x + y;
				}
				System.out.println("O jogo durou: " + tempo + " horas");
				break;
			case 12:
				x = sc.nextInt();
				y = sc.nextInt();
				w = 0;
				switch (x) {
				case 1:
					w = y * 4.00;
					break;
				case 2:
					w = y * 4.50;
					break;
				case 3:
					w = y * 5.00;
					break;
				case 4:
					w = y * 2.00;
					break;
				case 5:
					w = y * 1.50;
					break;
				default:
					break;
				}
				System.out.println("Total R$: " + w);
				if (x == 1) {
					w = y * 4;
				} else if (x == 2) {
					w = y * 4.50;
				} else if (x == 3) {
					w = y * 5;
				} else if (x == 4) {
					w = y * 2;
				} else if (x == 5) {
					w = y * 1.50;
				}
				System.out.println("Total R$: " + w);
			case 13:
				System.out.println("Par ou Impar");
				x = sc.nextInt();
				for (int i = 1 ; i <= x ; i++) {
					if ( i % 2 == 0) {
						System.out.println(i + " é Par");
					} else {
						System.out.println(i + " é Impar");
					}
				}

				System.out.println("In ou Out [10, 20]");
				int in = 0;
				int out = 0;
				x = sc.nextInt();
				for (int i = 1 ; i <= x ; i++) {
					y = sc.nextInt();
					if ( y >= 10 && y <=20) {
						in += 1;
					} else {
						out +=1;
					}
				}
				System.out.println("Dentro: " + in + " Fora: " + out);

				System.out.println("divisao impossivel");
				n = sc.nextInt();
				for (int i=0; i<n; i++) {
					x = sc.nextInt();
					y = sc.nextInt();

					if (y == 0) {
						System.out.println("divisao impossivel");
					}
					else {
						double div = (double) x / y;
						System.out.printf("%.1f%n", div);
					}
				}
				
				System.out.println("Fatorial");
				x = sc.nextInt();
				int fat = 1;
				for (int i = x ; i >= 1 ; i--) {
					fat = i * fat;
				}
				System.out.println(fat);
				break;
			default:
				System.out.println("============================");
				System.out.println("Valor invalido");
				System.out.println("============================");
			}
		}
		sc.close();
	}
}