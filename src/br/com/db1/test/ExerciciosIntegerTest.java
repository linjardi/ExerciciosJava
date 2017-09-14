package br.com.db1.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.ExerciciosInteger;

public class ExerciciosIntegerTest {
	
	ExerciciosInteger exercicios = new ExerciciosInteger();
	
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
		Assert.assertTrue(exercicios.somar(1,2) == 3);
		System.out.println("Soma: " + exercicios.somar(1,2));
	}
	
	@Test
	public void exercicio2Test() {
		Assert.assertTrue(exercicios.subtrair(2,1) == 1);
		System.out.println("Subtracao: " + exercicios.subtrair(2,1));	
	}
	
	@Test
	public void exercicio3Test() {
		Assert.assertTrue(exercicios.multiplicar(2,5) == 10);
		System.out.println("Multiplicacao: " + exercicios.multiplicar(2,5));	
	}
	
	@Test
	public void exercicio4Test() {
		Assert.assertTrue(exercicios.dividir(10,2) == 5);
		System.out.println("Divisao: " + exercicios.dividir(10,2));	
	}
	
	@Test
	public void exercicio5Test() {
		Assert.assertTrue(exercicios.verificarParidade(12));
		System.out.println("Par: " + exercicios.verificarParidade(12));
	}
	
	@Test
	public void exercicio6Test() {
		Assert.assertTrue(exercicios.verificarMaior(10, 12) == 12);
		System.out.println("Maior: " + exercicios.verificarMaior(10, 12));
	}
	
	@Test
	public void exercicio7Test() {
		Integer[] impar = exercicios.listarImpares(90);
		Assert.assertTrue(91 == impar[0]);
		Assert.assertTrue(93 == impar[1]);
		Assert.assertTrue(95 == impar[2]);
		Assert.assertTrue(97 == impar[3]);
		Assert.assertTrue(99 == impar[4]);
	}
}
