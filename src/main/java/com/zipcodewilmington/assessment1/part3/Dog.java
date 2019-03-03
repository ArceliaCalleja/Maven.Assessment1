package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Dog extends Pet {
    private String name;
    private Integer age;
    private PetOwner owner;

    /**
     * @param name name of this Dog
     * @param age age of this dog
     */
    public Dog(String name, Integer age) {

        this.name = name;
        this.age = age;


    }


    /**
     * @param age age of this dog
     */
    public Dog(Integer age) {

        this.age = age;
        this.name = "Dog name";

    }

    /**
     * @param name name of this dog
     */
    public Dog(String name) {

        this.name = name;
        this.age = 0;


    }

    /**
     * nullary constructor
     * by default, a dog's
     * name is DogName
     * age is 0
     */
    public Dog() {

    this.age = 0;
    this.name = "Dog name";
    this.owner = null;
    }


    public PetOwner getOwner() {
        return owner;
    }


    public void setOwner(PetOwner owner) {
        this.owner = owner;
    }

    /**
     * @return bark as a string
     */



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String speak() {
        return "Bark";
    }
}
