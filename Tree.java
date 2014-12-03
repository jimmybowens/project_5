  /*Jimmy Bowens
 * Advanced Data Structures
 * November 25, 2014
 */

package project_5;
public class Tree {
 Node head;
 int leafCount;
 int size;
 
 public Tree(){}
 
 public void add(int index){
  Node newNode = new Node(index);
  if(head==null){
   head = newNode;
   this.size++;
  }else{
   Node currentNode = head;
   Node parentNode;
   while(true){
    parentNode = currentNode;
    if(index < currentNode.index){
     currentNode = currentNode.left;
     if(currentNode == null){
      parentNode.left = newNode;
      this.size++;
      return;
     }
    }
    else{
     currentNode = currentNode.right;
     if(currentNode == null){
      parentNode.right = newNode;
      this.size++;
      return;
     }
    }
   }
  }
 }
  
 public int leafCount (Node head){
   int count = 0;
   if(head == null){
     count = 0;
   }
   else if ((head.left != null) || (head.right != null)){
     leafCount(head.left);
     leafCount(head.right);
   }
   else{
     count = 1;
   }
   return count;
 }
 
 //The inorder listing of T is the nodes of T1 in inorder, followed by the root r, followed by the nodes of T2 in inorder, . . . , and the nodes of Tk in inorder.
 
 public boolean compare(Tree T1, Tree T2){
   boolean isIdentical = true;

   if(T1 != null && T2 == null || T1 == null && T2 != null){
     isIdentical = false;
   }
   else if(T1.size > T2.size || T1.size < T2.size){
     isIdentical = false;
   }/*else{
     Tree one = new Tree();
     Tree two = new Tree();
     
     T1.swap(T1, one);
     T2.swap(T2, two);
     
     compare(one.head, two.head, isIdentical);
   }*/
   
   return isIdentical;
 
 }
 
 private void compare(Node one, Node two, boolean isIdentical){
   if(one.left == two.left && one.right == two.right){
     isIdentical = true;
   }
   compare(one.left, two.left, isIdentical);
   compare(one.right, two.right, isIdentical);
 }
  
 public void inOrder(Node currentNode){
  if(currentNode != null){
   inOrder(currentNode.left);
   System.out.println(currentNode.index);
   inOrder(currentNode.right);
  }
 }
 
 //The preorder listing of T is the root of T, followed by the nodes of T1 in preorder, . . . , and the nodes of Tk in preorder.
 
 public void preOrder(Node currentNode){
   if(currentNode!= null){
     System.out.println(currentNode.index);
     preOrder(currentNode.left);
     preOrder(currentNode.right);
   }
 }
 
 //The postorder listing of T is the nodes of T1 in postorder, . . . , the nodes of Tk in postorder, all followed by the root r.
 
 public void postOrder(Node currentNode){
   if(currentNode!= null){
     if(currentNode.left == null && currentNode.right == null){
       System.out.println("LEAF" + currentNode.index);
     }
     preOrder(currentNode.left);
     preOrder(currentNode.right);
     System.out.println(currentNode.index);
   }
 }
 
 
 public void swap(Tree T1, Tree T2){
  Node currentNode = T1.head;
  swap(currentNode,T2);
 }
 
 private void swap(Node currentNode, Tree T2){
   if(currentNode != null){
   swap(currentNode.left, T2);
   T2.add(currentNode.index);
   swap(currentNode.right, T2);
  }
 }
 
 public Node get(int index){
   Node currentNode = head;
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
   System.out.println(index + " found");
   Node one = currentNode.left;
   Node two = currentNode.right;
   one.right = two;
   return currentNode;
 }
}