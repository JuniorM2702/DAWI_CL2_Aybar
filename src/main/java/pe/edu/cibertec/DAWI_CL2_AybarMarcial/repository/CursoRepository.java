package pe.edu.cibertec.DAWI_CL2_AybarMarcial.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DAWI_CL2_AybarMarcial.model.Curso;

import java.util.List;

@Repository
public interface CursoRepository extends JpaReposity<Curso,Integer>{
    List<Curso> findAll();
}
