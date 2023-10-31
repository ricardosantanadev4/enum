package br.com.enums.projeto.enums;

public class Formulario {

	/*
	 * essa e uma outra forma de declarar o enum dentro de outra classe, essa forma
	 * e usada quando o uso do enum e especifico para uma determinada clase, quando
	 * o enum vai ser utilizado em outra classe, agente declara o enum uma classe
	 * separada
	 */

	enum Genero {
		MASCULINO('m'), FEMININO('f');

		private char valor;

		Genero(char valor) {
			this.valor = valor;
		}

	}

	private String nome;
	private Genero genro;

}