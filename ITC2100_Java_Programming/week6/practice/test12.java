public class test12 {
  public static void main(String[] args) {
    int j = 5;
    int k = 6;
    if(j++ == k)
      System.out.println("Z:" + k);
    else
      System.out.println("FAIL:" + k);
  }
}
