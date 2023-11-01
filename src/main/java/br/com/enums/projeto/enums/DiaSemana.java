package br.com.enums.projeto.enums;

public enum DiaSemana {
//  ex usando enum como classe no java
//	o uso do () ao lado do enum passando um valor, chama o construtor passando um valor
	DOMINGO(1), SEGUNDA(2), TERCA(3), QUARTA(4), QUINTA(5), SEXTA(6), SABADO(7);

//	atributo que vai receber o valor passado no construtor
	private int value;

//	construtor
	DiaSemana(int value) {
		this.value = value;
	}

//  metodo que vai retornar um valor
	public int getValue() {
		return this.value;
	}
}
