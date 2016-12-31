import java.util.Arrays;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Conditionals {

  public static void main (String args[]) {

    fizzMultipleOfThree(6);

    cigarParty(150, true);

    caughtSpeeding(61, false);

    System.out.println(alarmClock(1, false));

    System.out.println(blackJack(25,22));

    System.out.println(evenSpaced(6,4,2));


    lotteryTicket(3,3,3);
  }

  public static boolean isOdd(int i){
    return !(i%2==0);
  }

  public static boolean isMultipleOfThree(int i){
    return i%3==0;
  }

  public static boolean isOddAndMultipleOfThree(int i){
    return isOdd(i) && isMultipleOfThree(i);
  }

  public static boolean isOddAndisMultipleOfThree2(int i){
    if((i%3 == 0) && !(i%2==0)){
      return true;
    }else
      return false;
  }

  public static void fizzMultipleOfThree(int i){
    if(isMultipleOfThree(i)){
      System.out.println("fizz");
    }
  }


  public static boolean fromLondon(Person person){
    return person.getCity() == "London";
  }

  public static void bigNameOrNah(Person person){
    if(person.getName().length() > 4){
      System.out.println(person.getName());
    }else
      System.out.println("name too short");
  }

  public static boolean cigarParty(int numCigars, boolean isWeekend){
    if((numCigars >= 40) && (isWeekend == true)){
      return true;
    }
    if((numCigars <= 60) && (numCigars >= 40)){
      return true;
    }
    return false;
  }

  public static int caughtSpeeding(int speed, boolean isBirthday){
    speed = (isBirthday) ? speed-5:speed;

    if(speed < 61){
      System.out.println("no ticket");
      return 0;
    }else if(speed < 81){
      System.out.println("small ticket");
      return 1;
    }else
      System.out.println("getting hauled off to jail!");
      return 2;
  }

  public static String alarmClock(int day, boolean onVacay){
    boolean weekend = (day == 0 || day == 6);

    if(weekend && onVacay){
      return "off";
    }else if(onVacay || weekend){
      return "10:00";
    }else
      return "7:00";
  }

  public static int lotteryTicket(int a, int b, int c){
    int total = 0;
    if(a == b||a == c){
      total += 10;
    }if(b == c){
      total+=10;
    }
    return total;
  }

  public static int blackJack(int y, int z){
    int larger = 0;
    if(y > 21){
      y = -1;
    }
    if(z > 21){
      z = -1;
    }
    if (y==z) return y;
    if( y > z){
      larger = y;
    }else if( z > y){
      larger = z;
    }
    return larger;
  }


  public static boolean evenSpaced(int x, int y, int z){
    int[] arr = new int[] {x,y,z};
    Arrays.sort(arr);

    int result = (arr[2]-arr[0])/2;

    return (arr[0]+result) == arr[1];

  }



}
