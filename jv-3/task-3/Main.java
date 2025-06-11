import java.util.*;

class Rates {
  public void rate(List<Integer> rates) {
    Collections.sort(rates);
    Integer max = rates.get(rates.size() - 1);
    Integer min = rates.get(0);
    Integer sum = 0;

    for (Integer n : rates) {
      sum += n;
    }

    Integer avg = sum / rates.size();

    System.out.println("Максимальное: " + max);
    System.out.println("Минимальное: " + min);
    System.out.println("Среднее: " + avg);
  }
}

public class Main {
  static public void main(String[] args) {
    List<Integer> studetsRates = new ArrayList<>();
    studetsRates.add(6);
    studetsRates.add(10);
    studetsRates.add(4);

    Rates rates = new Rates();
    rates.rate(studetsRates);
  }
}
