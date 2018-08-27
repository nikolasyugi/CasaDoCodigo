package com.br.casadocodigo;

public class Ebook extends Livro implements Promocional{
    String waterMark;

    public Ebook (Autor autor){
        super(autor);
    }

    @Override
    public boolean aplicarDescontoDe(double porcentagem){
        if(porcentagem>0.15){
            return false;
        }
        else{
            setValor(this.getValor()*(1-porcentagem));
            return true;
        }

    }
    //GETTERS AND SETTERS

    public String getWaterMark() {
        return waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }

    //GETTERS AND SETTERS
}