package br.com.sistemadeconsulta.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {

    private static final String PERSISTENCE_UNIT = "SistemaConsulta";
    private static EntityManagerFactory fabrica;
    private static EntityManager em;

    // Cria o EntityManager se estiver nulo ou fechado e o retorna
    public static EntityManager getEntityManager() {
        if (fabrica == null || !fabrica.isOpen()) {
            fabrica = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        }

        if (em == null || !em.isOpen()) {
            em = fabrica.createEntityManager();
        }

        return em;
    }

    // Fecha o EntityManager e o factory
    public static void closeEntityManager() {
        if (em != null && em.isOpen()) {
            em.close();
        }

        if (fabrica != null && fabrica.isOpen()) {
            fabrica.close();
        }
    }
}
