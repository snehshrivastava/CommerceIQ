package springboot.restfulwebapi.CommerceIQ.dto;

public class AuthorsRequestBody {
    private String first_name;
    private String last_name;
    private String posts;

    public AuthorsRequestBody() {
    }

    public AuthorsRequestBody(String first_name, String last_name, String posts) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.posts = posts;
    }

    public String getFirst_name() {
        return first_name;
    }

    public AuthorsRequestBody setFirst_name(String first_name) {
        this.first_name = first_name;
        return this;
    }

    public String getLast_name() {
        return last_name;
    }

    public AuthorsRequestBody setLast_name(String last_name) {
        this.last_name = last_name;
        return this;
    }

    public String getPosts() {
        return posts;
    }

    public AuthorsRequestBody setPosts(String posts) {
        this.posts = posts;
        return this;
    }
}
