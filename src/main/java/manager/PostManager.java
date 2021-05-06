package manager;

import domain.Post;

import java.util.List;

public class PostManager {
    private List<Post> posts;

    public Post[] search(String owner_id, String domain, String query, String owners_only, String count, String offset) {
        return null;
    }

    public void delete(int ownerId, int postId) {
        for (Post post : posts) {
            if (post.getId() == postId && post.getUserInfo().getId() == ownerId) {
                posts.remove(post);
                return;
            }
        }
    }
}
