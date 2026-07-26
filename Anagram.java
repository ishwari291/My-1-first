import java.util.Arrays;

public class AnagramCHECKER {
      Public static void main(string[] args)
           String s1 = "listen";
           String s2 = "listen":

           char[] a1 = s1.toCharArray();
           char[] a2 = s2.toCharArray();

               Arrays.sort(a1);
               Arrays.sort(a2);

            system.out.println(Arrays.equals(a1 , a2) ? "Anagram" : "Not Anagram");
    }
}
