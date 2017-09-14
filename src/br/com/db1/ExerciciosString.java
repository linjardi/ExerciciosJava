package br.com.db1;

public class ExerciciosString {
	private Integer i;
	
	public String exibirMaiuscula(String palavra) {
		return palavra.toUpperCase();
	}

	public String exibirMinuscula(String palavra) {
		return palavra.toLowerCase();
	}

	public Integer contarCaracteres(String palavra) {
		return palavra.length();
	}

	public String contarCaracteresSemEspaco(String palavra) {
		return palavra.trim();
	}

	public String quatroPrimeirasLetras(String palavra) {
		return palavra.substring(0, 4);
	}

	public String terceiraLetraEmDiante(String palavra) {
		return palavra.substring(2);
	}

	public String quatroUltimasLetras(String palavra) {
		return palavra.substring(palavra.length() - 4, palavra.length());
	}

	public String substituirNomeAluno(String palavra) {
		String palavra2 = palavra.substring(0, palavra.indexOf(" "));
		return palavra.replace(palavra2, "ALUNO");
	}

	public String[] quebrarTexto(String palavra) {
		String textoQuebrado[] = palavra.split(",");
		return textoQuebrado;
	}


	public Integer contarVogais(String palavra) {
		Integer vogais = 0;
		for (i = 0; i < palavra.length(); i++) {
			if (palavra.substring(i, i + 1).equals("a") || palavra.substring(i, i + 1).equals("e")
					|| palavra.substring(i, i + 1).equals("i") || palavra.substring(i, i + 1).equals("o")
					|| palavra.substring(i, i + 1).equals("u")) {
				vogais++;
			}
		}
		return vogais;
	}
	
	public String exibirContrario(String palavra) {
		String palavra2 = new StringBuilder(palavra).reverse().toString();
		return palavra2;
	}

}
