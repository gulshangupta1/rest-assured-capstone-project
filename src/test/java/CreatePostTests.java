import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import posts.PostsService;
import posts.createPost.CreatePostRequestBody;
import posts.createPost.CreatePostResponse;
import users.UsersService;

public class CreatePostTests {
    private PostsService postsService;

    @BeforeClass
    public void beforeClass() {
        postsService = new PostsService();
    }

    @Test
    public void shouldCreatePost() {
        // 1. Arrange
        CreatePostRequestBody requestBody = new CreatePostRequestBody.Builder()
                .build();

        // 2. Act
        CreatePostResponse createPostResponse = postsService.createUserPosts(requestBody);

        // 3. Assert
        createPostResponse.assertPost(requestBody);
    }
}