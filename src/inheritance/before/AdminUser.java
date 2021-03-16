package inheritance.before;

import java.util.Random;

public class AdminUser {
    private String username;
    private String password;
    private String email;

    public AdminUser(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String generateNewPassword(){
        Random r = new Random();
        String newPassword = "";
        for(int i = 0 ; 10 > i ; i++){
            char c = 'a';
            c += r.nextInt(20);
            newPassword = newPassword.concat(String.valueOf(c));
        }
        this.password = newPassword;
        return newPassword;
    }

    //Not implemented yet
    public String showStatistics(){
        return "I will now show you the statistics";
    }
}