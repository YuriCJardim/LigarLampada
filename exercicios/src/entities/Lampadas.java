package entities;

public class Lampadas {

	public boolean ligada;

	public void ligar() {
		ligada = true;
	}

	public void desligar() {
		ligada = false;

	}

	public void mostrarEstado() {
		if (ligada) {
			System.out.println("A lampada est� ligada!");
		} else {
			System.out.println("A lampada est� desligada!");
		}
	}
		public void trocarEstado() {
			if(ligada) {
				desligar();
			} else {
				ligar();
			}

		}
	}
	


