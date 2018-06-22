package oo.polimorfismo;

/**
 * @author BRUNA
 * Peso em KG
 */
public class Pessoa {
 
	private double peso = 0;
	
	
	public Pessoa (double pesoInicial){
		this.peso = pesoInicial;
	}
	public double getPeso(){
		return peso;
	}
	public void comer(Arroz arroz){
		this.peso += arroz.getPeso();
	}
	public void comer (Feijao feijao){
		this.peso += feijao.getPeso();
	}
	
}
