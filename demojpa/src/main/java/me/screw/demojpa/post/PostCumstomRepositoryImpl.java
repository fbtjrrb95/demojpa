package me.screw.demojpa.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class PostCumstomRepositoryImpl implements PostCumstomRepository {

@Autowired
    EntityManager entityManager;

@Override
public List<Post> findMyPost() {
        System.out.println("custom findMyPost");
        return entityManager.createQuery("SELECT p FROM Post AS p", Post.class)
        .getResultList();
        }
        }
