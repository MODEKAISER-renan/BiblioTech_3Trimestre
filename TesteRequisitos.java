public class TesteRequisitos {

    private static int passaram = 0;
    private static int falharam = 0;

    private static void verificar(String requisito, boolean condicao) {
        if (condicao) {
            passaram = passaram + 1;
            System.out.println("OK     " + requisito);
        } else {
            falharam = falharam + 1;
            System.out.println("FALHOU " + requisito);
        }
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.cadastrarLivro(new Livro("Dom Casmurro", "Machado de Assis", 1899));
        biblioteca.cadastrarLivro(new Livro("Capitães de Areia", "Jorge Amado", 1937));
        biblioteca.cadastrarLeitor(new Leitor("Pedro Alves", "20260010", 1));
        biblioteca.cadastrarLeitor(new Leitor("Ana Lima", "20260011", 2));

        Livro dom = biblioteca.buscarLivro("Dom Casmurro");
        Leitor pedro = biblioteca.buscarLeitor("20260010");

        verificar("RF01 livro cadastrado aparece na busca", dom != null);
        verificar("RF02 leitor cadastrado aparece na busca", pedro != null);

        verificar("RF03 livro novo esta disponível", dom.estaDisponivel());
        verificar("RF03 titulo fora do acervo nao é encontrado",biblioteca.buscarLivro("O Cortiço") == null);



        verificar("RF05 empréstimo de livro disponível é aceito",biblioteca.emprestar("Dom Casmurro", "20260010"));

        verificar("RF05 livro emprestado fica indisponível",!dom.estaDisponivel());

        verificar("RF05 leitor passa a ter 1 livro em mãos", pedro.getLivrosEmMaos() == 1);

        verificar("RF05 livro emprestado é recusado para outro leitor",!biblioteca.emprestar("Dom Casmurro", "20260011"));

        verificar("RF05 leitor no limite é recusado",!biblioteca.emprestar("Capitães da Areia", "20260010"));

        verificar("RF04 devolução de emprestimo ativo e aceita", );

        System.out.println();
        System.out.println(passaram + " passaram, " + falharam + " falharam.");

    }
}