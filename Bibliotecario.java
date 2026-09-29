/*
 * Disciplina: 2026-PS
 * Projeto   : bibliotech
 * Arquivo   : Bibliotecario.java
 * Autor     : Renan Soares da Silva
 * Descricao : Bibliotecario é um tipo de usuario, com a matricula funcinal.
 */

public class Bibliotecario extends Usuario {

    private String matriculaFuncional;

    public Bibliotecario(String nome, String matricula, String matriculaFuncional) {
        super(nome, matricula);
        this.matriculaFuncional = matriculaFuncional;
    }

    public String getMatriculaFuncinal() {
        return matriculaFuncional;
    }

    public boolean consultarAcervo() {
        return true;
    }

    public String toString() {
        return "Bibliotecario(a)" + getNome() + " (" + getMatricula() + ", funcional " + matriculaFuncional + ") ";
    }
}