package pe.edu.cibertec.DAWI_CL2_AybarMarcial.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name= "curso")

public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcurso;

    @Column(name = "nomcurso")
    private String nomcurso;

    @Column(name = "credito")
    private Integer credito;

}
