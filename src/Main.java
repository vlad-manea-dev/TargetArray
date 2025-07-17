import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  }
  public static int[] numStat(int[] nums){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter 6 numbers, each between 1 and 100: ");
    int[] userNumbers = new int[6];
    System.out.println("Enter the target value: ");
    int targetValue = sc.nextInt();
    System.out.println("Enter the distance: ");
    int distance = sc.nextInt();
    for (int i = 0; i < userNumbers.length; i++) {
      int element = userNumbers[i];
      int difference = element - targetValue;
      int absDifference = Math.abs(difference);
    }
    for (int totalCount = 0; totalCount <= 6; totalCount++) {
      if (int absDifference <= distance) {
        totalCount++;
      }
      return
    }

//    System.out.println("Enter the number of elements: ");
//    int numElements = sc.nextInt();
//    System.out.println("Enter element 1: ");
//    int elementOne = sc.nextInt();
//    System.out.println("Enter element 2: ");
//    int elementTwo = sc.nextInt();
//    System.out.println("Enter element 3: ");
//    int elementThree = sc.nextInt();
//    System.out.println("Enter element 4: ");
//    int elementFour = sc.nextInt();
//    System.out.println("Enter element 5: ");
//    int elementFive = sc.nextInt();
//    System.out.println("Enter element 6: ");
//    int elementSix = sc.nextInt();






  }
}
