package springboot.restfulwebapi.CommerceIQ.dto;

import java.util.List;

import springboot.restfulwebapi.CommerceIQ.model.Authors;

public class AuthorAndPostDto {
    public static class Author {
        private Long id;
        private String first_name;
        private String last_name;
        private String posts;

        public Author() {
        }

        public Author(Long id, String first_name, String last_name, String posts) {
            this.id = id;
            this.first_name = first_name;
            this.last_name = last_name;
            this.posts = posts;
        }

        public Long getId() {
            return id;
        }

        public Author setId(Long id) {
            this.id = id;
            return this;
        }

        public String getFirst_name() {
            return first_name;
        }

        public Author setFirst_name(String first_name) {
            this.first_name = first_name;
            return this;
        }

        public String getLast_name() {
            return last_name;
        }

        public Author setLast_name(String last_name) {
            this.last_name = last_name;
            return this;
        }

        public String getPosts() {
            return posts;
        }

        public Author setPosts(String posts) {
            this.posts = posts;
            return this;
        }
    }

    public static class Post {
        private Long id;
        private String title;
        private String author;
        private String viwes;
        private String reviews;

        public Post() {
        }

        public Post(Long id, String title, String author, String viwes, String reviews) {
            this.id = id;
            this.title = title;
            this.author = author;
            this.viwes = viwes;
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

        public String getAuthor() {
            return author;
        }

        public Post setAuthor(String author) {
            this.author = author;
            return this;
        }

        public String getViwes() {
            return viwes;
        }

        public Post setViwes(String viwes) {
            this.viwes = viwes;
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

    private Authors authors;
    private List<Post> posts;

    public AuthorAndPostDto() {
    }

    public AuthorAndPostDto(Authors authors, List<Post> posts) {
        this.authors = authors;
        this.posts = posts;
    }

    public Authors getAuthors() {
        return authors;
    }

    public AuthorAndPostDto setAuthors(Authors author) {
        this.authors = author;
        return this;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public AuthorAndPostDto setPosts(List<Post> posts) {
        this.posts = posts;
        return this;
    }
}
