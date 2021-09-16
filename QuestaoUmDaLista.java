package RevisãoPrimeiraProvaSegndoSemestre;/*QUESTÃO 1
Crie um programa em Java que faça a leitura de 1 palavra e chame um método que devolva o nome de
forma invertido. Seu programa deverá pegar o retorno e imprimir no console a palavra invertida.
Por exemplo:
Entrada: “Univas”
Saida: “savinU”
Dica: utilize os métodos “length” e “charAt” do String para ajudar. */

// length retorna  o tamanho da palavra , retona um inteiro
// for de forma invertida for(int = 9 ; i >=0 ; i--) decrementa - 1 por passagem no for 
// o metado charAt me devolve a possição de um caracter dentro da possição i
//


import java.util.Scanner;
public class QuestaoUmDaLista {
	
	public static void main(String[]args) {
		
		Scanner entrada = new Scanner(System.in);
		
		 System.out.println("Digite um palavra");
	     String word =  entrada.nextLine();
		
		 
		 String aux = invert (word);
		 System.out.println("A palavra invertida é "+ aux);
		 
		 entrada.close();
	
	}
	
	public static  String invert(String word) {
		
		String invertedWord ="";
		
		int length = word.length();
		for( int i = length -1 ; i >= 0 ; i--) {
			invertedWord +=  word.charAt(i);
			
			
		}
	
		
		
		return invertedWord;
	 
	 
	 
	 
	 
	
	}
}
