import java.util.Scanner;
public class basic1 {
  public static void countDigits(int n){
    int cnt=0;
    while(n>0){
      cnt+=1;
      n=n/10;
    }
    System.out.println("No of digits:"+cnt);
  }
  
  public static void reverseNumber(int n){
    int rev=0;
    while(n>0){
      int r=n%10;
      rev=(rev*10)+r;
      n=n/10;
    }
    System.out.println("Reverse of a number is:"+rev);
  }
  
  public static void checkPalindrome(int n){
    int original=n;
    int rev=0;
    while(n>0){
      int r=n%10;
      rev=(rev*10)+r;
      n=n/10;
    }
    if(original==rev){
      System.out.println("The given number "+original+" is a Palindrome");
    }
    else{
      System.out.println("The given number "+original+" is not a Palindrome");
    }
  }
  
  public static void armstrongNo(int n){
  String st=String.valueOf(n);  
  int k=st.length();
  int original=n;
  int sum=0;
  while(n>0){
    int r=n%10;
    sum+=Math.pow(r,k);
    n=n/10;
  }
  if(original==sum){
    System.out.println("The given number "+original+" is an Armstrong number");
  }
  else{
    System.out.println("The given number "+original+" is not an Armstrong number");
  }
  }
  
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a no:");
    int n=sc.nextInt();
    sc.close();
    countDigits(n);
    reverseNumber(n);
    checkPalindrome(n);
    armstrongNo(1634);
  }
}
