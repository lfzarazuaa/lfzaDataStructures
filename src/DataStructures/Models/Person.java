package DataStructures.Models;

import org.jetbrains.annotations.NotNull;

public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private double height;

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    @Override
    public int compareTo(@NotNull Person c2) {
        Person c1 = this;
        if (c1.getAge()> c2.getAge())
            return 1;
        else if (c1.getAge()==c2.getAge()) {
            if (c1.getHeight()>c2.getHeight()) {
                return 1;
            } else if (c1.getHeight()==c2.getHeight()) {
                return 0;
            }
            return -1;
        }
        return -1;
    }

}
