package com.br.vendas;

import java.util.Scanner;

public class Vendedor {
	
	Scanner sc = new Scanner(System.in);

    private String nome;
    private String codigo;
    private Double comissao;
    private String endereco;

    public Vendedor(){

    }

    public Vendedor(String nome, String codigo, String endereco, Double comissao) {
        this.nome = nome;
        this.codigo = codigo;
        this.endereco = endereco;
        this.comissao = comissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void cadastrar() {
    	
    	System.out.println("Código do vendedor: ");
    	setCodigo(sc.nextLine());
    	
		System.out.println("Digite o nome do vendedor: ");
		setNome(sc.nextLine());
		
		System.out.println("Digite o Endereço: ");
		setEndereco(sc.nextLine());
		
		System.out.println("Digite a comissão: ");
		setComissao(sc.nextDouble());
		
	}
    
    public void status () {
		System.out.println("####DADOS VENDEDOR####");
		System.out.println("Código: " + this.getCodigo());
		System.out.println("Vendedor: " + this.getNome());
		System.out.println("Endereço: " + this.getEndereco());
		System.out.println("Comissão: " + this.getComissao());
	}
}
