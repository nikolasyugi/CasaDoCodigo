package com.br.casadocodigo;

public class Autor{
    String nomeDoAutor;
    String emailDoAutor;
    String cpfDoAutor;

    public void mostrarDetalhes(){
        String mensagem = "Mostrando detalhes do autor";
        System.out.println(mensagem);
        System.out.println("Nome do Autor: " + nomeDoAutor);
        System.out.println("E-mail do Autor: " + emailDoAutor);
        System.out.println("CPF do Autor: " + cpfDoAutor);
    }

    //GETTERS AND SETTERS

    public String getNomeDoAutor() {
        return nomeDoAutor;
    }

    public void setNomeDoAutor(String nomeDoAutor) {
        this.nomeDoAutor = nomeDoAutor;
    }

    public String getEmailDoAutor() {
        return emailDoAutor;
    }

    public void setEmailDoAutor(String emailDoAutor) {
        this.emailDoAutor = emailDoAutor;
    }

    public String getCpfDoAutor() {
        return cpfDoAutor;
    }

    public void setCpfDoAutor(String cpfDoAutor) {
        this.cpfDoAutor = cpfDoAutor;
    }

    //GETTERS AND SETTERS
}
