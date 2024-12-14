package ittec.cisco.apicisco.cis.model;

import lombok.Data;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
@Data
@Setter
@Table("materia")
public class Materia {
    @Id
    @Column("id_Materia")
    private String id_Materia;
    @Column("nombreMateria")
    private String nombreMateria;

    public String getId_Materia() {
        return id_Materia;
    }

    public Materia setId_Materia(String id_Materia) {
        this.id_Materia = id_Materia;
        return this;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public Materia setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
        return this;
    }
}
