package io.github.pragwl.snippets.customannotation;

public class Person {
  private String name;

  @AgeValidator(min = 18, max = 120)
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
  }
}
