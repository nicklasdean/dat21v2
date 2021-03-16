package inheritance.after;

public class AdminUser extends User{
    //1 more data attribute
    private String email;

    public AdminUser(String username, String password, String email){
        super(username, password);
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public String makeUsernameCapitalized(){
        return this.getUsername().toUpperCase();
    }
}
