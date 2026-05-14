package senai.com.br.Criacao.de.API.curso;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CadastroCurso(


    @NotBlank
    @Size(min = 3,max = 100, message = "Nome inválido!")
    String nome,


@NotBlank(message = "senai.com.br.Criacao.de.API.curso.Periodo é obrigatório")
Periodo periodo
)
{}




