package springboot.restfulwebapi.CommerceIQ.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.CollectionUtils;
import org.springframework.stereotype.Service;

import main.java.net.guides.springboot2.springboot2jpacrudexample.service.AuthorsAndPostRequestBody;
import springboot.restfulwebapi.CommerceIQ.dto.AuthorAndPostDto;
import springboot.restfulwebapi.CommerceIQ.dto.PostRequestBody;
import springboot.restfulwebapi.CommerceIQ.exception.BadRequestException;
import springboot.restfulwebapi.CommerceIQ.exception.ResourceNotFoundException;
import springboot.restfulwebapi.CommerceIQ.model.Authors;
import springboot.restfulwebapi.CommerceIQ.model.Post;
import springboot.restfulwebapi.CommerceIQ.repository.AuthorRepostory;
import springboot.restfulwebapi.CommerceIQ.repository.PostRepostiory;

@Service
public class PostAndAuthorSevice {

    @Autowired
    AuthorRepostory authorRepostory;

    @Autowired
    PostRepostiory postRepostiory;

    public AuthorAndPostDto getByTitleAndAuthorName(String title, String name) throws BadRequestException, ResourceNotFoundException {
        if (title == null || name == null) {
            throw new BadRequestException("Mandatory parameter are missing");
        }

        Post post = postRepostiory.findByTitle(title);
        if (post == null) {
            throw new ResourceNotFoundException("No post found for title: " + title);
        }
        Authors authors = post.getAuthors();
        if (authors == null) {
            throw new ResourceNotFoundException("No author found with name : " + name);
        }
        String authorsFullName = authors.getFirstName() + authors.getLastName();
        name = name.trim();
        authorsFullName = authorsFullName.trim();
        if (!authorsFullName.equalsIgnoreCase(name)) {
            throw new BadRequestException("Title written by author mismatched");
        }
        Integer totalPostByTheAuthor = authors.getPostsDetailsList().size();
        AuthorAndPostDto authorAndPostDto = new AuthorAndPostDto();
        authorAndPostDto.setAuthors(new Authors(authors.getId(), authors.getFirstName(), authors.getLastName(), totalPostByTheAuthor.toString()));
        List<AuthorAndPostDto.Post> listOfPosts = new ArrayList<>();
        listOfPosts.add(new AuthorAndPostDto.Post(post.getId(), post.getTitle(), authorsFullName, post.getViews(), post.getReviews()));
        authorAndPostDto.setPosts(listOfPosts);
        return authorAndPostDto;
    }

    public boolean createAuthorAndPostEntry(AuthorsAndPostRequestBody authorsAndPostRequestBody) throws BadRequestException {
        if (authorsAndPostRequestBody == null || authorsAndPostRequestBody.getAuthors() == null || CollectionUtils.isEmpty(authorsAndPostRequestBody.getPosts())) {
            throw new BadRequestException("Invalid request body");
        }

        Authors authors = new Authors();
        authors.setFirstName(authorsAndPostRequestBody.getAuthors().getFirst_name());
        authors.setLastName(authorsAndPostRequestBody.getAuthors().getLast_name());
        List<Post> listOfPost = new ArrayList<>();
        for (PostRequestBody postRequestBody : authorsAndPostRequestBody.getPosts()) {
            if (postRequestBody != null) {
                Post post = new Post();
                post.setAuthors(authors);
                post.setReviews(postRequestBody.getReviews());
                post.setTitle(postRequestBody.getTitle());
                post.setViews(postRequestBody.getViwes());
            }
        }
        authors.setPostsDetailsList(listOfPost);
        authorRepostory.save(authors);
        return true;
    }
}
