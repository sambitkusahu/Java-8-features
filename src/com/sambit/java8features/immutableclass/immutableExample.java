package com.sambit.java8features.immutableclass;
/*to make immutable class,
* your class should be findl
* all variables should be private and final
* only have getters in your class
* if you have a reference to a mutable object in your class make a clone copy of it.
* it should be deep cloning not shallow cloning.
*
* */

public final class immutableExample {
    private final int id;
    private final String name;
    private final AgeMutableClass age;

    public immutableExample(int id, String name, AgeMutableClass age) {
        this.id = id;
        this.name = name;
        AgeMutableClass cloneAge = new AgeMutableClass();
        cloneAge.setDay(age.getDay());
        cloneAge.setMonth(age.getMonth());
        cloneAge.setYear(age.getYear());
        this.age = cloneAge;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public AgeMutableClass getAge() {
        AgeMutableClass cloneAge = new AgeMutableClass();
        cloneAge.setDay(this.age.getDay());
        cloneAge.setMonth(this.age.getMonth());
        cloneAge.setYear(this.age.getYear());
        return cloneAge;
    }
}
