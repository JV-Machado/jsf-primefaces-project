package com.project.erp.model;

public enum TipoEmpresa {

	MEI("Microempreendedor Individual"),
	EIRELI("Empresa Individuall de Responsabilidade Limitada"),
	LTDA("Sociedade Limitada"),
	SA("Sociedade Anônima");
	
	private String descricao;

	TipoEmpresa(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
