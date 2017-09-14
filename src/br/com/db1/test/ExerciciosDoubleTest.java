package br.com.db1.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.ExerciciosDouble;

public class ExerciciosDoubleTest {

	ExerciciosDouble exercicios = new ExerciciosDouble();
	
	@Before
	public void before() {
		System.out.println("Iniciando teste..");
	}
	
	@After
	public void after() {
		System.out.println("Teste finalizado com sucesso!\n");
	}
	
	@Test
	public void exercicio1Test() {
		Assert.assertTrue(2d == exercicios.verificarMaior(2d, 4d));
		System.out.println("Menor: " + exercicios.verificarMaior(2d, 4d));
	}
	
	@Test
	public void exercicio2Test() {
		Assert.assertTrue(4d == exercicios.verificarMaiorTres(8d, 4d, 6d));
		System.out.println("Menor: " + exercicios.verificarMaiorTres(8d, 4d, 6d));
	}
	
	@Test
	public void exercicio3Test() {
		Assert.assertTrue(4 == exercicios.calcularMedia(2,4,6));
		System.out.println("Media: " + exercicios.calcularMedia(2,4,6));
	}
	
	@Test
	public void exercicio4Test() {
		Assert.assertTrue(15 == exercicios.calcularAreaTriangulo(10,3));
		System.out.println("Area: " + exercicios.calcularAreaTriangulo(10,3));
	}
}
