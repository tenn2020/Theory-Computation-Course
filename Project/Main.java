import TuringMachine;
import tm.*;

public class Main {
    public static void public static void main(String[] args) {
        
        TuringMachine tM1Machine = MarchinesLibrary.EqualBinaryWords();

        boolean done = tM1Machine.Run("010000110101#010000110101", false);
        
        if (done == true) {
            System.out.println("Input Accepted.");
        }
        else {
            System.out.println("Input Rejected.");
        }
        
    }
}
