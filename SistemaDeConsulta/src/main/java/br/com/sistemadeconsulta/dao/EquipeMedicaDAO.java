package br.com.sistemadeconsulta.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import br.com.sistemadeconsulta.classes.EquipeMedica;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.NoResultException;
import jakarta.persistence.NonUniqueResultException;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class EquipeMedicaDAO {

    private final EntityManagerFactory emf;
    private final EntityManager em;

    public EquipeMedicaDAO() {
        emf = Persistence.createEntityManagerFactory("SistemaConsulta");
        em = emf.createEntityManager();
    }

    public boolean conectar() {
        try {
            em.getTransaction().begin();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void desconectar() {
        em.close();
        emf.close();
    }

    public int atualizar(EquipeMedica equipeMedica) {
        try {
            em.getTransaction().begin();
            em.merge(equipeMedica);
            em.getTransaction().commit();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
            return 0;
        }
    }

    public List<EquipeMedica> listar() {
        try {
            Query query = em.createQuery("SELECT e FROM EquipeMedica e");
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<EquipeMedica> buscarPorFiltros(String nomeMedico, String especialidadeMedica, String nomeEnfermeira) {
        try {
            String jpql = "SELECT e FROM EquipeMedica e WHERE 1=1";
            Map<String, Object> parametros = new HashMap<>();

            if (nomeMedico != null && !nomeMedico.isEmpty()) {
                jpql += " AND e.nomeMedico LIKE :nomeMedico";
                parametros.put("nomeMedico", "%" + nomeMedico + "%");
            }

            if (especialidadeMedica != null && !especialidadeMedica.isEmpty()) {
                jpql += " AND e.especialidadeMedica = :especialidadeMedica";
                parametros.put("especialidadeMedica", especialidadeMedica);
            }

            if (nomeEnfermeira != null && !nomeEnfermeira.isEmpty()) {
                jpql += " AND e.nomeEnfermeira LIKE :nomeEnfermeira";
                parametros.put("nomeEnfermeira", "%" + nomeEnfermeira + "%");
            }

            Query query = em.createQuery(jpql);

            for (Map.Entry<String, Object> entry : parametros.entrySet()) {
                query.setParameter(entry.getKey(), entry.getValue());
            }

            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void excluirPorNome(String nomeMedico) {
        try {
            List<EquipeMedica> equipes = em.createQuery("SELECT e FROM EquipeMedica e WHERE e.nomeMedico = :nomeMedico", EquipeMedica.class)
                    .setParameter("nomeMedico", nomeMedico)
                    .getResultList();

            if (!equipes.isEmpty()) {
                EquipeMedica equipeMedica = equipes.get(0);
                em.getTransaction().begin();
                em.remove(equipeMedica);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        }
    }

    public List<EquipeMedica> buscarTodasEquipesMedicas() {
        try {
            // Consulta para buscar todas as equipes médicas usando o EntityManager existente
            TypedQuery<EquipeMedica> query = em.createQuery("SELECT e FROM EquipeMedica e", EquipeMedica.class);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int salvar(EquipeMedica equipeMedica) {
        try {
            em.getTransaction().begin();
            em.persist(equipeMedica);
            em.getTransaction().commit();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public EquipeMedica buscarEquipeMedicaPorNome(String nomeMedico) {
        try {
            TypedQuery<EquipeMedica> query = em.createQuery(
                    "SELECT e FROM EquipeMedica e WHERE e.nomeMedico = :nomeMedico", EquipeMedica.class);
            query.setParameter("nomeMedico", nomeMedico);
            return query.getSingleResult(); // Retorna um único resultado
        } catch (NoResultException ex) {
            return null;
        }
    }

}
