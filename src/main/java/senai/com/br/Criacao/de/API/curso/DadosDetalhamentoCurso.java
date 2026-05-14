


public record DadosDetalhamentoCurso (

    Long id,
    String nome,
    Enum periodo


) {

    public DadosDetalhamentoCurso(Curso curso) {
        this(curso.getiId(),
                curso.getNome(),
                curso.getPeriodo()


        );


    }
}

