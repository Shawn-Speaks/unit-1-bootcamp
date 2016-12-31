import com.sun.tools.javac.util.List;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * Created by alexandraqin on 4/14/15.
 */
public class ClassesAndObjects {

  public static void main (String args[]) {


    Cat garfield = new Cat("Garfield");
    Cat pinkPanther = new Cat("Pink Panther");
    Cat catWoman = new Cat("Catwoman");

    garfield.setFavoriteFood("Lasagna");
    pinkPanther.setFavoriteFood("Paint");
    catWoman.setFavoriteFood("Clam Chowder");

    garfield.setAge(9);
    catWoman.setAge(10);
    pinkPanther.setAge(52);

    System.out.println(isOlder(garfield, catWoman));

    bestFriends(catWoman, garfield);

    System.out.println(garfield.getFavoriteFood());

    Cat mysteryKitten = makeKitten(pinkPanther, catWoman);

    System.out.println(mysteryKitten.getName());

    Person ramona = new Person("Ramona the cat lover");

    adoption(mysteryKitten, ramona);

    System.out.println(mysteryKitten.getOwner().getName());

    System.out.println(isFree(garfield));


  }

  public static boolean isOlder(Cat cat1, Cat cat2){
    return cat1.getAge() > cat2.getAge();
  }

  public static void bestFriends(Cat cat1, Cat cat2){
      cat2.setFavoriteFood(cat1.getFavoriteFood());
  }


  public static Cat makeKitten(Cat cat1, Cat cat2){
    return new Cat(cat1.getName() + cat2.getName(), 0);
  }

  public static void adoption(Cat cat, Person person){
    if(cat.getName().equals("Catwoman")){
      System.out.println("Catwoman will never be anyone's pet!");
    }else
    cat.setOwner(person);
  }

  public static boolean isFree (Cat cat){
    if(cat.getOwner() == null){
      return true;
    }
    return false;
  }

  public static boolean isSibling(Cat cat1, Cat cat2){
    if(cat1.getOwner() == null || cat2.getOwner() == null){
      return false;
    }
    return cat1.getOwner() == cat2.getOwner();
  }


}
