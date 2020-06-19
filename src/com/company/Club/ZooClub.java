package com.company.Club;

import com.company.Animals.Animals;
import com.company.Human.Person;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class ZooClub {

    private  Map <Person, List<Animals>> listMap;


    public ZooClub(Map<Person, List<Animals>> listMap) {
        this.listMap = listMap;
    }

    public void addMember() {
        Scanner scForString = new Scanner(System.in);
        Scanner scForInt = new Scanner(System.in);
        String animalType = "";
        System.out.println("Enter name: ");
        String name = scForString.nextLine();
        System.out.println("Enter age: ");
        int age = scForInt.nextInt();
        listMap.put(new Person(name , age), new ArrayList<>());
        System.out.println("You created Member !");
    }

    public void addAnimal() {
        Scanner scForInt = new Scanner(System.in);
        for(Map.Entry<Person,List<Animals>> animal : listMap.entrySet() ) {
            System.out.println(animal.getKey().getName());
        }
        System.out.println("Enter value person u want to add: ");
        String name = scForInt.nextLine();
        for(Map.Entry<Person,List<Animals>> animal : listMap.entrySet() ) {
            if(name.equalsIgnoreCase(animal.getKey().getName())){
                System.out.println("Enter animal name: ");
                String animalName = scForInt.nextLine();
                System.out.println("Enter animal type: ");
                String animalType = scForInt.nextLine();
                animal.getValue().add(new Animals(animalType, animalName));
                System.out.println("U added pet.");
            }else {
                System.out.println("No member with this name");
            }
        }

    }

    public void deleteAnimal() {
        Scanner scForInt = new Scanner(System.in);
        Scanner scForString = new Scanner(System.in);
        for(Map.Entry<Person,List<Animals>> animal : listMap.entrySet() ) {
            System.out.print("Name: ");
            System.out.println(animal.getKey().getName());
            System.out.print("Age: ");
            System.out.println(animal.getKey().getAge());
            System.out.println("=========================================\n");
        }
        System.out.println("Enter name person u want to add: ");
        String name = scForString.nextLine();
        System.out.println("Enter age person u want to add: ");
        int age = scForInt.nextInt();
        Person person = new Person(name, age);
        if(listMap.containsKey(person)) {
            for (Map.Entry<Person, List<Animals>> animal : listMap.entrySet()) {
                System.out.println("Pets: ");
                System.out.println(animal.getValue());
            }
            System.out.println("Enter name animal u want to delete: ");
            String animalName = scForString.nextLine();
            System.out.println("Enter type animal u want to delete: ");
            String animalType = scForString.nextLine();

            Animals animals = new Animals(animalType, animalName);
            listMap.get(person).remove(listMap.get(person).indexOf(animals));
        }else{
            System.out.println("Human not found");
        }
    }

    public  void deleteAllAnimalType(){
        Scanner sc = new Scanner(System.in);
        for(Map.Entry<Person,List<Animals>> animal : listMap.entrySet() ) {
            System.out.print("Animals types: ");
            System.out.println(animal.getValue());
            System.out.println("=========================================\n");
        }
        System.out.println("Enter animal type: ");
        String vid = sc.next();
        Set<Person> keySet = listMap.keySet();
        for (Person key : keySet) {
            ListIterator<Animals> iter = listMap.get(key).listIterator();
            while (iter.hasNext()) {
                Animals pet = (Animals) iter.next();
                if (pet.getType().equals(vid)) {
                    iter.remove();
                }
            }
        }
    }
    


    public void deletePerson() {
        Scanner scString = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        for(Map.Entry<Person,List<Animals>> animal : listMap.entrySet() ) {
            System.out.print("Name: ");
            System.out.println(animal.getKey().getName());
            System.out.print("Age: ");
            System.out.println(animal.getKey().getAge());
            System.out.println("=========================================\n");
        }
        System.out.println("Enter name:");
        String name = scString.next();
        System.out.println("Enter age:");
        int age = scInt.nextInt();

            Person person = new Person(name,age);
            if (listMap.containsKey(person)) {
                listMap.remove(person);
            } else {
                System.out.println("Member not found !");
            }

    }

    public void outputAll() {
        for(Map.Entry<Person,List<Animals>> animal : listMap.entrySet() ) {
            System.out.print("Name: ");
            System.out.println(animal.getKey().getName());
            System.out.print("Age: ");
            System.out.println(animal.getKey().getAge());
            System.out.println("Pets: ");
            System.out.println(animal.getValue());
        }
    }




    //getters & setters
    public Map<Person, List<Animals>> getListMap() {
        return listMap;
    }

    public void setListMap(Map<Person, List<Animals>> listMap) {
        this.listMap = listMap;
    }
}
