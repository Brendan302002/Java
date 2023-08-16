package Chapter2Labs;

import java.util.Scanner;

public class PetInformation {
   
   /** 
    * @param args
    */
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      Pet myPet = new Pet();
      Cat myCat = new Cat();
      
      String petName, catName, catBreed;
      int petAge, catAge;

      petName = scnr.nextLine();
      petAge = scnr.nextInt();
      scnr.nextLine();
      catName = scnr.nextLine();
      catAge = scnr.nextInt();
      catBreed = scnr.nextLine();
      scnr.nextLine();
      myPet.setName(petName);
      myPet.setAge(petAge);
      myPet.printInfo();
      
      myCat.setName(catName);
      myCat.setAge(catAge);
      myCat.setBreed(catBreed);
      myCat.printInfo();
      System.out.println("   Breed: " + myCat.getBreed());
      
   }
}