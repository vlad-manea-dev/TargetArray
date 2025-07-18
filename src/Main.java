import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("How many numbers do you want: ");
    int numberCount = sc.nextInt();
    int[] userNumbers = new int[numberCount];
    System.out.println("Enter the target value: ");
    int targetValue = sc.nextInt();
    System.out.println("Enter the distance: ");
    int distance = sc.nextInt();
    int res = 0;
    for (int i = 0; i < numberCount; i++) {
      System.out.println("Enter element: ");
      int element = sc.nextInt();
      userNumbers[i] = element;
      int difference = element - targetValue;
      int absDifference = Math.abs(difference);
      if (absDifference <= distance) {
        res++;
        System.out.println(res);
      }
    }
    sc.close();
  }
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

