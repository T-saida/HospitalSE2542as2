package org.example;

import java.util.Objects;

public abstract class Person {

    protected String fullName;
    protected int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public abstract String getRole();

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(fullName, person.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, age);
    }
}
