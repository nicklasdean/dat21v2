package inheritance.after;

public class User {
    private String username;
    private String password;

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String generateNewPassword(){
        return "Test";
    }

    public String getUsername(){
        return this.username;
    }
}
