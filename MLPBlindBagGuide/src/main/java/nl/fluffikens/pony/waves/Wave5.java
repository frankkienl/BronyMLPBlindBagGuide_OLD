package nl.fluffikens.pony.waves;

import nl.fluffikens.pattern.NumberPattern;
import nl.fluffikens.pony.Pony;
/**
 *
 * @author Fluffikens
 */
public class Wave5 extends AbstractWave {

    public Wave5() {

        this.names = new String[]
        {
            "Twilight Sparkle", "Princess Cadence", "Sunny Rays", "Junebug",
            "Breezie", "Island Rainbow", "Princess Luna", "Sapphire Shores",
            "Rainbow Dash", "Flippity Flop", "Gardenia Glow", "Skywishes",
            "Trixie Lulamoon", "Diamond Rose", "Cinnamon Breeze", "Ploomette",
            "Golden Delicious", "Ribbon Wishes", "Princess Celestia",
            "Fluttershy", "Forsythia", "Flitter Heart", "Rainbow Wishes",
            "Lyra Heartstrings"
        };

        this.descriptions = new String[][]
        {
            {"01"}, {"02"}, {"03"}, {"04"}, {"05"},
            {"06"}, {"07"}, {"08"}, {"09"}, {"10"},
            {"11"}, {"12"}, {"13"}, {"14"}, {"15"},
            {"16"}, {"17"}, {"18"}, {"19"}, {"20"},
            {"21"}, {"22"}, {"23"}, {"24"}
        };

        this.wave = 5;
        this.waveName = "" + this.wave;
        this.ponies = new Pony[names.length];
        
        this.patterns.add(new NumberPattern("70202"));

        this.init();
    }
}
