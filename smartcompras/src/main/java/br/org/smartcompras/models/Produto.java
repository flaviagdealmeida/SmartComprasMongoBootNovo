package br.org.smartcompras.models;

import java.util.ArrayList;

public class Produto {

	private String id;
	private String produto;
	private String imgProduto;
	private String tipoProduto;
	private ArrayList<String> marca;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public String getImgProduto() {
		return imgProduto;
	}
	public void setImgProduto(String imgProduto) {
		this.imgProduto = imgProduto;
	}
	public String getTipoProduto() {
		return tipoProduto;
	}
	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}
	public ArrayList<String> getMarca() {
		return marca;
	}
	public void setMarca(ArrayList<String> marca) {
		this.marca = marca;
	}
	
	
}
