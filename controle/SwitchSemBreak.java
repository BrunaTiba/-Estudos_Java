package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {
		String faixa = "amarela";
		
		switch (faixa.toLowerCase()){
		case "preta":
			System.out.println("Sei fazer o 'Bassai-dai/Join/Kanku-Dai'");
		case "marrom":
			System.out.println("Sei fazer o 'Tekki Shodan'");
		case "roxa":
			System.out.println("Sei fazer o 'Heian Godan'");
		case "verde":
			System.out.println("Sei fazer o 'Heian Yondan'");
		case "laranja":
			System.out.println("Sei fazer o 'Heian Sandan'");
		case "vermelha":
			System.out.println("Sei fazer o 'Heian Nidan'");
		case "amarela":
			System.out.println("Sei fazer o 'Hein Shodan'");
		default:
			System.out.println("Não sei nada");
			
			
		}
	}
	
}
