public class Dog {
  String name;
  int age;

  public Dog(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void bark() {
    System.out.println("ワン！");
  }

  public void nameAge() {
    System.out.println(name + "です。\n" + age + "歳です。");
  }
}

public class Main {
  public static void main(String[] args) {
    Dog dog = new Dog("taro", 2);
    dog.bark();
    dog.nameAge();
  }
}
