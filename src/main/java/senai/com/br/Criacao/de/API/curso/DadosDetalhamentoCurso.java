package senai.com.br.Criacao.de.API.curso;

public record DadosDetalhamentoCurso (

    String nome,
    Periodo periodo


) {

    public DadosDetalhamentoCurso(Curso curso) {
        this(
                curso.getNome(),
                curso.getPeriodo()


        );


    }
}

