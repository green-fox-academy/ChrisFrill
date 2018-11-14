package blog.post;

public class BlogPost {

    String authorName;
    String title;
    String text;
    String publicationDate;

    @Override
    public String toString() {
        return "BlogPost{" +
                "authorName='" + authorName + '\'' +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", publicationDate='" + publicationDate + '\'' +
                '}';
    }
}
