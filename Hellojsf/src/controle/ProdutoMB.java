package controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import modelo.Produto;

@ManagedBean
@ViewScoped
public class ProdutoMB {

	Produto produto = new Produto();
	// atributo para preencher a data table
	List<Produto> produtos = new ArrayList<>();

	public void cadastrar() {
		produtos.add(produto);
		produto = new Produto();
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

}