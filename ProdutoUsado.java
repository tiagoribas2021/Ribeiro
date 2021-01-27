package Entidades;

import java.util.Date;

public class ProdutoUsado extends Produto {

	private Date dtFabricacao;
	
	public ProdutoUsado() {
		super();
	}

	public ProdutoUsado(String nome, double preco, Date dtFabricacao) {
		super(nome, preco);
		this.dtFabricacao = dtFabricacao;
	}

	public Date getDtFabricacao() {
		return dtFabricacao;
	}

	public void setDtFabricacao(Date dtFabricacao) {
		this.dtFabricacao = dtFabricacao;
	}
	
	@Override
	public String precoTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.nome+" (Usado) ");
		sb.append(super.preco+" ");
		sb.append("( Data Fabricação : ");
		sb.append(dtFabricacao);
		return sb.toString();
	}
	
}
