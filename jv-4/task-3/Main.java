class User {
  @Override
  public String toString() {
    return "This is my user";
  }
}

public class Main {
  static public void main(String[] args) {
    User user = new User();
    System.out.println(user);
  }
}
