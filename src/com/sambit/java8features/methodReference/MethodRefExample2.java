package com.sambit.java8features.methodReference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodRefExample2 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John","Doe",53),
                new Person("Tiger","Wood",55),
                new Person("Tina","McKey",33)
        );
       /* System.out.println("Printing all persons.."+ people);
        for (Person p: people){
            System.out.println(p.getAge());
            System.out.println(p.getFirstName());
            System.out.println(p.getLastName());
        }*/
        //Predicate<Person>predicate;
        performCOnditionally(people, person->true, p-> System.out.println(p));
    }
    private static void performCOnditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person>consumer){
        for(Person p: people){
            if(predicate.test(p)){
                consumer.accept(p);
            }
        }
    }
}
