package com.company;

public class Weapon {
    private String nameofWeapon;
    private String typeofWeapon;
    Weapon(String nameofWeapon, String typeofWeapon){
        this.nameofWeapon = nameofWeapon;
        this.typeofWeapon = typeofWeapon;
    }

    public String getNameofWeapon() {
        return nameofWeapon;
    }

    public String getTypeofWeapon() {
        return typeofWeapon;
    }
}
