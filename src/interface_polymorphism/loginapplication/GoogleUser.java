package interface_polymorphism.loginapplication;

public class GoogleUser implements Loginable{
    private String username;
    private String password;

    @Override
    public String login(){
        //TODO: call the google login service
        return "Now logging in via Google";
    }
}
