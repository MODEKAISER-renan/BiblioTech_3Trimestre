/*
 * Disciplina: 2026-PS
 * Projeto   : bibliotech
 * Arquivo   : Leitor.java
 * Autor     : Renan Soares da Silva
 * Descricao : Leitor é um tipo de Usuario: herda nome,matricula e entrar().
 */

public class Leitor extends Usuario {

    private int limiteEmprestimos;
    private int livroEmMaos;

    public Leitor(String nome, String matricula, int limiteEmprestimos) {
        super(nome, matricula);
        this.limiteEmprestimos = limiteEmprestimos;
        this.livroEmMaos = 0;
    }

    public int getLimiteEmprestimos(){
        return limiteEmprestimos;
    }

    public int getLivrosEmMaos(){
        return livroEmMaos;
    }

    public boolean podePegarEmprestado() {
        return livroEmMaos < limiteEmprestimos;
    }

    public void pegouLivro() {
        this.livroEmMaos = this.livroEmMaos + 1;
    }

    public void devolveuLivro() {
        this.livroEmMaos = this.livroEmMaos - 1;
    }

    public String toString() {
        return "Leitor" + getNome() + " (" + getMatricula() + ") - " + livroEmMaos + " de " + limiteEmprestimos + " livros";
    }

}