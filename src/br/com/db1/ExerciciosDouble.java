package br.com.db1;

public class ExerciciosDouble {
	
	public Double verificarMaior(Double valor1, Double valor2) {
		return Math.min(valor1, valor2);
	}
	
	public Double verificarMaiorTres(Double valor1, Double valor2, Double valor3) {
		return Math.min(Math.min(valor1, valor2), valor3);
	}
	
	public Integer calcularMedia(Integer valor1, Integer valor2, Integer valor3) {
		return (valor1 + valor2 + valor3)/3;
	}
	
	public Integer calcularAreaTriangulo(Integer valor1, Integer valor2) {
		return (valor1 * valor2)/2;
	}
	
}
