/**
 * Created by alexandraqin on 4/14/15.
 */
public class Variables {

  public static void main (String args[]) {
    int oneThirteen = 113;
    double possiblyE = 2.71828;
    String compSciString = "Computer Science";

    System.out.println("room # " + oneThirteen);
    System.out.println("e is close to " + possiblyE);
    System.out.println("Learning " + compSciString);
    System.out.println(isOdd(4));
  }

  public static boolean isOdd(double someNumber){
    return !(someNumber%2==0);
  }

  public static void printHelloWorld(){
    System.out.println("Hello World!");
  }

  public static void greatestCommonFactor(double someNumber){
    /**
     * some logic here
     * return nothing print two values.
     */
  }


}
