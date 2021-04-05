import java.util.Arrays;
import java.util.List;

public class Staircase {
    public static void main(String[] args)
    {
        int n = 7;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i+j+1>=n)
                    System.out.print("#");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}
