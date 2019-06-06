
package beyblade;

public class BeybladeFactory {
    
    public Beyblade beybladeProduce(String beybladeType){
        
        if(beybladeType.equals("Dragon")){
           return new Dragon("Takao",800,300,"Blue Dragon","Talking Monster");
        }
        else if(beybladeType.equals("Dranza")){
            return new Dranza("Kai",600,400,"Red Bird");
        }
        else if(beybladeType.equals("Drayga")){
            return new Drayga("Rei",800,250,"White Tiger");
        }
        else if(beybladeType.equals("Dracie")){
            return new Drayga("Max",400,100,"Black Turtle");
        }
    
        return null;
    }

    
   
    
}
