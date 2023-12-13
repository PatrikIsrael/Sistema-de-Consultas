package br.com.sistemadeconsulta.dao;

import br.com.sistemadeconsulta.classes.Consulta;
import br.com.sistemadeconsulta.classes.EquipeMedica;
import br.com.sistemadeconsulta.classes.Paciente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ConsultaDAO {

    private final EntityManager em;

    public ConsultaDAO() {
        em = Persistence.createEntityManagerFactory("SistemaConsulta").createEntityManager();
    }

    private void handleTransactionException(EntityTransaction transaction, Exception e) {
        if (transaction != null && transaction.isActive()) {
            transaction.rollback();
        }
        e.printStackTrace();
    }

     public boolean verificarDisponibilidadeConsulta(LocalDate dataConsulta, LocalTime horaConsulta, EquipeMedica equipeMedica) {
        try {
            List<Consulta> consultas = em.createQuery("SELECT c FROM Consulta c WHERE c.dataConsulta = :dataConsulta "
                    + "AND c.horaConsulta = :horaConsulta AND c.equipe = :equipeMedica", Consulta.class)
                    .setParameter("dataConsulta", dataConsulta)
                    .setParameter("horaConsulta", horaConsulta)
                    .setParameter("equipeMedica", equipeMedica)
                    .getResultList();

            return consultas.isEmpty();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    public List<Consulta> listarConsultas() {
        TypedQuery<Consulta> query = em.createQuery("SELECT c FROM Consulta c", Consulta.class);
        return query.getResultList();
    }

    public List<Consulta> buscarConsultasPorPaciente(Paciente paciente) {
        TypedQuery<Consulta> query = em.createQuery("SELECT c FROM Consulta c WHERE c.paciente = :paciente", Consulta.class);
        query.setParameter("paciente", paciente);
        return query.getResultList();
    }

    public List<Consulta> buscarPorFiltros(String filtro1, String filtro2) {
        TypedQuery<Consulta> query = em.createQuery("SELECT c FROM Consulta c WHERE c.algumaPropriedade = :filtro1 AND c.outraPropriedade = :filtro2", Consulta.class);
        query.setParameter("filtro1", filtro1);
        query.setParameter("filtro2", filtro2);
        return query.getResultList();
    }

    public void removerConsulta(Consulta consulta) {
        em.getTransaction().begin();
        em.remove(em.contains(consulta) ? consulta : em.merge(consulta));
        em.getTransaction().commit();
    }

    public LocalTime getHoraConsulta(String horaConsultaString) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
            return LocalTime.parse(horaConsultaString, formatter);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

   public void agendarConsulta(Consulta consulta) {
        EntityTransaction transaction = em.getTransaction();
        try {
            if (!isConsultaDisponivel(consulta.getDataConsulta(), consulta.getHoraConsulta(), consulta.getEquipe())) {
                throw new IllegalStateException("Já existe uma consulta marcada para este horário e equipe.");
            } else {
                transaction.begin();
                em.persist(consulta);
                transaction.commit();
            }
        } catch (Exception e) {
            handleTransactionException(transaction, e);
        }
    }
   
   
public List<EquipeMedica> buscarEquipeMedicaPorNome(String nomeEquipe) {
    try {
        TypedQuery<EquipeMedica> query = em.createQuery("SELECT e FROM EquipeMedica e WHERE e.nomeMedico = :nome", EquipeMedica.class);
        query.setParameter("nome", nomeEquipe);
        return query.getResultList(); // Retorna uma lista de equipes correspondentes ao nome
    } catch (NoResultException ex) {
        return new ArrayList<>(); 
    }

}

  

 public boolean isConsultaDisponivel(LocalDate dataConsulta, LocalTime horaConsulta, EquipeMedica equipeMedica) {
    try {
        List<Consulta> consultas = em.createQuery("SELECT c FROM Consulta c WHERE c.dataConsulta = :dataConsulta "
                + "AND c.horaConsulta = :horaConsulta AND c.equipe = :equipeMedica", Consulta.class)
                .setParameter("dataConsulta", dataConsulta)
                .setParameter("horaConsulta", horaConsulta) 
                .setParameter("equipeMedica", equipeMedica)
                .getResultList();

        return consultas.isEmpty();
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
}

    public Paciente buscarPacientePorNome(String nomePaciente) {
        try {
            Query query = em.createQuery("SELECT p FROM Paciente p WHERE p.nome = :nome");
            query.setParameter("nome", nomePaciente);
            List<Paciente> pacientes = query.getResultList();
            return pacientes.isEmpty() ? null : pacientes.get(0);
        } catch (Exception e) {
            handleQueryException(e);
            return null;
        }
    }


    
      public Consulta buscarConsultaPorId(int idConsulta) {
        try {
            return em.find(Consulta.class, idConsulta);
        } catch (Exception e) {
            handleQueryException(e);
            return null;
        }
    }

    private void handleQueryException(Exception e) {
        e.printStackTrace();
    }

}
