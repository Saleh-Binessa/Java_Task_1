public class App {
    public static void main(String[] args) throws Exception {
        // import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

      String FirstName = "John";
      String LastName = "Doe";
      int Age = 24;
      int amount = 178;
      boolean isMarried = false;
      System.out.println(" First Name: " + FirstName +  "\n Last Name: " + LastName + "\n Age: " + Age + "\n Amount: " + amount + "\n Married: " + isMarried);
  
      int amount1 = 20;
      String deposit = "Deposit";
      String withdraw = "Withdraw";
  
      System.out.println("\n\n The amount is  " + amount1 + "KD" + "\n Would you like to Deposit or Withdraw the amount? \n");
    int amount2 = 5;
      System.out.println(" " + amount2 + " + " + amount2 + " = " + (amount2 + amount2) + "\n");
      String fullName = "John doe";
      System.out.println( " My name is " + FirstName.toUpperCase() + " and my last name length is " + LastName.length());
  
      boolean isStartWithD = LastName.startsWith("D");
      System.out.println(" The last name starts with D? " + isStartWithD);

      double amountKWD = 86;

      System.out.println("\n\n" + amountKWD + " KWD = " + (amountKWD * 3.25) + " USD");
      System.out.println("\n" + amountKWD + " KWD = " + (amountKWD * 2.92) + " EUR");

    }
  
    // @Test
    // void addition() {
    //     assertEquals(2, 1 + 1);
    // }
  }
