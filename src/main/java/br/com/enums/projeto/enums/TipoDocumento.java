package br.com.enums.projeto.enums;

public enum TipoDocumento {
	/*
	 * ex de uso do metodo abstrato declarando diretamente no enum: agente tem um
	 * melhor controle chamando o metodo de outra classe atravez do enum do que
	 * chamar diretamente o metodo da outra classe sem passar pelo enum, observe que
	 * cada enum tem seu metodo separado logicamente, se eu chamasse o metodo
	 * diretamente da classe GeraCpfCnpj sem passar pelo enum eu poderia chamaar um
	 * metodo que nao condiz com a logica do atributo, e eu teria que fazer esse
	 * controle para nao chamar o metodo errado
	 */
	CPF {
		@Override
		public String geranumeroTeste() {
			return GeraCpfCnpj.cpf();
		}
	},
	CNPJ {
		@Override
		public String geranumeroTeste() {
			return GeraCpfCnpj.cnpj();
		}
	};

	public abstract String geranumeroTeste();
}
