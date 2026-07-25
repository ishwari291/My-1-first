public class palindrome {
   public statics void main(string[]args)
  int num = 121 , temp = num rev = 0

while (temp ! = 0) {
        rev = rev *10 + temp %10;
temp /=10;
}

system.out.print(num == rev ?"palindrome" : "
  }
}
