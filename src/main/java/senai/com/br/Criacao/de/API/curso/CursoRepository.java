package senai.com.br.Criacao.de.API.curso;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CursoRepository extends JpaRepository<Curso ,Long> {
    Page<Curso> findAllByAtivoTrue(Page paginacao);
    Optional<Curso> findByIdAndAtivoTrue(Long id);


}
