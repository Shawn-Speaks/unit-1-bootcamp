import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class DataStructures {

  public static void main (String args[]) {
//  coolCatsII();
    ArrayList<Integer> al = new ArrayList<>();
    al.add(1);
    al.add(1);
    al.add(1);
    al.add(1);
    al.add(1);
    al.add(1);
    al.add(3);
    al.add(3);
    al.add(3);
    al.add(5);
    al.add(1008);

//    String temp = mostFrequestElement(al);
//    System.out.println(temp);
//    System.out.println(canRentCar(marshmellowGang()));
//
//
//    int[] arr = new int[] {1, 1, 1, 1, 1};
//    System.out.println(numClumps(arr));
//    int[] arr2 = new int[] {0,3,1,7,6,5};
//    sortArr(arr2);

      String[] strArray = new String[] {"trouble", "smash", "yeah", "flow", "picasso", "chicago"};
      sortSentence("trouble smash yeah flow picasso chicago");



  }


  public static void coolCatsII(){
    Cat cat1 = new Cat(" backwards cat 5 ");
    Cat cat2 = new Cat(" backwards cat 4 ");
    Cat cat3 = new Cat(" backwards cat 3 ");
    Cat cat4 = new Cat(" backwards cat 2 ");
    Cat cat5 = new Cat(" backwards cat 1 ");

    ArrayList<Cat> catBox = new ArrayList<>();
    catBox.add(cat1);
    catBox.add(cat2);
    catBox.add(cat3);
    catBox.add(cat4);
    catBox.add(cat5);

    for(Cat c: catBox){
      System.out.println(c.getName());
    }
  }


  public static String mostFrequestElement(ArrayList<Integer> arrayList){
    HashMap<String, Integer> map = new HashMap<>();

    for(Integer integer: arrayList){
      String strFormatInteger = String.valueOf(integer);

      if(!map.containsKey(strFormatInteger)){
        map.put(strFormatInteger, 1);
      }else
        map.put(strFormatInteger, (map.get(strFormatInteger)+1));
    }

    String mostOfNumber = "";
    Integer mostOccurances = 0;
    for(String s: map.keySet()){
      if(map.get(s) > mostOccurances){
        mostOccurances = map.get(s);
        mostOfNumber = s;
      }
    }

    return mostOfNumber + " is the most common number with " + mostOccurances + " occurances";
  }

  public static HashMap<String, Integer> marshmellowGang(){
    HashMap<String, Integer> marshMap = new HashMap<>();
    marshMap.put("Yojana", 29);
    marshMap.put("Taryn", 34);
    marshMap.put("Josiel", 27);
    marshMap.put("Rook", 36);
    marshMap.put("Natasha", 28); //NEVER FORGET
    marshMap.put("Speaks-sleezy", 26);


    for(String name: marshMap.keySet()){
      System.out.println(name + " is " + marshMap.get(name) + " years young.");
    }

    return marshMap;
  }

  public static boolean canRentCar(HashMap<String, Integer> map){
    int numOfRenters = 0;

    for (String s:map.keySet()) {
      if (map.get(s) > 25){
        numOfRenters++;
      }
      if (numOfRenters > 2){
        return true;
      }
    }
    return false;
  }


  public static ArrayList wordsWithoutList(String[] strArr, int ommitLength){
    ArrayList<String> arrayList = new ArrayList<>();
    for (String s:strArr) {
      if(s.length()!= ommitLength){
      arrayList.add(s);
      }
    }
    return arrayList;
  }


  public static int numClumps(int[] array){

    int count = 0;
    int last = array[0]+1;
    for(int idx = 0; idx < array.length-1; idx++){
      if((array[idx] == array[idx+1]) && (array[idx] != last)){
        count++;
      }
      last = array[idx];
    }
    return count;
  }

  public static ArrayList<String> sortSentence(String sentence){
    sentence = sentence.toLowerCase();
    String[] strArr = sentence.split(" ");
    ArrayList<String> answer = new ArrayList<>();

    for(int i = 0; i <strArr.length; i++){
      int idx = i;
      while( idx < strArr.length){
        String temp;
        if(firstStringFirst(strArr[i], strArr[idx])){
          temp = strArr[idx];
          strArr[idx] = strArr[i];
          strArr[i] = temp;
        }
        idx++;
      }
    }
    for(int j = 0; j < strArr.length; j++){
        answer.add(strArr[j]);
    }


    return answer;
  }

  public static void sortArr(int[] array){
    for(int i = 0; i < array.length; i++){
      int idx = i;
      while(idx < array.length){
        int temp;
        if(array[i] > array[idx]){
          temp = array[idx];
          array[idx] = array[i];
          array[i] = temp;
        }
        idx++;
      }
    }
    for(int j  = 0; j < array.length; j++){
      System.out.println(array[j]);
    }

  }

  public static boolean firstStringFirst(String str1, String str2){
    int smallerStrSize = !(str1.length() > str2.length()) ? str1.length():str2.length();
    int idx = 0;
    while(idx < smallerStrSize){
      int ascii1 = (int) str1.charAt(idx);
      int ascii2 = (int) str2.charAt(idx);
      if(ascii1 == ascii2){
        idx++;
        continue;
      }else if(ascii1 > ascii2){
        return false;
      }else
        return true;
    }
    return true;
  }



}
