package br.com.sistemadeconsulta.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import java.util.List;
import br.com.sistemadeconsulta.classes.Paciente;

public class PacienteDAO {

    private final EntityManager em;

    public PacienteDAO() {
        em = Persistence.createEntityManagerFactory("SistemaConsulta").createEntityManager();
    }

    public void salvarPaciente(Paciente paciente) {
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.persist(paciente);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void excluirPacientePorNome(String nomePaciente) {
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            Paciente paciente = buscarPorNome(nomePaciente);
            if (paciente != null) {
                em.remove(paciente);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void atualizarPaciente(Paciente paciente) {
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.merge(paciente);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public List<Paciente> listarPacientes() {
        try {
            Query query = em.createQuery("SELECT p FROM Paciente p");
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Paciente buscarPorNome(String nomePaciente) {
        try {
            Query query = em.createQuery("SELECT p FROM Paciente p WHERE p.nome = :nome");
            query.setParameter("nome", nomePaciente);
            return (Paciente) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean verificarExistenciaPaciente(String nome, String cpf) {
        try {
            Query query = em.createQuery("SELECT p FROM Paciente p WHERE p.nome = :nome AND p.cpf = :cpf");
            query.setParameter("nome", nome);
            query.setParameter("cpf", cpf);

            List<Paciente> pacientes = query.getResultList();
            return !pacientes.isEmpty();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
