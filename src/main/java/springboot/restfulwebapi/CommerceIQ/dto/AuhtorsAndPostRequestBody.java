package springboot.restfulwebapi.CommerceIQ.dto;

import java.util.List;

public class AuhtorsAndPostRequestBody {
	private List<PostRequestBody> posts;

    private AuthorsRequestBody authors;

    public AuhtorsAndPostRequestBody() {
    }

    public AuhtorsAndPostRequestBody(List<PostRequestBody> posts, AuthorsRequestBody authors) {
        this.posts = posts;
        this.authors = authors;
    }

    public List<PostRequestBody> getPosts() {
        return posts;
    }

    public AuhtorsAndPostRequestBody setPosts(List<PostRequestBody> posts) {
        this.posts = posts;
        return this;
    }

    public AuthorsRequestBody getAuthors() {
        return authors;
    }

    public AuhtorsAndPostRequestBody setAuthors(AuthorsRequestBody authors) {
        this.authors = authors;
        return this;
    }

}
