package view;

import controller.InverteVetorController;

public class Principal {

	public static void main(String[] args) {
		InverteVetorController ivc = new InverteVetorController();
		
		int[] vet = {4, 7, 5, 12, 94, 1, 2, 3, 9, 8};
		int tamanho = vet.length - 1;
		
		int[] inVet = ivc.inverter(vet, tamanho, 0);
		
		System.out.print("Vetor invertido [");
		for(int valor : inVet) {
			tamanho -= 1;
			if(tamanho >= 0) {
				System.out.print(valor+ ", ");
			}else {
				System.out.print(valor+ "]");
			}
			
		}
			
	}

}
