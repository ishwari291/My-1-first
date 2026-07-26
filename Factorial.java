import java.until.scanner;

public class factorial {
     public static void main(string[] args)
        scanner sc = new scanner(system.in);
       system.out.print("Enter a number:");
      int n = sc,nextInt();

long factorial = 1;

for (int i = 1; i<= n; i++) {
       factorial *= i;
}
system.out.printLn("factorial = " + factorial);
