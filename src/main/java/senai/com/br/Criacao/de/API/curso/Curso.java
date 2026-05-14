package senai.com.br.Criacao.de.API;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
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
    private String periodo;


    public Curso(Long id, String periodo, String nome) {
        this.id = id;
        this.periodo = periodo;
        this.nome = nome;


            }

        }










