class Person {
  String name;

  void sayHello() {
    System.out.println("Привет, меня зовут " + name);
  }
}

class Student extends Person {
  String university;

  void study() {
    System.out.println(this);
  }

  public Student(String name, String university) {
    this.name = name;
    this.university = university;
  }

  @Override
  public String toString() {
    return name + " учится в " + university;
  }
}

class Main {
  public static void main(String[] args) {
    Student student = new Student("Вася", "БФУ");
    student.sayHello();
    student.study();
  }
}
