import java.util.*;
import java.lang.String;
public class Demo {
    public static void main(String[] args) {
        int j=65;
        while(j<=67) {
            int i = 65;
            while (i <= j) {
                System.out.print((char) i);
                i++;
            }
            j++;
            System.out.println();
        }
    }
}
