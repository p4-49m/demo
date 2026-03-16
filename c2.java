public class c2{
    
    // public static void nPrintln(String message, int n) {  
    // for (int i = 0; i < n; i++)
    //     System.out.println(message);
    
    
    // } 
    
    // public static void main(String[] args) {
    //     nPrintln("Welcome to Java", 5); 
    //     nPrintln("Computer Science", 15);
    // }

    // public static void main(String[] args) {
    //     int num = 1;
    //     change(num);
    // }

    // public static void change(int num) {
    //     System.out.println("Before  : " + num); // 1
    //     num ++; // 1+1
    //     System.out.println("After : " + num); // 2
    // }


    //     public static void main(String[] args) {
    //         int i = 5,  j = 2;
    //         int k = max(i, j);
    //         System.out.println("The maximum between " + i +  " and " + j + " is " + k);
    // }

    // /* Return the max between two numbers */
    // public static int max(int num1, int num2) {
    //     int result;

    //     if (num1 > num2)
    //     result = num1;
    //     else
    //     result = num2;

    //     return result;
    // }

    

    public static double max1(int num1, double num2) { 
        if (num1 > num2)
            return num1;
        else
            return num2;
    }
    public static double max2(double num1, int num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;     
  }
  static double x = max1(1, 2);
  public static void main(String[] args) {
    System.out.println(x);
  }


}

