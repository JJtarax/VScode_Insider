package _5_4;

public class Dog {

   private String breed;
   private String eyeColor;

   public Dog(String breed, String eyeColor) {
      this.breed = breed;
      this.eyeColor = eyeColor;
   }

   public void maxSpeed() {

      System.out.print("The max speed is: ");

      if (breed == "German Shepherds") {
         System.out.println("30 mph");
      } else if (breed == "Saluki") {
         System.out.println("42.8 mph");
      } else if (breed == "Shih Tzu") {
         System.out.println("8 mph");
      } else {
         System.out.println("15 mph");
      }
   }

   public void canSeeInNight() {

      System.out.print("Can see in the dark: ");

      if (eyeColor == "Blue") {
         System.out.println("true");
      } else if (eyeColor == "Brown") {
         System.out.println("false");
      } else {
         System.out.print("false");
      }
   }
}

// Dog steve
// int steve