package com.br.casadocodigo;

public class CadastroDeLivros {

        public static void main(String[] args) {

                Autor autor1 = new Autor();
                autor1.setNomeDoAutor("Fetiche da Silva");
                autor1.setEmailDoAutor("fetiche@gmail.com");
                autor1.setCpfDoAutor("323.435.023-32");

                Livro livro1 = new LivroFisico(autor1);
                livro1.setNome("Brandao");
                livro1.setDescricao("Viado");
                livro1.setValor(59.90);
                livro1.setIsbn("978-85-66250-46-6");
                livro1.mostrarDetalhes();

                Autor autor2 = new Autor();
                autor2.setNomeDoAutor("Iglesias da Silva");
                autor2.setEmailDoAutor("prig@gmail.com");
                autor2.setCpfDoAutor("210.420.112-32");

                Livro livro2 = new LivroFisico(autor2);
                livro2.setNome("Preguiça");
                livro2.setDescricao("Arrombado");
                livro2.setValor(69.09);
                livro2.setIsbn("239-34-54310-12-6");

                livro2.mostrarDetalhes();

                Autor autor3=new Autor();
                autor3.setNomeDoAutor("Tisouro");
                autor3.setEmailDoAutor("tiso@gmail.com");
                autor3.setCpfDoAutor("124.305.399-90");
                Ebook ebook1 = new Ebook(autor3);
                ebook1.setNome("Tesouro");
                ebook1.setDescricao("Roçeiro");
                ebook1.setValor(42.15);
                ebook1.setIsbn("212-53-76394-29-3");
                ebook1.mostrarDetalhes();


                CarrinhodeCompras carrinho=new CarrinhodeCompras();
                carrinho.adiciona(livro1);
                carrinho.adiciona(livro2);
                carrinho.adiciona(ebook1);
        }
}