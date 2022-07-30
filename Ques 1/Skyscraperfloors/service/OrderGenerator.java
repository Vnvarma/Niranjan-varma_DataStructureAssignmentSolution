package Skyscraperfloors.service;



  import java.util.Scanner;
  import java.util.Stack;
  
  public class OrderGenerator {
  
    public void orderCalulator() {
      Scanner vn = new Scanner(System.in);
  
      Stack<Integer> floorStack = new Stack<Integer>();
  
      int floorCount, input;
  
      System.out.println("Enter the total number of floors in the building ");
  
      floorCount = vn.nextInt();
  
      int floorList[] = new int[floorCount];
  
      for (int i = 0; i < floorCount; i++) {
        System.out.println("Enter the floor size given on day"+ " : "+(i + 1) );
        input = vn.nextInt();
        floorList[i] = input;
      }
  
      System.out.println("\nThe order of construction is as follows ");
  
      int foundation = floorCount;
  
      for (int i = 0; i < floorCount; i++) {
        System.out.println("\nDay" + ": "+(i + 1) );
        floorStack.push(floorList[i]);
  
        for (int j = 0; j < floorCount; j++) {
          if (floorStack.empty()) {
            break;
          }
          if (floorStack.peek() == foundation) {
            System.out.print(floorStack.pop() + " ");
            foundation--;
          }
        }
  
      }
  
    }
  
  }
  
  

