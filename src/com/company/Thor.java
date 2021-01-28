package com.company;

public final class Thor extends Hero {
    private Weapon weapon;

    public Thor(int health, int damage, SuperAbility superAbility,Weapon weapon) {
        super(health, damage, superAbility);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    @Override
    public void heroChance(int chanceNumber) {
        if (chanceNumber == 4)
        System.out.println("Thor "+SuperAbility.STUN+"ED Boss!");
        else System.out.println("next time you will have a chance");
    }
   public String getInfo(){
        return getClass().getSimpleName()+", "+super.getInfo()+", Weapon name: "+getWeapon().getNameofWeapon()+", type: "+weapon.getTypeofWeapon();
   }
   //////////////////////////// Доп задание /////////////////////////////////////////////////
    public void copyMethod(Thor thor){
        weapon = thor.getWeapon();
    }
}
