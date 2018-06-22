package colecoes;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		//Set<String> aprovados = new HashSet<String>();   O HashSet nao respeita a ordem de inserção
		//Set<String> aprovados = new LinkedHashSet<>(); // LinkedHashSet respeita a ordem de inserção
		Set<String> aprovados = new TreeSet <>(); // o TreeSet respeita a ordem alfabetica
		
		aprovados.add("Joao");
		aprovados.add("Pedro");
		aprovados.add("Maria");
		aprovados.add("Rafael");
		
		
		for (String nome: aprovados){
			System.out.println(nome);
			;
			
		}
		
		
	}
}
