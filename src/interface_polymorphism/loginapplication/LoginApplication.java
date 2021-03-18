package interface_polymorphism.loginapplication;

import java.util.ArrayList;

public class LoginApplication {
    //In this example - we are logging in by different web services & taking advantage of polymorphism
    public static void main(String[] args) {
        FacebookUser f1 = new FacebookUser();
        FacebookUser f2 = new FacebookUser();

        GoogleUser g1 = new GoogleUser();
        GoogleUser g2 = new GoogleUser();

        TwitterUser t1 = new TwitterUser();

        ArrayList<Loginable> userArrayList = new ArrayList<Loginable>();
        userArrayList.add(f1);
        userArrayList.add(f2);
        userArrayList.add(g1);
        userArrayList.add(g2);

        for(int i = 0 ; i < userArrayList.size();i++){
            userArrayList.get(i).login();
        }
    }
}
