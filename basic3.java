public class basic3 {
  public static void allPrimeNumbers(int min,int max){
    System.out.println("Prime numbers present in between "+min+" and "+max);
    boolean found=false;
    for(int i=min;i<=max;i++){
      if(isPrime(i)){
        System.out.print(i+" ");
        found=true;
      }
    }
    if(!found){
      System.out.print("No prime numbers are found at the given range");
    }
  }
  public static boolean isPrime(int n){
    if(n<2){
      return false;
    }
    for(int i=2;i<=Math.sqrt(n);i++){
      if(n%i==0){
        return false;
      }
    }
    return true;
  }
  public static void greatestOfTwo(int a,int b){
    if(a<b){
      System.out.println(b+" is the greatest number");
    }
    else{
      System.out.println(a+" is the greatest number");
    }
  }
  public static void greatestOfThree(int a,int b,int c){
    if(a>b && a>c){
      System.out.println(a+" is the greatest among three numbers");
    }
    else if(b>a && b>c){
      System.out.println(b+" is the greatest among three numbers");
    }
    else{
      System.out.println(c+" is the greatest among three numbers");
    }
  }
  public static void areaOfCircle(int r){
    float pi=3.14f;
    float area=pi*r*r;
    System.out.println("Area of the circle is:"+area);
  }
  public static void sumOfDigits(int n){
    int sum=0;
    while(n>0){
      int r=n%10;
      sum+=r;
      n=n/10;
    }
    System.out.println("Sum of digits:"+sum);
  }
  public static void replaceZeroesWithOnes(int n){
    int result=0;
    int temp=1;
    while(n>0){
      int r=n%10;
      if(r==0){
        r=1;
      }
      result+=temp*r;
      temp*=10;
      n=n/10;
    }
    System.out.println("After replacing zeroes with ones:"+result);
  }
  public static void maxAndMinDigit(int n){
    n=Math.abs(n);
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    while(n>0){
      int r=n%10;
      max=Math.max(max,r);
      min=Math.min(min,r);
      n=n/10;
    }
    System.out.println("Maximum digit in a number is:"+max);
    System.out.println("Minimum digit in a number is:"+min);
  }
  public static void main(String[] args){
    allPrimeNumbers(10,16);
    greatestOfTwo(-23,-90);
    greatestOfThree(-45,23,-90);
    areaOfCircle(5);
    sumOfDigits(1732);
    replaceZeroesWithOnes(1020560);
    maxAndMinDigit(-91632);
  }
}
