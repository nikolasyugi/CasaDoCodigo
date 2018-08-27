package com.br.casadocodigo;

public abstract class Livro implements Produto, Promocional{
    private String nome;
    private String descricao;
    private  double valor;
    private String isbn;
    private Autor autor;

    public Livro(Autor autor){
        this();
        this.autor=autor;
    }
    public Livro(){
        this.isbn="000-00-00000-00-0";
    }
    void mostrarDetalhes(){
        String mensagem = "Mostrando detalhes do livro";
        System.out.println(mensagem);
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " +descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        if (this.temAutor()){
            autor.mostrarDetalhes();
        }
        System.out.println("--");
    }

    public abstract boolean aplicarDescontoDe(double porcentagem);

    boolean temAutor(){
        boolean existeAutor=this.autor !=null;
        return existeAutor;
    }


    //GETTERS AND SETTERS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    //GETTERS AND SETTERS
}