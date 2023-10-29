package pe.edu.cibertec.DAWI_CL2_AybarMarcial.service;

import pe.edu.cibertec.DAWI_CL2_AybarMarcial.model.Curso;
import pe.edu.cibertec.DAWI_CL2_AybarMarcial.repository.CursoRepository;

import java.util.List;

public class CursoService {
    private CursoRepository cursoRepository;

    public List<Curso> listarCursos(){
        return cursoRepository.findAll();
    }


}
