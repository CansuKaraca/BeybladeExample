
package beyblade;

import java.util.Scanner;

public class BeybladeMain {
    
    public static void main(String [] args){
        
        System.out.println("Beyblade Machine");
        System.out.println("Exit for q ");
        Scanner scn=new Scanner(System.in);
        
        while(true){
            
          System.out.println("Which beyblade would you like to produce");
          String option=scn.nextLine();
          
          if(option.equals("q")){
              System.out.println("thank you");
              break;
          }
          else{
              // artık static çağrılabilir
              Beyblade beyblade = BeybladeFactory.produceBeyblade(option);
              
              if(beyblade==null){
                 System.out.println("Please enter a valid beyblade name");
              }
              else {
              
                  beyblade.inquireInformation();
                  beyblade.attcak();
                  beyblade.inquireSacredMonster();
              
              }
          }
        
        }
        
    
        
    }
}
