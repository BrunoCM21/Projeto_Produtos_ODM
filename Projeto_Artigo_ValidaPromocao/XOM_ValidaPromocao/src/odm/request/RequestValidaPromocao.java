package odm.request;

public class RequestValidaPromocao {

	private String nomeProduto;
	private String descricaoProduto;
	private String fornecedorProduto;

	public RequestValidaPromocao() {
		super();
	}

	public RequestValidaPromocao(String nomeProduto, String descricaoProduto,
			String fornecedorProduto) {
		super();
		this.nomeProduto = nomeProduto;
		this.descricaoProduto = descricaoProduto;
		this.fornecedorProduto = fornecedorProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public String getFornecedorProduto() {
		return fornecedorProduto;
	}

	public void setFornecedorProduto(String fornecedorProduto) {
		this.fornecedorProduto = fornecedorProduto;
	}

}
