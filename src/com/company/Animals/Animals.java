package com.company.Animals;


import java.util.Objects;

public class Animals {

    private String type;

    private String nameAnimal;

    public Animals(String type, String nameAnimal) {
        this.type = type;
        this.nameAnimal = nameAnimal;
    }

    public Animals(String animalType) {

    }

    @Override
    public String toString() {
        return
                "Type: " + type + '\n' +
                "Animal name: " + nameAnimal + '\n' ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return Objects.equals(type, animals.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNameAnimal() {
        return nameAnimal;
    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }
}

