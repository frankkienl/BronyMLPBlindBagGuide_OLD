/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.fluffikens.pony.waves;

import nl.fluffikens.pattern.AZPattern;
import nl.fluffikens.pony.Pony;

/**
 *
 * @author Fluffikens
 */
public class Wave8 extends AbstractWave {

    public Wave8() {
        this.names = new String[]
        {
            "Applejack", "Big MacIntosh", "Royal Riff", "Mosely Orange",
            "Gilda the Griffon", "Flam", "Flim Skim", "Fluttershy", "Skywishes", 
            "Granny Smith", "Princess Cadence", "Golden Harvest",
            "Flower Wishes", "Pinkie Pie", "Sassaflash", "Comet Tail", 
            "Rainbow Dash", "Sunny Rays", "Gardenia Glow", "Lemon Hearts", 
            "Rarity", "Ribbon Wishes", "Lotus Blossom", "Twilight Sparkle"
        };

        this.descriptions = new String[][]
        {
            {"01"}, {"02"}, {"03"}, {"04"}, {"05"},
            {"06"}, {"07"}, {"08"}, {"09"}, {"10"},
            {"11"}, {"12"}, {"13"}, {"14"}, {"15"},
            {"16"}, {"17"}, {"18"}, {"19"}, {"20"},
            {"21"}, {"22"}, {"23"}, {"24"}
        };

        this.wave = 8;
        this.waveName = "" + this.wave;
        this.ponies = new Pony[names.length];
        
        this.patterns.add(new AZPattern());

        this.init();


    }
}