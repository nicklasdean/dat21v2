package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemovingElements {
    public static void main(String[] args) {
        ArrayList<String> mailingList = new ArrayList<String>();
        mailingList.add("spam");
        mailingList.add("nifr@kea.dk");
        mailingList.add("bill@microsoft.com");
        mailingList.add("null");
        mailingList.add("invalid mail adress");
        mailingList.add("steve@apple.com");
        mailingList.add("someoneATsomewhere.io");
        mailingList.add("spambot");


        System.out.println(mailingList);

        for (int i = 0; i < mailingList.size(); i++) {
            if(!mailingList.get(i).contains("@")){
                mailingList.remove(i);
            }
        }

        System.out.println(mailingList);
    }
}
