package com.br.casadocodigo;

public class MiniLivro extends Livro implements Promocional {

    public MiniLivro(Autor autor){
        super(autor);
    }
    public boolean aplicarDescontoDe( double porcentagem){
        return false;
    }
}
