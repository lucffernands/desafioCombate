package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
        
		Champion c1 = new Champion();
		Champion c2 = new Champion();

		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		c1.name = sc.nextLine();
		System.out.print("Vida inicial: ");
		c1.life = sc.nextInt();
		System.out.print("Ataque: ");
		c1.attack = sc.nextInt();
		System.out.print("Armadura: ");
		c1.armor = sc.nextInt();

		System.out.println();
		System.out.println("Digite os dados do segundo campeão:");
		System.out.print("Nome: ");
		sc.nextLine();
		c2.name = sc.nextLine();
		System.out.print("Vida inicial: ");
		c2.life = sc.nextInt();
		System.out.print("Ataque: ");
		c2.attack = sc.nextInt();
		System.out.print("Armadura: ");
		c2.armor = sc.nextInt();

		System.out.println();
		System.out.print("Quantos turnos você deseja executar? ");
		int n = sc.nextInt();
		for (int i = 0; i < n; ++i) {		
				c1.takeDamage(c2);
				c2.takeDamage(c1);
				System.out.println();
				System.out.println("Resultado do turno " + (i + 1) + ":");
				System.out.println(c1.status());
				System.out.println(c2.status());
				
				if (c1.life <= 0 || c2.life <= 0) {
					i = n;
				}
		}

		System.out.println();
		System.out.println("FIM DO COMBATE");

		sc.close();

	}

}
