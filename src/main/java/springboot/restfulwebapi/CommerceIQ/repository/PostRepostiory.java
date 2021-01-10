package springboot.restfulwebapi.CommerceIQ.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.restfulwebapi.CommerceIQ.model.Post;



public interface PostRepostiory extends JpaRepository<Post,Long> {

    public Post findByTitle(String title);
}
