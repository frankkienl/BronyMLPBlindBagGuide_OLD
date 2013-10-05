package nl.fluffikens.pony.waves;

import nl.fluffikens.pattern.NumberPattern;
import nl.fluffikens.pony.Pony;
/**
 *
 * @author Fluffikens
 */
public class Wave6 extends AbstractWave {

    public Wave6() {
        this.names = new String[]
        {
            "Pinkie Pie", "Fluttershy", "Twilight Sparkle", "Rainbow Dash", 
            "Rarity", "Applejack", "Minuette", "Roseluck", "Trixie Lulamoon II",
            "Twilight Velvet", "Mosely Orange", "Berry Green", "Merry May", 
            "Cherry Spices II", "Electric Sky", "Crimson Gala", "Amethyst Star",
            "Twilight Sky", "Sassaflash", "Magnet Bolt", "Royal Riff", 
            "Peachy Sweet", "Chance-A-Lot", "Shoeshine"
        };
        this.descriptions = new String[][]
        {
            {"01"}, {"02"}, {"03", "3D gem symbol"}, {"04"}, {"05"},
            {"06"}, {"07"}, {"08"}, {"09", "3D gem symbol"}, {"10", "3D gem symbol"},
            {"11"}, {"12"}, {"13"}, {"14"}, {"15"},
            {"16"}, {"17"}, {"18"}, {"19"}, {"20"},
            {"21"}, {"22"}, {"23"}, {"24"}
        };

        this.wave = 6;
        this.waveName = "" + this.wave;
        this.ponies = new Pony[names.length];

        //@Todo check wether europe pattern differs
        this.patterns.add(new NumberPattern("80206"));
        
        this.init();
    }
    
    @Override
    protected String getImageName(int wave, int pony) {
        return super.getImageName() + ((pony+1 < 10) ? "0" + (pony + 1)
                : pony + 1) + "_" + names[pony].replace(" ", "").replace("-", "") + ".jpg";
    }
}
