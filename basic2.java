import java.util.Scanner;
public class basic2 {

  public static void primeNo(int n){
    if(n==1){
      System.out.println(n+" is not a prime number");
      return;
    }
    for(int i=2;i<=Math.sqrt(n);i++){
       if(n%i==0){
        System.out.println(n+" is not a prime number");
        return;
       }
    }
  System.out.println(n+" is a Prime Number");
  }

  public static void oddOrEven(int n){
    if(n%2==0){
      System.out.println(n+" is an even number");
    }
    else{
      System.out.println(n+" is an odd number");
    }
  }

  public static void positiveOrNegative(int n){
    if(n<0){
      System.out.println(n+" is a negative number");
    }
    else{
      System.out.println(n+" is a positive number");
    }
  }

  public static void allPalindromeNumbers(int min,int max){
    System.out.println("Palindrome numbers in a specified range:");
    for(int i=min;i<=max;i++){
      if(isPalindrome(i)){
        System.out.print(i+" ");
      }
    }
  }

  public static boolean isPalindrome(int n){
    int rev=0;
    int original=n;
    while(n>0){
      int r=n%10;
      rev=rev*10+r;
      n=n/10;
    }
    if(rev==original){
      return true;
    }
    return false;
  }
  public static void sumOfAllNumbers(int n){
    int sum=0;
    for(int i=1;i<=n;i++){
      sum+=i;
    }
    System.out.println("Sum of all numbers is:"+sum);
  }
  
  public static void checkLeapYear(int n){
    if(n%400==0 || (n%4==0 && n%100!=0)){
      System.out.println(n+" is a leap year");
    }
    else{
      System.out.println(n+" is not a leap year");
    }
  }

  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int n=sc.nextInt();
    primeNo(n);
    oddOrEven(n);
    positiveOrNegative(n);
    allPalindromeNumbers(100,150);
    sumOfAllNumbers(n);
    System.out.println("Enter a year:");
    int year=sc.nextInt();
    checkLeapYear(year);
    sc.close();
  }
}
