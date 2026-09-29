/*
 * Disciplina: 2026-PS
 * Projeto   : bibliotech
 * Arquivo   : Usuario.java
 * Autor     : Renan Soares da Silva
 * Descricao : A classe geral do diagrama. Leitor e bibliotecario são tipos de usuarios
 */

public class Usuario{

    private String nome;
    private String matricula;

    public Usuario(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome(){
        return nome;
    }

    public String getMatricula(){
        return matricula;
    }

    public boolean entrar() {
        return !matricula.isEmpty();
    }

    public String toString() {
        return nome + " (" + matricula + ")";
    }
}