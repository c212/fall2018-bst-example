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
    a.insert(3); 
    a.insert(5);
    System.out.println( a.show() ); // ((. 3 (. 5 .)) 8 .) 
    System.out.println( a ); // 3  5  8  
    // let's try again, same three values, different order 
    a = new BST(3, null, null);  
    a.insert(5); 
    a.insert(8);
    System.out.println( a.show() ); // (. 3 (. 5 (. 8 .))) 
    System.out.println( a ); // 3  5  8
    // one more time, same three values, different order 
    a = new BST(8, null, null);  
    a.insert(5); 
    a.insert(3);
    System.out.println( a.show() ); // (((. 3 .) 5 .) 8 .) 
    System.out.println( a ); // 3  5  8
  }
  public void insert(int value) {
    if (this.value == value) return;
    else if (this.value > value) 
      if (this.left == null) 
        this.left  = new BST(value, null, null); 
      else this.left.insert(value); 
    else // this.value < value (fixed this comment now also) 
      if (this.right == null) 
        this.right  = new BST(value, null, null); 
      else this.right.insert(value); 
  }
  public boolean find(int value) {
    if (this.value == value) return true;
    else if (this.value > value) // this was wrong, fixed now
      return (this.left == null) ? false : this.left.find(value); 
    else // this.value > value 
      return (this.right == null) ? false : this.right.find(value); 
  }
  public String toString() {
    String left = (this.left  == null) ? "" : this.left.toString(), 
          right = (this.right == null) ? "" : this.right.toString();
    return left + " " + this.value + " " + right;     
  }
  public String show() {
    return "(" + ((this.left  == null) ? "." : this.left.show())  + 
           " " +  this.value + " " + 
                 ((this.right == null) ? "." : this.right.show()) + ")"; 
  }
}