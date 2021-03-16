package inheritance.before;

import java.util.Random;

public class User{
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String generateNewPassword(){
        Random r = new Random();
        String newPassword = "";
        for(int i = 0 ; 26 > i ; i++){
            char c = 'a';
            c += r.nextInt(20);
            newPassword = newPassword.concat(String.valueOf(c));
        }
        this.password = newPassword;
        return newPassword;
    }

    public boolean putInBasket(){
        //Not implemented
        return true;
    }
}