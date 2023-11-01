package br.com.enums.projeto.enumsJPA.converters;

import java.util.stream.Stream;

import br.com.enums.projeto.enumsJPA.Category;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

/*Definimos o valor de autoApply do @Converter como true para que o JPA aplique automaticamente a logica de conversao a todos os 
atributos mapeados de um tipo de categoria . Caso contrario, teriamos que colocar a anotacao @Converter diretamente no campo da 
entidade.*/
@Converter(autoApply = true)
// AttributeConverter<TipoDoEnum, TipoQueDeveSerSalvoNoBancoDeDados> 
public class CategoryConverter implements AttributeConverter<Category, String> {

	@Override
	/*
	 * como o nome do metodo ja diz converte para coluna do banco de dados, quando
	 * agente persisti o nome do enum ex: course.setCatedory(Category.FRONTEND); ele
	 * vai fazer o fluxo la no enum Category inicializando o atributo value do enum
	 * com o valor "Front-End" com isso ele retorna a string "Front-End" no metodo
	 * getValue(), depois o JPA salva a String no banco. o paramentro Category
	 * category no metodo convertToDatabaseColumn existe para verificar se nao e
	 * null e chamar o metodo getValue()
	 */
	public String convertToDatabaseColumn(Category category) {
		if (category == null) {
			return null;
		}
		return category.getValue();
	}

	@Override
//	comverte o valor do banco para atributo da entidade nesse caso e String para Enum Category 
	public Category convertToEntityAttribute(String value) {
		if (value == null) {
			return null;
		}

		/*
		 * percorre o array de enums Category.values() que tem o nome de todos enums ex:
		 * FRONTEND,BACKEND; e faz uma comparacao com o valor da string recebido do
		 * banco, a comparacao seria mais ou menos assim: "Back-End" == "Front-End"
		 * false quando ele encontrar a igualdade ele retorna o nome do enum ex BACKEND
		 */
		return Stream.of(Category.values()).filter(c -> c.getValue().equals(value)).findFirst()
				.orElseThrow(IllegalArgumentException::new);
	}

}
