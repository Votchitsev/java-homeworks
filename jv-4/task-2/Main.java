class User {
  public void greetUser(String name) {
    if (name != null) {
      System.out.println(name);
    }
  }
}

public class Main {
  public static void main(String[] args) {
    User user = new User();
    user.greetUser("Michel");
  }
}
