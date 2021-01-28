package com.company;

import java.util.Random;

public class Hero extends Character {
    private SuperAbility superAbility;

    public Hero(int health,int damage,SuperAbility superAbility) {
        super(health,damage);
        this.superAbility = superAbility;
    }

    public SuperAbility getSuperAbility(){
        return superAbility;
    }

   public final void heroChance(){
        int chanceNumber = new Random().nextInt(3)+1;
        switch (chanceNumber){
            case 1:
                System.out.println(SuperAbility.CRITICAL_DAMAGE); break;
            case 2:
                System.out.println(SuperAbility.MAGIC); break;
            case 3:
                System.out.println(SuperAbility.SAVE_AND_REVERT); break;
            case 4:
                System.out.println(SuperAbility.STUN);
        }
   }
   public void heroChance(int chanceNumber){
       switch (chanceNumber){
           case 1:
               System.out.println(SuperAbility.CRITICAL_DAMAGE); break;
           case 2:
               System.out.println(SuperAbility.MAGIC); break;
           case 3:
               System.out.println(SuperAbility.SAVE_AND_REVERT); break;
           case 4:
               System.out.println(SuperAbility.STUN);
       }

   }

    @Override
    public String getInfo() {
        return super.getInfo()+", superAbility: "+superAbility;
    }
}
