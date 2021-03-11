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

    @Override
    public boolean equals(Object personParameter){
        //Casting
        Person personAsPersonObject = (Person) personParameter;
        if(this.cpr == personAsPersonObject.getCpr()){
            return true;
        }
        else{
            return false;
        }
    }
}
