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
public class Beyblade {

    private String beybladesName;
    private Integer rotationSpeed;
    private Integer attackPower;

    public Beyblade(String beybladesName, Integer rotationSpeed, Integer attackPower) {
        this.beybladesName = beybladesName;
        this.rotationSpeed = rotationSpeed;
        this.attackPower = attackPower;
    }

    public String getBeybladesName() {
        return beybladesName;
    }

    public void setBeybladesName(String beybladesName) {
        this.beybladesName = beybladesName;
    }

    public Integer getRotationSpeed() {
        return rotationSpeed;
    }

    public void setRotationSpeed(Integer rotationSpeed) {
        this.rotationSpeed = rotationSpeed;
    }

    public Integer getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(Integer attackPower) {
        this.attackPower = attackPower;
    }

    public void attcak(){
    
        System.out.println(beybladesName + " " + attackPower + " and " + rotationSpeed + " with attack...");
    
    }
    
    public void inquireSacredMonster(){
    
        System.out.println("There is no sacred monster in this beyblade");
        
    }
    
    public void inquireInformation(){
    
        System.out.println("Beyblade name " + beybladesName);
        System.out.println("Beyblade rotation speed " + rotationSpeed);
        System.out.println("Beyblade attcak power " + attackPower);
        
    }
    
}
