
package beyblade;

class BeybladeFactory {

    
    private BeybladeFactory() {

    }

    // paket dışarısından erişim olmadığı için package-friendly bırakılabilir
    /* BeybladeFactory sınıfı herhangi bir durum (state) içermiyor; o yüzden bu yordam static yapılabilir...
    böylece yığın (heap) üzerinde bir BeybladeFactory nesnesi tutmak zorunda kalmayız.
    kısaca - eğer sınıf üzerinde bir durum (state) tutmuyorsa bütün yordamların static yapılması iyi bir pratiktir.
     */
    // yordamları genellikle "eylemNesne" olarak yazmaya çalışıyoruz, ilk sözcüğün eylem olması okunurluğu artırır
    static Beyblade produceBeyblade(String beybladeType) {

        // Java 8'den itibaren String sabitler üzerinden switch'e izin veriyor
        switch (beybladeType) {
            case "Dragon":
                return new Dragon("Takao", 800, 300, "Blue Dragon", "Talking Monster");
            case "Dranza":
                return new Dranza("Kai", 600, 400, "Red Bird");
            case "Drayga":
                return new Drayga("Rei", 800, 250, "White Tiger");
            case "Dracie":
                // sanırım yanlış yazım olmuş :)
                return new Draciel("Max", 400, 100, "Black Turtle");
        }
    
        return null;
    }

    
   
    
}
