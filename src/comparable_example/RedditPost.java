package comparable_example;

public class RedditPost implements Comparable<RedditPost>{
    private String title;
    private String content;
    private int upvotes;

    public RedditPost(String title, String content, int upvotes) {
        this.title = title;
        this.content = content;
        this.upvotes = upvotes;
    }

    public void upvote(){
        upvotes++;
    }

    public void downvote(){
        upvotes--;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getUpvotes() {
        return upvotes;
    }

    @Override
    public String toString() {
        return "Upvotes: " + this.upvotes;
    }

    @Override
    public int compareTo(RedditPost other){
        if(this.upvotes > other.getUpvotes()){
            return 1;
        }
        else if(this.upvotes < other.getUpvotes()){
            return -1;
        }
        else{
            return 0;
        }
    }
}
