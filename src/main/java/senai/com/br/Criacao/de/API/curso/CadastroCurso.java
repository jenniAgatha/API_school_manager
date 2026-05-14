import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CadastroCurso(


    @NotBlank
    @Size(min = 3,max = 100, message = "Nome inválido!")
    String nome,


@NotBlank(message = "Periodo é obrigatório")
String periodo
)
{}




