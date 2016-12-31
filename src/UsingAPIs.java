import java.util.HashSet;
import java.util.Set;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class UsingAPIs {

  public static void main (String args[]) {
    String[] arr = stringFlattener("Long string of text, to b;e fixe?d and for!matted and formattez");
    String numbersStd = "1, 2, 3, 4, 5, 6 one";
    String numberSpelled = "one two three four five six 1";

    String[] num1 = stringFlattener(numbersStd);
    String[] num2 = stringFlattener(numberSpelled);

    numUniqueWords(num1);
    numUniqueWords(num2);


    Set<String> set1 = getUniqueWordSet(num1);
    Set<String> set2 = getUniqueWordSet(num2);


    getUnionSet(set1, set2);

  }


  public static int numUniqueWords(String[] stringArr){
    Set<String> stringSet = new HashSet<String>();

    for(String s: stringArr){
      stringSet.add(s);
    }
    return stringSet.size();

  }

  public static String[] stringFlattener(String inputString){
    inputString = inputString.toLowerCase();
    String punctuation = "!?.,;";

    for(int idx = 0; idx < punctuation.length(); idx++){
      inputString = inputString.replace(punctuation.charAt(idx) + "" , ""); //removes all punctuation from string.
    }

    return inputString.split(" ");
  }

  public static Set getUniqueWordSet(String[] stringArr){
    Set<String> stringSet = new HashSet<>();

    for(String s: stringArr){
      stringSet.add(s);
    }

    return stringSet;
  }

  public static Set getUnionSet(Set<String> set1, Set<String> set2){
    Set<String> unionSet = new HashSet<String>();

    for(String s: set1){
      if(set2.contains(s)){
        unionSet.add(s);
      }
    }

    return unionSet;
  }


}


/**
 *
 *
 *  STRIPE API (ANDROID PAYMENTS)
 *    ~~ NOT DONE YET ~~
 *
 */