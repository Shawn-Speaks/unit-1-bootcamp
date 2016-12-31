/**
 * Created by alexandraqin on 4/14/15.
 */
public class Methods {

  public static void main (String args[]) {

    System.out.println(calculateSquare(10));

    System.out.println(calculateSquareRoot(169));


    prettyInteger(7);

    System.out.println(random(13,69));
  }

  public static double calculateSquare(double n){
    return Math.pow(n, 2);
  }

  public static double calculateSquareRoot(double n){
    return Math.pow(n, .5);
  }

  public static String toLowerCase(String str){
    return str.toLowerCase();
  }

  public static boolean isMultiple(int x, int y){
    return (x%y==0);
  }

  public static void prettyInteger(int n){
    for(int i = 0; i < n; i++){
      System.out.print("*");
    }
    System.out.print(" "+n+" ");
    for(int i = 0; i < n; i++){
      System.out.print("*");
    }
    System.out.println(" ");
  }

  public static int random (int lowerBound, int upperBound){
    return lowerBound + (int)(Math.random()*((upperBound-lowerBound)+1));
  }

}
