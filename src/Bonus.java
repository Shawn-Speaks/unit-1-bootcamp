import java.util.HashMap;

/**
 * Created by shawnspeaks on 12/31/16.
 */
public class Bonus {

    public static void main(String[] args) {
//        fizzbuzz3();

          longestCollatz();
    }

    public static int projEuler1(){
        int sum = 0;
        for(int i = 0; i < 1000; i++){
            if(i%3 == 0 || i%5 == 0){
                sum+= i;
            }
        }
        return sum;
    }

    public static void fizzbuzz2(){
        for(int i = 0; i < 1000; i++){
            if(i%15 == 0){
                System.out.println("fizzbuzz");
            }else if(i%3==0){
                System.out.println("fizz");
            }else if(i%5==0){
                System.out.println("buzz");
            }else
                System.out.println(i);
        }
    }


    public static void fizzbuzz3(){
        for(int i = 0; i < 1000; i++){
            String current = String.valueOf(i);
            if(current.contains("3") && current.contains("5")){
                System.out.println("fizzbuzz");
            }else if(current.contains("3")){
                System.out.println("fizz");
            }else if(current.contains("5")){
                System.out.println("buzz");
            }else
                System.out.println(current);
        }
    }

    public static void longestCollatz(){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 2; i < 1000000; i++){
            int temp = i;
            int count = 0;
            while(temp != 1){
                temp = preformCollatz(temp);
                count++;
            }
            map.put(i, count);
        }

        int collatzNumWithMostCombos = 0;
        int numOfCombos = 0;
        for(Integer i: map.keySet()){
            if(map.get(i) > numOfCombos){
                numOfCombos =  map.get(i);
                collatzNumWithMostCombos = i;
            }
        }

        System.out.println("Number with most collatz combos is " + collatzNumWithMostCombos + ", with " + numOfCombos + "combos");
    }

    public static int preformCollatz (int number){
        if(number%2==0){
            return (number/2);
        }else
            return number*3+1;
    }

}
