package com.br.casadocodigo;

public class CarrinhodeCompras {

    private double total;
    private Produto[] produtos = new Produto[10];
    private int contador=0;

    public void adiciona(Produto produto){
        System.out.println("Adicionado: "+ produto);
        this.produtos[contador]=produto;
        contador++;
        total+= produto.getValor();
        System.out.println("Total do carrinho: R$"+this.total);
    }

    public double getTotal() {
        return total;
    }
}
