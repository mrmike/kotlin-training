package com.example.kotlin.training.section_05_class;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PersonJava {

    @Nullable
    private final String firstName;
    @NotNull
    private final String lastName;
    private final Integer age;

    public PersonJava(@Nullable String firstName, @NotNull String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Nullable
    public String getFirstName() {
        return firstName;
    }

    @NotNull
    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonJava that = (PersonJava) o;

        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        return age != null ? age.equals(that.age) : that.age == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PersonJava{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
