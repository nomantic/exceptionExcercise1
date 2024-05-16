
import java.util.InputMismatchException;
import java.util.Scanner;


public class Input {
        public static Integer getInput() throws IllegalStateException {
        try{
            Scanner scanner = new Scanner(System.in);
            Integer s = scanner.nextInt();
            return s;
        }catch(InputMismatchException e){
        throw new IllegalStateException();
        }
        }
}
