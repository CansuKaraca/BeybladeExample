
package beyblade;


public class Dragon extends Beyblade{
    
    private String sacredMonster;
    // secretAbility kullanılmamış
    private String secretAbility;

    // paket dışarısından erişim olmadığı için package-friendly bırakılabilir
    Dragon(String beybladesName, Integer rotationSpeed, Integer attackPower, String sacredMonster, String secretAbility) {
        super(beybladesName, rotationSpeed, attackPower);
        this.sacredMonster=sacredMonster;
        this.secretAbility=secretAbility;
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
