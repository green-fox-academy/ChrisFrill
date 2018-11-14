package blog.post;

import java.util.ArrayList;

public class Blog {
    ArrayList<BlogPost> blogPosts;

    public Blog() {
        blogPosts = new ArrayList<>();
    }

    public void add(BlogPost blogPost) {
        blogPosts.add(blogPost);
    }

    public void delete(int index) {
        blogPosts.remove(index);
    }

    public void update(int index, BlogPost blogPost) {
        blogPosts.set(index, blogPost);
    }

    @Override
    public String toString() {
        return "Blog{" +
                "blogPosts=" + blogPosts +
                '}';
    }
}
