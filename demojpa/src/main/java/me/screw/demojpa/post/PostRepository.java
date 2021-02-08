package me.screw.demojpa.post;

import me.screw.demojpa.MyRepository;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PostRepository extends MyRepository<Post, Long> {
}
