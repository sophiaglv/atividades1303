package atividades1303;

public class Substituindo {

	public static void main(String[] args) {
		//Variável e corrigir um
		String espacos = "ispaços";
		String corrigir = espacos.replace("i", "e");

		//Variável e corrigir todos
		String todosEspacos = "e s p a ç o";
		String tiraespacos = todosEspacos.replaceAll(" ", "");

		//Saída
		System.out.println("Antes: " + espacos + " Depois: " + corrigir);
		System.out.println("Antes: " + todosEspacos + " Depois: " + tiraespacos);

	}

}
