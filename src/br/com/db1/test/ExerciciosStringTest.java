package br.com.db1.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.ExerciciosString;

public class ExerciciosStringTest {
	
	ExerciciosString exercicios = new ExerciciosString();
	
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
		Assert.assertEquals("FUSCA", exercicios.exibirMaiuscula("fusca"));
		System.out.println(exercicios.exibirMaiuscula("fusca"));
	}
	
	@Test
	public void exercicio2Test() {
		Assert.assertTrue(exercicios.exibirMinuscula("FUSCA").equals("fusca"));
		System.out.println(exercicios.exibirMinuscula("FUSCA"));
	}
	
	@Test
	public void exercicio3Test() {
		Assert.assertTrue(8 == exercicios.contarCaracteres("DB1START"));
		System.out.println(exercicios.contarCaracteres("DB1START"));
	}
	
	@Test
	public void exercicio4Test() {
		Assert.assertTrue(exercicios.contarCaracteres(" DB1START ") == 10);
		System.out.println(exercicios.contarCaracteres(" DB1START "));
	}
	
	@Test
	public void exercicio5Test() {
		Assert.assertTrue(exercicios.contarCaracteresSemEspaco(" DB1START ").length() == 8);
		System.out.println(exercicios.contarCaracteresSemEspaco(" DB1START ").length());
	}
	
	@Test
	public void exercicio6Test() {
		Assert.assertEquals("DANI", exercicios.quatroPrimeirasLetras("DANIEL"));
		System.out.println(exercicios.quatroPrimeirasLetras("DANIEL"));
	}
	
	@Test
	public void exercicio7Test() {
		Assert.assertEquals("NIEL", exercicios.terceiraLetraEmDiante("DANIEL"));
		System.out.println(exercicios.terceiraLetraEmDiante("DANIEL"));
	}
	
	@Test
	public void exercicio8Test() {
		Assert.assertEquals("ARDI", exercicios.quatroUltimasLetras("DANIEL LINJARDI"));
		System.out.println(exercicios.quatroUltimasLetras("DANIEL LINJARDI"));
	}
	
	@Test
	public void exercicio9Test() {
		Assert.assertEquals("ALUNO LINJARDI", exercicios.substituirNomeAluno("DANIEL LINJARDI"));
		System.out.println(exercicios.substituirNomeAluno("DANIEL LINJARDI"));
	}
	
	@Test
	public void exercicio10Test() {
		String[] frutas = exercicios.quebrarTexto("banana,maca,melancia");
		Assert.assertEquals("banana", frutas[0]);
		Assert.assertEquals("maca", frutas[1]);
		Assert.assertEquals("melancia", frutas[2]);
		System.out.println(frutas[0] + "\n" + frutas[1] + "\n" + frutas[2]);
	}
	
	@Test
	public void exercicio11Test() {
		Assert.assertTrue(2 == exercicios.contarVogais("fusca"));
		System.out.println("Vogais: " + exercicios.contarVogais("fusca"));
	}
	
	@Test
	public void exercicio12Test() {
		Assert.assertEquals("acsuf", exercicios.exibirContrario("fusca"));
		System.out.println("Contrario: " + exercicios.exibirContrario("fusca"));
	}
	
}
