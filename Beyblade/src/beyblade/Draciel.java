
package beyblade;


public class Draciel extends Beyblade {
    
    private String sacredMonster;

    Draciel(String beybladesName, Integer rotationSpeed, Integer attackPower, String sacredMonster) {
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
