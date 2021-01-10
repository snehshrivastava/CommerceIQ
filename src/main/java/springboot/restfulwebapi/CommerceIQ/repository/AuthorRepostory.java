package springboot.restfulwebapi.CommerceIQ.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.restfulwebapi.CommerceIQ.model.Authors;





public interface AuthorRepostory extends JpaRepository<Authors,Long> {
    public Authors findByFirstName(String firstName);
    public Authors findByLastName(String lastName);
    public Authors findByFirstNameAndLastName(String firstName,String lastName);
}
