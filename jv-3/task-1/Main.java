import java.util.*;

public class Main {
  static public void main (String[] args) {
    List<String> movies = new ArrayList<>();
    movies.add("Большой Лебовски");
    movies.add("Зеленая миля");
    movies.add("Эйс Вентура");
    movies.add("Интерстеллар");
    movies.add("Однажды в Нью-Йорке");

    for (String movie : movies) {
      System.out.println(movie);
    }
  }
}
