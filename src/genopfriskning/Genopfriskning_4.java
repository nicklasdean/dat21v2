package genopfriskning;

public class Genopfriskning_4 {
    public static void main(String[] args) {
        square(5,'@');
    }
    public static void square(int amount, char c){
        for (int i = 0; i < amount; i++) {
            for (int j = 0; j < amount; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
