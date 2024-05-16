
public class Main {
    public static void main(String[] args) {
        Integer s;
        System.out.println("hi?");
        try {
             s = Input.getInput();
        } catch (IllegalStateException e) {
            System.out.println("Please enter a number");
        }


    }
}