public class BST {
  int value; 
  BST left, right;
  public BST(int value, BST left, BST right) {
    this.value = value; 
    this.left = left; 
    this.right = right; 
  }
  public static void main(String[] args) {
    BST a = new BST(8, null, null);  
  }
}