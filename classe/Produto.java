package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto;
	
	Produto(){
		
	}
	Produto (String nome, double preco, double desconto ){
	this.nome = nome;
	this.preco = preco;
	
		
	}
	double precoComDesconto (){
		return preco - preco * desconto;
	}
}
