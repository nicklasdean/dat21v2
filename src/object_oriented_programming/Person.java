package object_oriented_programming;

public class Person {
    private int cpr;
    private String name;

    public Person(int cpr, String name){
        this.cpr = cpr;
        this.name = name;
    }

    //Getter
    public int getCpr(){
        return this.cpr;
    }

    public String getName(){
        return this.name;
    }

    //Setter
    public void setName(String name){
        if(name == null){
            System.out.println("Name not changed");
        }
        else {
            this.name = name;
        }
    }
}
