package com.br.vendas;

import java.util.Scanner;

public class Produto {

    Scanner sc = new Scanner(System.in);

    private String codigo;
    private String descricao;
    private Double valorVenda;
    private Double valorCusto;
    private Boolean promocao;

    public Produto(){

    }

    public Produto(String codigo, String descricao,
                   Double valorVenda, Double valorCusto,
                   Boolean promocao) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valorVenda = valorVenda;
        this.valorCusto = valorCusto;
        this.promocao = promocao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Double getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(Double valorCusto) {
        this.valorCusto = valorCusto;
    }

    public Boolean getPromocao() {
        return promocao;
    }

    public void setPromocao(Boolean promocao) {
        this.promocao = promocao;
    }
    
    public void cadastrarProduto() {
    	
    	System.out.println("Código: ");
    	setCodigo(sc.nextLine());
    	
    	System.out.println();
    	System.out.println("Descrição");
    	setDescricao(sc.nextLine());

    }
    
    
    public void status() {
    	System.out.println();
		System.out.println("####DADOS PRODUTO####");
		System.out.println("Código do produto: " + this.codigo);
		System.out.println("Descrição: " + this.descricao);
    }

}