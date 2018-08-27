package com.br.casadocodigo;

public class LivroFisico extends Livro implements Promocional{

    public LivroFisico(Autor autor){
        super(autor);
    }

    public double getTaxaImpressao(){
        return this.getValor()*0.05;
    }

    @Override
    public boolean aplicarDescontoDe(double porcentagem){
        if(porcentagem>0.3){
            return false;
        }
        else{
            this.setValor(this.getValor()*(1-porcentagem));
            return true;
        }
    }
}