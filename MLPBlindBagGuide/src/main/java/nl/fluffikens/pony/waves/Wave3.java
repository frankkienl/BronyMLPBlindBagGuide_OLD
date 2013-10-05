
package nl.fluffikens.pony.waves;

import nl.fluffikens.pattern.NumberPattern;
import nl.fluffikens.pony.Pony;
/**
 *
 * @author Fluffikens
 */
public class Wave3 extends AbstractWave {

    public Wave3() {
        this.names = new String[]
        {
            "Twilight Sparkle", "Rarity", "Bitta Luck", "Rainbowshine",
            "Goldengrape", "Pinkie Pie", "Rainbow Dash", "Golden Harvest",
            "Sprinkle Stripe", "Sea Swirl", "BigMacIntosh", //MacIntosh?
            "Twilight Sparkle", "Pinkie Pie",  "Apple Dazzle", "Lovestruck", 
            "Berryshine", "Meadow Song", "Rarity", "Applejack",  "Fluttershy", 
            "Cherry Berry", "Heartstrings", "Noteworthy", "Lucky Dreams"
        };

        this.descriptions = new String[][]
        {
            {"01"}, {"02"}, {"03"}, {"04"}, {"05"},
            {"06", "glowy"}, {"07"}, {"08"}, {"09"}, {"10"},
            {"11"}, {"12", "glowy"}, {"13"}, {"14"}, {"15"},
            {"16"}, {"17"}, {"18", "glowy"}, {"19"}, {"20"},
            {"21"}, {"22"}, {"23"}, {"24"}
        };

        this.wave = 3;
        this.waveName = "" + this.wave;
        this.ponies = new Pony[names.length];

        this.patterns.add(new NumberPattern("40502", "US"));
        this.patterns.add(new NumberPattern("40255", "MEX"));

        this.init();
    }
}
