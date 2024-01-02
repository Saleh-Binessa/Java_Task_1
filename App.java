// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

class Main {
  public static void main(String[] args) {
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
    System.out.println(" " + amount2 + " + " + amount2 + " = " + (amount2 + amount2));
    String fullName = "John doe";
    System.out.println( " My name is " + FirstName.toUpperCase() + " and my last name length is " + LastName.length());

    boolean isStartWithD = LastName.startsWith("D");
    System.out.println(" The last name starts with D? " + isStartWithD);
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}