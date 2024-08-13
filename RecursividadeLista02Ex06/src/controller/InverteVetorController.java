package controller;

public class InverteVetorController {
	public InverteVetorController() {
		super();
	}
	
	public int[] inverter(int[] vet, int tamanho, int inicio) {
		if(inicio == tamanho || inicio > tamanho) {
			return vet;
		}else {
			int aux = vet[inicio];
			vet[inicio] = vet[tamanho];
			vet[tamanho] = aux;
			
			return inverter(vet, tamanho-1, inicio+1);
		}
	}
}
