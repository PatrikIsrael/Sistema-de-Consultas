package br.com.sistemadeconsulta.classes;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "EquipeMedica")
public class EquipeMedica {
    
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_equipe_medica")
    private Long idEquipe;

    @Column(name = "nome_medico")
    private String nomeMedico;

    @Column(name = "especialidade")
    private String especialidadeMedica;

    @Column(name = "nome_enfermeira")
    private String nomeEnfermeira;
    
    @OneToMany(mappedBy = "equipe")
    private List<Consulta> consultas;

    public Long getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(Long idEquipe) {
        this.idEquipe = idEquipe;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public String getEspecialidadeMedica() {
        return especialidadeMedica;
    }

    public void setEspecialidadeMedica(String especialidadeMedica) {
        this.especialidadeMedica = especialidadeMedica;
    }

    public String getNomeEnfermeira() {
        return nomeEnfermeira;
    }

    public void setNomeEnfermeira(String nomeEnfermeira) {
        this.nomeEnfermeira = nomeEnfermeira;
    }
    
    

  
}
