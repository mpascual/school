class BoolEx {
  public static void main(String args[]) {
    boolean flag;// this is how to declare a boolean variable
    flag = true;// this is how to assign a boolean

    System.out.println("flag is " + flag);
    flag = false;
    System.out.println("flag is " + flag);

    if(flag) System.out.println("flag is true.");
    flag = false;
    if(!flag) System.out.println("flag is false.");
    flag=!flag;
    System.out.println("flag is false.");// run it and tell me !!!
  }
} 
