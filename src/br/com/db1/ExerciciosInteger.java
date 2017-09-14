package br.com.db1;

public class ExerciciosInteger {
	private Integer resultado;
	private Integer i;

	public Integer exibirResultado() {
		return resultado;
	}

	public Integer somar(Integer valor1, Integer valor2) {
		return valor1 + valor2;
	}

	public Integer subtrair(Integer valor1, Integer valor2) {
		return valor1 - valor2;
	}

	public Integer multiplicar(Integer valor1, Integer valor2) {
		return valor1 * valor2;
	}

	public Integer dividir(Integer valor1, Integer valor2) {
		return valor1 / valor2;
	}

	public Boolean verificarParidade(Integer valor1) {
		return valor1 % 2 == 0;

	}

	public Integer verificarMaior(Integer valor1, Integer valor2) {
		if (valor1 > valor2) {
			return valor1;
		} else if (valor1 == valor2) {
			return valor1;
		} else {
			return valor2;
		}
	}

	public Integer[] listarImpares(Integer valor1) {
		Integer nImpares[] = new Integer[50];
		Integer cont = 0;
		for (i = valor1; i < 100; i++) {
			if (!verificarParidade(i)) {
				nImpares[cont] = i;
				cont++;
			}
		}
		return nImpares;
	}
}
