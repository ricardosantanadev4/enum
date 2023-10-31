package br.com.enums.projeto.enums;

public class TesteEnum {

	public static void main(String[] args) {

		/*
		 * tendo o caminho TipoDoEnum.NOMEENUM e possivel retornar tanto o nome do enum
		 * quanto o valor do enum
		 */
		DiaSemana dia = DiaSemana.DOMINGO;

//		dia.toString() exibe o nome do enum
//		dia.getValue() exibe o valor do enum
		System.out.println(dia.toString() + " - " + dia.getValue());

		System.out.println("");

//		declarando o enum dentro de um classe
		Data data = new Data(30, 10, 2023, DiaSemana.SEGUNDA);

		System.out.println(data.getDia() + "-" + data.getMes() + "-" + data.getAno() + "-" + data.getDiaSemana());

		System.out.println("");

//	    usando o meto Values() do enum
		DiaSemana[] dias = DiaSemana.values();

//		.values() permite obter valor do enum atraves do indice passado no array
		for (int i = 0; i < dias.length; i++) {
//			quando e passada a posicao no array ou seja o indice, ele exibe o valor que esta naquela posicao no caso o nome do enum
			System.out.println(dias[i]);
		}

		System.out.println();

//      o metodo .values() e um array que contem o nome de todos os enums
		for (DiaSemana day : DiaSemana.values()) {
			System.out.println(day);
		}

		System.out.println();

//		usando o metodo valueOf()
//      esse meto permite obter o valor do enum atraves de um string
		System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));

//		quando agente tem uma string e nao sabe o valor dessa instring agente pode avaliar essa string criando uma propria instacia Enum
		DiaSemana d = Enum.valueOf(DiaSemana.class, "DOMINGO");
		System.out.println(d);

		System.out.println();

//		teste metodo abstrato declarado diretamente no enum
		for (TipoDocumento doc : TipoDocumento.values()) {
			System.out.println(doc + "-" + doc.geranumeroTeste());
		}

		System.out.println();

		Pessoa pf = new Pessoa();
//		setTipoDocumento(TipoDocumento tipoDocumento) : void - Pessoa logo e possivel passar o enum CPF
		pf.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
		/*
		 * pf.getTipoDocumento() tem o valor do enum CPF porque foi setado a cima
		 * pf.setTipoDocumento, com isso eu consigo chamar o metodo geranumeroTeste() do
		 * cpf, com outras palavras o codigo a baixo ficaria assim:
		 * pf.setNumeroDocumento(pf.CPF.geranumeroTeste());
		 */
		pf.setNumeroDocumento(pf.getTipoDocumento().geranumeroTeste());
		System.out.println(pf);

		Pessoa pj = new Pessoa();
		pj.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CNPJ"));
		pj.setNumeroDocumento(pj.getTipoDocumento().geranumeroTeste());
		System.out.println(pj);
	}

}
