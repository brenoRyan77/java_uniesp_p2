package com.br.vendas;

public class Venda {

    private Produto produto;
    private Vendedor vendedor;
    private Double desconto = 0.00;
    private Integer quantidadeItens;
    private Double valor;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Integer getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(Integer quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void efetuarDesconto(Double desconto){

        double descontoValor = this.produto.getValorVenda() * (desconto / 100);
        double valorDesconto = this.produto.getValorVenda() - descontoValor;

        if(valorDesconto < this.produto.getValorCusto()){
            System.out.println("Valor final do produto não pode" +
                    " ser menor do que o valor de custo.");
        }

        this.desconto = this.produto.getValorVenda() - valorDesconto;


    }

    public void calcularValor(){

        this.valor = this.quantidadeItens *
                this.produto.getValorVenda() - this.quantidadeItens * this.desconto;
    }

    public Double calcularComissao(){

        double comissao = this.valor * (this.vendedor.getComissao() / 100);
        boolean promocao = this.produto.getPromocao();

        if(promocao == true){
            return  comissao / 2;
        }
        return comissao;
    }

    public void imprimir(){

        System.out.println("==Vendedor==");
        System.out.println("Nome: " + this.vendedor.getNome());
        System.out.println("Cóigo: " + this.vendedor.getCodigo());
        System.out.println("Comissão: " + this.vendedor.getComissao());

        System.out.println();
        System.out.println("==Produto==");
        System.out.println("Código: " + this.produto.getCodigo());
        System.out.println("Descrição: " + this.produto.getDescricao());
        System.out.println("Valor da Venda: " + this.produto.getValorVenda());
        System.out.println("Promoção: " + (this.produto.getPromocao() ? "SIM" : "NÃO"));
        System.out.println("Valor de desconto: " + this.desconto);

        System.out.println();
        System.out.println("==Venda==");
        System.out.println("Quantidade de itens vendidos: " + this.quantidadeItens);
        System.out.println("Total de vendas: " + this.valor);
    }
}
