package springboot.restfulwebapi.CommerceIQ.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "authors")
public class Authors {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true,
            mappedBy = "authors")
    private List<Post> postsDetailsList = new ArrayList<>();

    public Authors(Long id, String firstName, String lastName, List<Post> str) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.postsDetailsList = str;
    }

    public Authors() {
    }

    public Long getId() {
        return id;
    }

    public Authors setId(Long id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Authors setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Authors setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public List<Post> getPostsDetailsList() {
        return postsDetailsList;
    }

    public Authors setPostsDetailsList(List<Post> postsDetailsList) {
        this.postsDetailsList = postsDetailsList;
        return this;
    }
}
