/*Jimmy Bowens
 * Advanced Data Structures
 * November 25, 2014
 */

package project_5;
import java.util.*;
public class Main {
  Scanner getFirstInput;
  Scanner getSecondInput;
  Tree T1 = new Tree();
  Tree T2 = new Tree();
  Tree T3 = new Tree();
  public Main(){
    System.out.println("Enter an integer at to add to the list or DONE to stop entering integers");
    getFirstInput();
  }
 
  public void getFirstInput(){
    getFirstInput = new Scanner(System.in);
    try{
      String token = getFirstInput.next();
      if(token.matches("\\d+")){
        this.T1.add(Integer.valueOf(token));
        getFirstInput();
      }
      else if(token.equalsIgnoreCase("done")){
        System.out.println("All numbers have been collected and stored. Thank you!");
        runFirstTasks();
      }
      else{
        System.out.println("Only enter a single integer at a time or enter 'done' to stop entering integers");
        getFirstInput();
      }
    }catch (Exception e){
      getFirstInput();
    } 
  }
  
  public void getSecondInput(){
    getSecondInput = new Scanner(System.in);
    try{
      String token = getSecondInput.next();
      if(token.matches("\\d+")){
        this.T3.add(Integer.valueOf(token));
        getSecondInput();
      }
      else if(token.equalsIgnoreCase("done")){
        System.out.println("All numbers have been collected and stored. Thank you!");
        runSecondTasks();
      }
      else{
        System.out.println("Only enter a single integer at a time or enter 'done' to stop entering integers");
        getSecondInput();
      }
    }catch (Exception e){
      getSecondInput();
    } 
  }
  
  public void printInOrder(){
    System.out.println("================================IN ORDER========================================");
    this.T1.inOrder(this.T1.head);
  }
  
  public void countLeaves(){
    System.out.println("Total Leaf Count: " + this.T1.leafCount);
  }
  
  public void swapTrees(){
    System.out.println("================================T2 POST ORDER========================================");
    this.T1.swap(this.T1, this.T2);
    T2.postOrder(T2.head);
  }
  
  public void compareT1T2(){
    System.out.println("=================================TESTING IF T1 IS IDENTICAL TO T2=====================");
    System.out.println(this.T1.compare(this.T1, this.T2));
    getSecondInput();
  }
  
  public void compareT1T3(){
    System.out.println("=================================TESTING IF T1 IS IDENTICAL TO T3=====================");
    System.out.println(this.T1.compare(this.T1,this.T3));
  }
  
  public void runFirstTasks(){
    printInOrder();
    countLeaves();
    swapTrees();
    compareT1T2(); 
  }
  
  public void delete(){
    System.out.println("=================================DELETING 15 FROM T3=====================");
    this.T3.get(15);
  }
  
  public void runSecondTasks(){
    compareT1T3();
    delete();
  }

 public static void main(String[] args) {
   new Main();
 }

}
