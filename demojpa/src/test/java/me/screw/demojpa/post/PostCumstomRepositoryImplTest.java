package me.screw.demojpa.post;

import org.hibernate.Session;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PostCumstomRepositoryImplTest {

    @PersistenceContext
    EntityManager entityManager;

    @Test
    public void findMyPostTest() {
        Session session = entityManager.unwrap(Session.class);

    }

}