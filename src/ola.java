import java.util.Locale;
import java.util.Scanner;

public class ola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int escolaridade,experiencia;
		char viagem,carteira;
		
		System.out.println("Qual sua escolaridade?");
		System.out.println("1) ensino fundamental");
		System.out.println("2) ensino Medio");
		System.out.println("3) ensino superior");
		System.out.println("4) pós graduação");
		System.out.print("digite uma opção:");
		escolaridade = sc.nextInt();
		
		if(escolaridade == 1) {
			escolaridade = 0;
			escolaridade = escolaridade + 10;
			}
		else if(escolaridade == 2) {
			escolaridade = 0;
			escolaridade = escolaridade + 20;
			}
		else if(escolaridade == 3) {
			escolaridade = 0;
			escolaridade = escolaridade + 30 ;
			}
		else if(escolaridade == 4) {
			escolaridade = 0;
			escolaridade = escolaridade + 40;
			}
		System.out.print("Voce tem quantos anos de experiencia profissional:");
		experiencia = sc.nextInt();
		if( experiencia == 0) {
			experiencia = 0;
			experiencia = experiencia + 0;}
		else if( experiencia > 0 && experiencia <= 2) {
			experiencia = 0;
			experiencia = experiencia + 10;}	
		else if( experiencia > 2 && experiencia <= 5  ) {
			experiencia = 0;
			experiencia = experiencia + 20;}
		else {
			experiencia = 0;
			experiencia = experiencia + 40;
		}
		
				
		System.out.print("Você tem disponibilidade pra viajar:(S/N)");
		viagem = sc.next().charAt(0);
		System.out.print("Você tem carteira de motorista?(S/N)");
		carteira = (sc.next().charAt(0));
		
		System.out.println("Pontos por escolaridade:"+ escolaridade);
		System.out.println("Pontos por experiencia:"+ experiencia);
					 
		
		
		
		
		
		
		
		
		sc.close();
	}

}
