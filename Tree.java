package Data_Structures_Project5;
public class Tree {
 Node head;
 int leafCount;
 
 public Tree(){}
 
 public void add(int index){
  Node newNode = new Node(index);
  if(head==null){
   head = newNode;
  }else{
   Node currentNode = head;
   Node parentNode;
   while(true){
    parentNode = currentNode;
    if(index < currentNode.index){
     currentNode = currentNode.left;
     if(currentNode == null){
      parentNode.left = newNode;
      return;
     }
    }
    else{
     currentNode = currentNode.right;
     if(currentNode == null){
      parentNode.right = newNode;
      return;
     }
    }
   }
  }
 }
 
 public void countLeaves(Node currentNode){
  if(currentNode != null){
   if(currentNode.left == null && currentNode.right == null){
    this.leafCount++;
    System.out.println("Leaf count: " + this.leafCount);
   }
  }
 }
 
 public void inOrder(Node currentNode){
  if(currentNode != null){
   inOrder(currentNode.left);
   System.out.println(currentNode.index);
   inOrder(currentNode.right);
  }
 }
 
 public void preOrder(Node currentNode){
   if(currentNode!= null){
     System.out.println(currentNode.index);
     preOrder(currentNode.left);
     preOrder(currentNode.right);
   }
 }
 
 public void swap(Tree T1, Tree T2){
   System.out.println(T1.head.index);
 }
 
 public Node get(int index){
  Node currentNode = this.head;
  while(currentNode.index != index){
    if(index < currentNode.index){
      currentNode = currentNode.left;
    }
    else{
      currentNode = currentNode.right;
    }
    if(currentNode == null){
      return null;
    }
    
  }
  return currentNode;
 }
}