import java.util.ArrayList;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Loops {

  public static void main (String args[]) {

//    int number = sumNumbers("abc123xyz1");
//    System.out.println(number);

//    String temp = "this is how this works";
//    String fixed = temp.replace("this", "RAP");
//
//    System.out.println(fixed);
//
//    forPrint();
//
//    whilePrint();

//    forPrint2(20);

//    printEvens(6);

//    sumnation(10000);

//    funkyFunction(-2, "Hello world!");

//    funkyFunction2(2, "Hello world! ");


//    fibonacci(15);

//    System.out.println(isNot("this is right"));

//    System.out.println(betweenWords("XY123XY", "XY"));

//    numberPuzzle();

//    digits();
  }


  public static void forPrint(){
    for(int i = 1; i < 11; i++){
      System.out.println(i);
    }
  }

  public static void whilePrint(){
    int i = 1;
    while(i < 11){
      System.out.println(i);
      i++;
    }
  }

  public static void forPrint2(int n){
    if(n > 1){
      for(int i = 1; i <= n; i++){
        System.out.println(i);
      }
    }
  }

  public static void printEvens(int n){
    if(n > 2){
      for(int i = 2; i <= n; i+=2){
        System.out.println(i);
      }
    }
  }

  public static void sumnation(int n){
    int total = 0;
    if(n > 1){
      for(int i = 1; i <= n; i++){
        total += i;
      }
    }
    System.out.println(total);
  }

  public static void funkyFunction(int n, String s){
    if(n < 0) {
      System.out.println("");
    }else {
      while (n > 0) {
        System.out.println(s);
        n--;
      }
    }
  }

  public static void funkyFunction2(int n, String s){
    String temp = "";
    if(n < 0) {
      System.out.println(temp);
    }else {
      while (n > 0) {
        temp += s;
        n--;
      }
    }
    System.out.println(temp);
  }

  public static void fibonacci(int n){
    int previous = 0;
    int current = 0;
    int temp = 0;

    for (int i = 0; i < n; i++){
      System.out.println(current);
      if(current + previous == 0){
        current++;
      }else{
        temp = current;
        current = current + previous;
        previous = temp;
      }
    }
  }

  public static int sumNumbers(String inputString){
    String appendNumbers = "";
    int total = 0;

    for(int idx = 0; idx < inputString.length(); idx++){
        if(Character.isDigit(inputString.charAt(idx))){
          appendNumbers += inputString.charAt(idx);
        }else{
          if(!(appendNumbers.equals(""))) {
            total += Integer.parseInt(appendNumbers);
          }
            appendNumbers = "";
        }
    }
    if(!(appendNumbers.equals(""))) {
      total += Integer.parseInt(appendNumbers);
    }
    return total;
    }

  public static String isNot(String input){
    String newString = " " + input + " ";

    for(int idx = 0; idx < newString.length(); idx++){
      if(newString.charAt(idx) == 'i' && newString.charAt(idx+1) == 's'){
        if(!(Character.isLetter(newString.charAt(idx-1))) && !(Character.isLetter(idx+2))){
          newString = newString.substring(0, idx) + "is not" + newString.substring(idx+2, newString.length()-1) + " ";
        }
      }
    }
    return newString.substring(1, newString.length()-1);
  }

  public static String betweenWords(String fullString, String str2){
    ArrayList<Integer> listOfIdxOfStr2 = new ArrayList<>();
    int idx = fullString.indexOf(str2);
    int str2Size = str2.length();
    String outputStr = "";

    while(idx >= 0){

      listOfIdxOfStr2.add(idx);
      idx = fullString.indexOf(str2, idx + 1); //RETURNS -1 if an instance cannot be found
    }

    for(Integer i: listOfIdxOfStr2){
      if(i == 0){
        outputStr += fullString.charAt(i + str2Size) + "";
      }else if(i+str2Size >= fullString.length()){
        outputStr+= fullString.charAt(i-1);
      }else{
        outputStr += fullString.charAt(i-1);
        outputStr += fullString.charAt(i+str2Size);
      }
    }
    return outputStr;
  }


  public static void numberPuzzle(){
    for(double i = 0; i < 60; i++){
      for(double j = 0; j < 60; j++){
        if((i + j == 60) && ((Math.abs(i-j) == 14) || (Math.abs(j-i) == 14))){
          System.out.println("A pair of " + i + " " + j);
        }
      }
    }
  }

  public static void digits(){
    for(int i = 1; i < 10; i++){
      for(int j = 0; j < 10; j++){
        String tensDig = String.valueOf(i);
        String onesDig = String.valueOf(j);
        String combined = tensDig + onesDig;
        int math = i+j;
        System.out.println(combined+", "+ tensDig+"+"+onesDig+"="+ math);
      }
    }


  }


}

