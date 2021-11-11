package com.company;

public class Main {

    public static void main(String[] args) {
        Booss booss = new Booss();
        booss.setHp(500);
        booss.setDm(200);
        booss.weapon.setName("witch");
        System.out.println("Booss-"+booss.getHp()+" "+booss.getDm() +" "+booss.weapon.getName());


    }

}
