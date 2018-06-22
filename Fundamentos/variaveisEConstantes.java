package Fundamentos;

public class variaveisEConstantes {
	public static void main(String[] args) {
		double raio  = 4.5;
		final double PI = 3.1416; //final quer dizer que estou criando uma constante
		double area = PI *raio * raio;
		
		System.out.println ("A área é " + area + " m2.");
		//m2. é o metros ao quadrado
		System.out.printf ("A área é %f m2.\n", area);		
		//o printf  
		//\n pula linha
		//%f - ele vai colocar o numero como flutuante, ou seja ele vai substituir o %f pela variavel
		System.out.printf ("A área é %.2f m2.", area);
		//%.2f - diz para o programa que eu quero so as duas casas apos a virgula
	}
}
