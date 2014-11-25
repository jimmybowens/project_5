package Data_Structures_Project5;
import java.util.*;
public class Main {
  Scanner getInput;
  Tree T1 = new Tree();
  public Main(){
    System.out.println("Enter an integer at to add to the list or DONE to stop entering integers");
    getInput();
  }
 
  public void getInput(){
    getInput = new Scanner(System.in);
    try{
      String token = getInput.next();
      if(token.matches("\\d+")){
        this.T1.add(Integer.valueOf(token));
        getInput();
      }
      else if(token.equalsIgnoreCase("done")){
        System.out.println("All numbers have been collected and stored. Thank you!");
        runTasks();
      }
      else{
        System.out.println("Only enter a single integer at a time or enter 'done' to stop entering integers");
        getInput();
      }
    }catch (Exception e){
      getInput();
    } 
  }
  
  public void printInOrder(){
    System.out.println("================================IN ORDER========================================");
    this.T1.inOrder(this.T1.head);
  }
  
  public void swapTrees(){
    System.out.println("================================Swap Trees========================================");
   // Tree T2 = new Tree();
   // this.T1.swap(this.T1.head, T2);
    // T2.inOrder(T2.head);
  }
  
  public void runTasks(){
    printInOrder();
    swapTrees();
  }

 public static void main(String[] args) {
   new Main();
 /* Tree binary = new Tree();
  binary.add(9);
  binary.add(60);
  binary.add(0);
  binary.add(60);
  binary.add(0);
  binary.add(0);
  binary.add(83);
  binary.add(85);
  
  System.out.println("In Order___________________________________________");
  binary.inOrder(binary.head);
  System.out.println("Pre Order__________________________________________");
  binary.preOrder(binary.head);
  */
 }

}
