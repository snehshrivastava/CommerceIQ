package springboot.restfulwebapi.CommerceIQ.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "post", indexes = {@Index(columnList = "title", name = "idx_title"),
        @Index(columnList = "views", name = "idx_views"),
        @Index(columnList = "reviews", name = "idx_reviews")})
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "author_id")
    private Authors authors;

    @Column(name = "views")
    private String views;

    @Column(name = "reviews")
    private String reviews;

    public Post() {
    }

    public Post(Long id, String title, Authors authors, String views, String reviews) {
        this.id = id;
        this.title = title;
        this.authors = authors;
        this.views = views;
        this.reviews = reviews;
    }

    public Long getId() {
        return id;
    }

    public Post setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Post setTitle(String title) {
        this.title = title;
        return this;
    }

    public Authors getAuthors() {
        return authors;
    }

    public Post setAuthors(Authors authors) {
        this.authors = authors;
        return this;
    }

    public String getViews() {
        return views;
    }

    public Post setViews(String views) {
        this.views = views;
        return this;
    }

    public String getReviews() {
        return reviews;
    }

    public Post setReviews(String reviews) {
        this.reviews = reviews;
        return this;
    }
}

