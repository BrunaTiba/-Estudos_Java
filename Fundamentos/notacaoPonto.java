package Fundamentos;

public class notacaoPonto {

	public static void main(String[] args) {
		
		String s = "Bom dia ?".toUpperCase().replace("?", "Bia").concat("!");
				//as strings no java que tem aspas duplas e considerada um objeto
				//e sempre que tem objeto e coloca o . ele vai mostrar um conjunto de coisas
				// essas coisa são dados ou comportamentos
				//toUpperCase que é um comportamento
				//sempre que o identificador comecar com minuscula é um comportamento
				//um comportamento recebe um dado e retorna um dado
				//. replace e o retorno desse compormtamento, no caso trocamos o ? por bia
				//dps faco a concatenação com !
	
		System.out.println(s);
		//out e um dado e o println e um comportamento
	}
}
