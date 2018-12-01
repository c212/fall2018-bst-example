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
    System.out.println( a.find(7) ); // false
    a.left = new BST(7, null, null); 
    System.out.println( a ); // 7  8
    System.out.println( a.find(7) ); // true    
    a.insert(12); 
    System.out.println( a ); // 7  8  12
    a.insert(5); 
    System.out.println( a ); // 5  7  8  12 
    a.insert(6); 
    System.out.println( a ); // 5  6  7  8  12
    a.insert(10); 
    System.out.println( a ); // 5  6  7  8  10  12
    a.insert(11); 
    System.out.println( a ); // 5  6  7  8  10  11  12
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
}