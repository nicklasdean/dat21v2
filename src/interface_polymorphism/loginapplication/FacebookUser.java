package interface_polymorphism.loginapplication;

public class FacebookUser implements Loginable {
    private String username;
    private String password;

    @Override
    public String login(){
        //TODO: Call the facebook login service
        return "Now logging in via Facebook";
    }

    public void facebookSpecificFunctionality(){

    }
}
