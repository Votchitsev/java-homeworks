import java.util.*;

public class Main {
  static public void main(String[] args) {
    HashMap<String, String> friends = new HashMap<>();
    friends.put("Саша", "Хашбраун");
    friends.put("Андрей", "Шашлык");
    friends.put("Димон", "Щи");

    for (String friend : friends.keySet()) {
      System.out.println(friend + " любит " + friends.get(friend) + ".");
    }
  }
}
