package oo.polimorfismo;

/**
 * @author BRUNA
 * Peso em Kg
 */
public class Comida {

 
	private double peso = 0;
	
	public double getPeso (){
		return peso;
	}
	
	public void setPeso (double peso) {
		if (peso>0){
			this.peso = peso;
			
		}
	}
	
	
}
