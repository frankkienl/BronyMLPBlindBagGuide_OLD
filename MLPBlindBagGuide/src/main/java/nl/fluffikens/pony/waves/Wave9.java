/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.fluffikens.pony.waves;

import nl.fluffikens.pattern.AZPattern;
import nl.fluffikens.pony.Pony;

/**
 *
 * Created by Ossie on 10-02-2014
 */
public class Wave9 extends AbstractWave {

    public Wave9() {
        this.names = new String[]
        {
            "Applejack", "Big MacIntosh", "Fluttershy", "Pinkie Pie",
            "Rainbow Dash", "Rarity", "Amethyst Star", "Shoeshine",
            "Noteworthy", "Sea Swirl", "Berryshine", "Princess Cadance",
            "Peachy Sweet", "Lily Valley", "Nurse Snowheart", "Sprinkle Medley", 
            "Tropical Storm", "Mr Carrot Cake", "Green Jewel", "Lavender Fritter", 
            "Apple Honey", "Honey Rays", "Prism Glider", "Grape Delight"
        };

        this.descriptions = new String[][]
        {
            {"01"}, {"02"}, {"03"}, {"04"}, {"05"},
            {"06"}, {"07"}, {"08"}, {"09"}, {"10"},
            {"11"}, {"12"}, {"13"}, {"14"}, {"15"},
            {"16"}, {"17"}, {"18"}, {"19"}, {"20"},
            {"21"}, {"22"}, {"23"}, {"24"}
        };

        this.wave = 9;
        this.waveName = "" + this.wave;
        this.ponies = new Pony[names.length];
        
        this.patterns.add(new AZPattern());

        this.init();


    }
}