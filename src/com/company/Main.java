package com.company;

public class Main {

    public static void main(String[] args) {
     Hero hero = new Hero(200,10,SuperAbility.MAGIC);
     Thor thor_level_1 = new Thor(300,20,SuperAbility.NONE,new Weapon("PM","HandGun"));
     Thor thor_level_2 = new Thor(400,30,SuperAbility.STUN,new Weapon("mini14","Sniper"));

        System.out.println(hero.getInfo());
        hero.heroChance();
        hero.heroChance(2);
        System.out.println(thor_level_1.getInfo());
        thor_level_1.heroChance(3);
        System.out.println(thor_level_2.getInfo());
        thor_level_2.heroChance(4);

        /////////////////////////////////////////////////////////////////////////////////////

        System.out.println("________________________Доп Задание____________________________");
        thor_level_2.copyMethod(thor_level_1);
        System.out.println(thor_level_2.getInfo());

    }
}
