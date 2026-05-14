package senai.com.br.Criacao.de.API.curso;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "curso")
@Entity(name ="Curso")
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of ="id")

public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Enumerated(EnumType.STRING)


    private Long id;
    private String nome;
    private  Periodo periodo;


    public Curso(CadastroCurso dados) {
        this.periodo = dados.periodo();
        this.nome = dados.nome();


            }

        }










