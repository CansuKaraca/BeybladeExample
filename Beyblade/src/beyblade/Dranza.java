/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beyblade;

/**
 *
 * @author cansu.karaca
 */
public class Dranza  extends Beyblade {
    
    private String sacredMonster;

    public Dranza(String beybladesName, Integer rotationSpeed, Integer attackPower, String sacredMonster) {
        super(beybladesName, rotationSpeed, attackPower);
        this.sacredMonster=sacredMonster;
    }

    @Override
    public void inquireInformation() {
        super.inquireInformation(); 
        System.out.println("Sacred Monster Name " + sacredMonster);
        
    }

    @Override
    public void inquireSacredMonster() {
       
        System.out.println(getBeybladesName() + sacredMonster + " revealing");
        
    }
    
}
