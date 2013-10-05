
package nl.fluffikens.pony.waves;

import nl.fluffikens.pattern.NumberPattern;
import nl.fluffikens.pony.Pony;
/**
 *
 * @author Fluffikens
 */
public class Wave7 extends AbstractWave {
    
    public Wave7() {
        this.names = new String[]
        {
            "Pinkie Pie", "Fluttershy", "Twilight Sparkle", "Rainbow Dash",
            "Rarity", "Applejack", "Cherry Pie", "Apple Fritter", 
            "Banana Fluff", "Lilac Links", "Cherry Fizz", "Misty Fly", 
            "Banana Bliss", "Sweetie Drops", "Holly Dash", "Berry Dreams", 
            "Spitfire", "Lucky Clover", "Lily Blossom", "Apple Stars", 
            "Barber Groomsby", "Caramel Apple", "Soarin", "Lily Valley"
            
        };

        this.descriptions = new String[][]
        {
            {"01"}, {"02"}, {"03"}, {"04"}, {"05"},
            {"06"}, {"07"}, {"08"}, {"09"}, {"10"},
            {"11"}, {"12"}, {"13"}, {"14"}, {"15"},
            {"16"}, {"17", "(Misnamed as Soarin on card)"}, {"18"}, 
            {"19"}, {"20"}, {"21"}, {"22"}, 
            {"23", "(Misnamed as Spitfire on card)"}, {"24"}
        };

        this.wave = 7;
        this.waveName = "" + this.wave;
        this.ponies = new Pony[names.length];
        
        this.patterns.add(new NumberPattern("90206"));

        this.init();
    }
    
}
