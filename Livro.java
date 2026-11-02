/*
* Diciplina: 2026-PS
* Projeto  : Bibliotech
* Arquivo  : Livro.java
* Autor    : Renan Soares da Silva
* Descrição: A caixa "Livro" do diagrama de classes, em java(aula 37).
*/

public class Livro{
    private int id;
    private String titulo;
    private String autor;
    private int ano;
    private boolean disponivel;

    public Livro(int id,String titulo, String autor, int ano){
        this.id = id;
        this.titulo = titulo;
        this.autor  = autor;
        this.ano = ano;
        this.disponivel = true;
    }

    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getAno(){
        return ano;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean estaDisponivel(){
        return disponivel;
    }

    public void emprestar(){
        this.disponivel = false;
    }
    public void devolver(){
        this.disponivel = true;
    }

    public String toString(){
        String situcao = disponivel ? "disponivel" : "emprestado";
        return titulo + " (" + autor + ", " + ano + ") - " + situcao;
    }
}