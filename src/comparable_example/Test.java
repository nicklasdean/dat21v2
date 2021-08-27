package comparable_example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        RedditPost post1 = new RedditPost("Cats are huge", "www.cats.org",29);
        RedditPost post2 = new RedditPost("Dogs are cute", "www.dog.org",10);
        RedditPost post3 = new RedditPost("Trump is awesome", "www.trump.org",30);
        RedditPost post4 = new RedditPost("Ikke så kreativ", "www.dyvad.com,",1);

        ArrayList<RedditPost> frontPage = new ArrayList<RedditPost>(Arrays.asList(post1,post2,post3,post4));

        System.out.println(frontPage);

        Collections.sort(frontPage);
        Collections.reverse(frontPage);

        System.out.println(frontPage);

        System.out.println(post1.compareTo(post2));
    }
}
