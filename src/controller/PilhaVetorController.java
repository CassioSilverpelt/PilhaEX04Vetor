package controller;

import model.*;

public class PilhaVetorController {

	public PilhaVetorController() {
		super();
	}
	
	Pilha p = new Pilha();
	
	public void percorreVetor(int[] vetor) {
		for (int a : vetor) {
			if (a >= 0) {
				p.push(a);
			} else {
				try {
					int y = p.pop();
					int x = p.pop();
					p.push(a);
					p.push(x+y);
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
			}
		}
		
		try {
			System.out.println(p.size());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}

}
