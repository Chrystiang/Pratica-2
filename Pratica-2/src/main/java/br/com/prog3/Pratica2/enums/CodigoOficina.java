package br.com.prog3.Pratica2.enums;

public enum CodigoOficina {
	BRASILIENSE("Brasiliense"),
	PAULISTA("Paulista"),
	CARIOCA("Carioca");
    
	private String descricao;
    CodigoOficina(String descricao){
       this.descricao = descricao;
    }
    
    public String getDescricao() {
       return descricao;
    }
}
