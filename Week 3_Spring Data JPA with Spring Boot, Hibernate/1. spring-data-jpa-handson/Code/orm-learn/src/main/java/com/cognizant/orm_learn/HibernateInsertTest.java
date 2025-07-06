package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Country;
import org.hibernate.Session;
import org.springframework.stereotype.Component;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Component
public class HibernateInsertTest {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void insertCountryUsingHibernate() {
        try {
            // Get Hibernate Session from JPA EntityManager
            Session session = entityManager.unwrap(Session.class);

            Country country = new Country();
            country.setCode("TH");
            country.setName("Thailand");

            session.persist(country);

            System.out.println("Inserted using Hibernate: " + country);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
