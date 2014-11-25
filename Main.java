package Data_Structures_Project5;
import java.util.*;
public class Main {
  Scanner getInput;
  Tree T1 = new Tree();
  public Main(){
    getInput();
  }
 
  public void getInput(){
    System.out.println("Enter an integer at to add to the list or DONE to stop entering integers");
    getInput = new Scanner(System.in);
    try{
      while(getInput.hasNext()){
        if(getInput.hasNextInt()){
          System.out.println(getInput.nextInt());
        }
        else if(getInput.next().equalsIgnoreCase("done")){
          System.out.println("Done");
        }
        getInput.next();
      }
      
    }catch (Exception e){
      getInput();
    } 
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
