package modelo;

import java.util.ArrayList;

public class Funcionario {
	public void mover(Transportavel transportavel) {
		System.out.print("funcionario movendo = ");
		transportavel.transportar();
	}

	public void mover(ArrayList<Transportavel> transportaveis) {
		for (Transportavel transportavel : transportaveis) {
			mover(transportavel);
		}
	}
}
