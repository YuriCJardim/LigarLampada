package teste.exercicio.orientação.objeto;

import java.util.Scanner;

import entities.Lampadas;

public class LigarLampada {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Lampadas lamp = new Lampadas();
		lamp.ligar();
		
		lamp.mostrarEstado();
		
		sc.close();
	}

}
