package main.java.com.pil.moby.evaluacion_tecnica.segundo_cuestionario.modelo.pojo;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Candidato {

    private Long id;
    private String nombre;
    private String apellido;
    private Double pretensionSalarial;
    private List<Tecnologia> tecnologias;

    public Candidato(Long id, String nombre, String apellido, Double pretensionSalarial) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.pretensionSalarial = pretensionSalarial;
        tecnologias = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Double getPretensionSalarial() {
        return pretensionSalarial;
    }

    public void setPretensionSalarial(Double pretensionSalarial) {
        this.pretensionSalarial = pretensionSalarial;
    }

    public List<Tecnologia> getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(List<Tecnologia> tecnologias) {
        this.tecnologias = tecnologias;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidato candidato = (Candidato) o;
        return Objects.equals(id, candidato.id) && Objects.equals(nombre, candidato.nombre) && Objects.equals(apellido, candidato.apellido) && Objects.equals(pretensionSalarial, candidato.pretensionSalarial) && Objects.equals(tecnologias, candidato.tecnologias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, apellido, pretensionSalarial, tecnologias);
    }

    @Override
    public String toString() {
        return "Candidato:\"" +
                "id: " + id + ", nombre: " + nombre +                 ", apellido: '" + apellido + '\'' +
                ", pretensionSalarial: " + pretensionSalarial +
                ", tecnologias: " + tecnologias;
    }
}
