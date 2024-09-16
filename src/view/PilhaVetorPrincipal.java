package view;

import controller.PilhaVetorController;

public class PilhaVetorPrincipal {

	public static void main(String[] args) {
		
		PilhaVetorController pvetCon = new PilhaVetorController();
		int[] vetor1 = {0, 5, 7, -4, 3, 5, -2, -1, 10, 4, 3, -6, 2, -9, 1, -5};
		
		pvetCon.percorreVetor(vetor1);

	}

}
