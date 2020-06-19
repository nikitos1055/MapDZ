package com.company;

import com.company.Animals.Animals;
import com.company.Club.ZooClub;
import com.company.Human.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ZooClub zooClub = new ZooClub(new HashMap<>());
        while(true){
            menu();
            int action = 0;
            try {
                action = sc.nextInt();
            }catch (Exception e){
                System.out.println("Only numbers");
            }
            switch (action){
                case 1:     //add member
                    zooClub.addMember();
                    break;

                case 2:     // add animal
                    zooClub.addAnimal();
                    break;

                case 3:     // delete animal
                    zooClub.deleteAnimal();
                    break;

                case 4:
                    zooClub.deletePerson();
                    break;

                case 5:    // delete animal from all
                    zooClub.deleteAllAnimalType();
                    break;

                case 6:    // output zooClub
                    zooClub.outputAll();
                    break;

                case 0: // exit
                    System.exit(0);
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + action);
            }
        }
    }



    static void menu(){
        System.out.println("" +
                "============================================\n"
                +"  Введіть 1: Додати учасника клубу.\n"  //+
                +"  Введіть 2: Додати тваринку до учасника клубу.\n" //+
                +"  Введіть 3: Видалити тваринку з учасника клубу.\n" // +
                +"  Введіть 4: Видалити учасника з клубу.\n" //-
                +"  Введіть 5: Видалити конкретну тваринку зі всіх власників.\n" //+
                +"  Введіть 6: Вивести на екран зооклуб.\n" //-
                +"  Введіть 0: щоб вийти."); //+
    }
}
