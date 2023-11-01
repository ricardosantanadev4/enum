package br.com.enums.projeto.enumsJPA;

public enum Category {
// ex usando enum como classe no java

	FRONTEND("F"), BACKEND("B");

	private String value;

	Category(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

}