package springboot.restfulwebapi.CommerceIQ.dto;

public class PostRequestBody {
	private String title;
    private String author;
    private String viwes;
    private String reviews;

    public PostRequestBody() {
    }

    public PostRequestBody(String title, String author, String viwes, String reviews) {
        this.title = title;
        this.author = author;
        this.viwes = viwes;
        this.reviews = reviews;
    }

    public String getTitle() {
        return title;
    }

    public PostRequestBody setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public PostRequestBody setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getViwes() {
        return viwes;
    }

    public PostRequestBody setViwes(String viwes) {
        this.viwes = viwes;
        return this;
    }

    public String getReviews() {
        return reviews;
    }

    public PostRequestBody setReviews(String reviews) {
        this.reviews = reviews;
        return this;
    }
}
