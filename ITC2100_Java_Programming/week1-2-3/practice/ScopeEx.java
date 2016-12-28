class ScopeEx {
  public static void main(String args[]) {
    int a; // known to all code within main
    boolean ok=true;
    a = 5;

    if(ok) { // start new scope
      int b = ++a;// b is local in this block
      System.out.println(" a is "+a+" b is "+b);
     }

   // b = b*100; //here you get an error . "b" is outside its block
   // however, "a" is still known because it has global scope.
   System.out.println("a is "+a);
  }
}
