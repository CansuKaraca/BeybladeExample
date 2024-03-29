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
// sınıfın somut (concrete) hali kullanılmadığı için soyut yapıldı.
public abstract class Beyblade {

    private String beybladesName;
    private Integer rotationSpeed;
    private Integer attackPower;

    public Beyblade(String beybladesName, Integer rotationSpeed, Integer attackPower) {
        this.beybladesName = beybladesName;
        this.rotationSpeed = rotationSpeed;
        this.attackPower = attackPower;
    }

    // paket dışarısından erişim olmadığı için package-friendly bırakılabilir
    String getBeybladesName() {
        return beybladesName;
    }

    void attcak() {
    
        System.out.println(beybladesName + " " + attackPower + " and " + rotationSpeed + " with attack...");
    
    }

    public abstract void inquireSacredMonster();
    
    public void inquireInformation(){
    
        System.out.println("Beyblade name " + beybladesName);
        System.out.println("Beyblade rotation speed " + rotationSpeed);
        System.out.println("Beyblade attcak power " + attackPower);
        
    }
    
}
