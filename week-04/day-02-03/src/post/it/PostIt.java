package post.it;

import java.awt.*;

public class PostIt {

    Color backgroundColor;
    String text;
    Color textColor;

    public static void main(String[] args) {
        PostIt orange = new PostIt();
        orange.backgroundColor = Color.orange;
        orange.text = "Idea 1";
        orange.textColor = Color.blue;

        PostIt pink = new PostIt();
        pink.backgroundColor = Color.pink;
        pink.text = "Awesome";
        pink.textColor = Color.black;

        PostIt yellow = new PostIt();
        yellow.backgroundColor = Color.yellow;
        yellow.text = "Superb!";
        yellow.textColor = Color.green;
    }
}
