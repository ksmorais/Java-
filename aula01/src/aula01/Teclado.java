package aula01;
import java.util.Scanner;

public class Teclado {
	public static void main(String[] args ) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Digite seu nome: ") ;
	String name = scanner.nextLine() ;
	System.out.println("Digite sua idade: ");
	int idade = scanner.nextInt();
	System.out.print("Nome:" + name);
	System.out.print("Idade:" + idade);
	scanner.close();
		}
	}

