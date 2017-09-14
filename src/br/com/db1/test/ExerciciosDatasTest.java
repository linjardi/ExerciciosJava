package br.com.db1.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.ExerciciosDatas;

public class ExerciciosDatasTest {

	ExerciciosDatas exercicios = new ExerciciosDatas();

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
		Assert.assertTrue(exercicios.verificarBissexto(2012));
		System.out.println("Bissexto: " + exercicios.verificarBissexto(2012));
	}
	
}
