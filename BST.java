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
    System.out.println( a ); // expect 8
    System.out.println( a.find(8) ); // true
    System.out.println( a.find(12) ); // false
  }
  public boolean find(int value) {
    if (this.value == value) return true;
    else if (this.value < value) 
      return (this.left == null) ? false : this.left.find(value); 
    else // this.value > value 
      return (this.right == null) ? false : this.right.find(value); 
  }
  public String toString() {
    String left = (this.left  == null) ? "" : this.left.toString(), 
          right = (this.right == null) ? "" : this.right.toString();
    return left + " " + this.value + " " + right;     
  }
}