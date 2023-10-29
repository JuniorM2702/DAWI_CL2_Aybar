package pe.edu.cibertec.DAWI_CL2_AybarMarcial.controller.listados;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.cibertec.DAWI_CL2_AybarMarcial.service.CursoService;

@AllArgsConstructor
@Controller
@RequestMapping("/listados/entidadBase")
public class CursoController {
    private CursoService cursoService;

    @GetMapping("/frmcurso")
    public String index(Model model){
        model.addAttribute("listacursos",
                cursoService.listarCursos());
        return "listados/entidadBase";
    }

}
