class SafeDivider {
  public int safeDivide(int a, int b) {
    try {
      return a / b;
    } catch(Exception e) {
      return a;
    }
  }
}

public class Main {
  public static void main(String[] args) {
    SafeDivider divider = new SafeDivider();
    int result = divider.safeDivide(2, 2);
    System.out.println(result);
  }
}
