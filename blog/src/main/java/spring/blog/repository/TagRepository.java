package spring.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.blog.model.Tag;

@Repository
public interface TagRepository extends JpaRepository<Tag,Long> {
    Tag findById(Integer id);
}
