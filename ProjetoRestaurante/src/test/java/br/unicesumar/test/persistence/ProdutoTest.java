package br.unicesumar.test.persistence;

import org.junit.Test;

import br.unicesumar.dao.impl.ProdutoDaoImpl;
import br.unicesumar.persistence.Produto;

public class ProdutoTest {
/*
	@Test
	public void testInsert() {
		Produto refrigerante = new Produto();
		ProdutoDaoImpl daoProduct = new ProdutoDaoImpl();
		
		refrigerante.setId(1);
		refrigerante.setNome("Guaraná Antarctica");
		refrigerante.setPreco(3.50);
		
		daoProduct.save(refrigerante);
		
	}
 */
	
	@Test
	public void updateProduto(){
		ProdutoDaoImpl daoProduct = new ProdutoDaoImpl();
		
		Produto produto = new Produto();
		produto.setId(0);
		produto.setNome("pizza de calabresa");
		produto.setPreco(new Double("12.2"));
	    daoProduct.merge(produto);
		
	
	}
	@Test
	public void insertProduto(){
		ProdutoDaoImpl daoProduct = new ProdutoDaoImpl();
		Produto produto = new Produto();
		
		produto.setNome("pizza");
		produto.setPreco(new Double("12.2"));
	    daoProduct.save(produto);
	}
	
}
