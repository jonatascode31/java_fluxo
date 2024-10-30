import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
        try {
			//chamando o método contendo a lógica de contagem
			contar (parametroUm, parametroDois);
		
		}catch (Exception exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
//Não obtive éxito com => ParametrosInvalidosException
	}
	static void contar( int parametroUm, int parametroDois ) throws  Exception  {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm>parametroDois){
        throw new Exception ("parametroUm é MAIOR que parametroDois");}
        
		//int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
        for(int x = parametroUm; x<parametroDois; x++){

            System.out.println("imprimindo o número: " + x);
        }
	}

    
}