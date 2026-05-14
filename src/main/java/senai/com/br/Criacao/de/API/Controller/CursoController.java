package senai.com.br.Criacao.de.API.Controller;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import senai.com.br.Criacao.de.API.curso.CadastroCurso;
import senai.com.br.Criacao.de.API.curso.Curso;
import senai.com.br.Criacao.de.API.curso.CursoRepository;
import senai.com.br.Criacao.de.API.curso.DadosDetalhamentoCurso;


@RestController
@RequestMapping("curso")
@Tag( name="Cursos", description = "Gerenciamento de turmas")

@OpenAPIDefinition(tags = {

})

public class CursoController {


    @Autowired
    private CursoRepository cursoRepository;

    @PostMapping
    @Transactional
    public void  cadastrarCurso( @RequestBody @Valid CadastroCurso dados) {
        cursoRepository.save(new Curso());
    }





    }







