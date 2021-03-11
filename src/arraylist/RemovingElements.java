package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

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

        //Instance of iterator object
        Iterator<String> mailingListIterator = mailingList.iterator();

        //As long as the iterator has a next object
        while(mailingListIterator.hasNext()){
            String currentString = mailingListIterator.next();
            if(!currentString.contains("@")){
                mailingListIterator.remove();
            }
        }

        System.out.println(mailingList);


        /*for (int i = 0; i < mailingList.size(); i++) {
            if(!mailingList.get(i).contains("@")){
                mailingList.remove(i);
            }
        }*/
    }
}
