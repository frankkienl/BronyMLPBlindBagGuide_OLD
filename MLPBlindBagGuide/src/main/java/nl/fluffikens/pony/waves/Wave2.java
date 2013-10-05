
package nl.fluffikens.pony.waves;

import nl.fluffikens.pony.Pony;
/**
 *
 * @author Fluffikens
 */
public class Wave2 extends AbstractWave {

    public Wave2() {
        this.names = new String[]
        {
            "Pinkie Pie", "Applejack", "Rainbow Dash", "Rarity",
            "Twilight Sparkle", "Fluttershy", "Feathermay", "Blossomforth",
            "Lulu Luck", "Star Swirl", "Tea Love", "RibbonHeart",
            "Cheerilee", "DaisyDreams", "Stardash", "Honeybelle",
            "Dewdrop Dazzle", "Rainbow Flash", "Pudding Pie", "Snowcatcher",
            "Twinkleshine", "Rarity", "Applejack", "Fluttershy"
        };

        this.descriptions = new String[][]
        {
            {"01"}, {"02"}, {"03"}, {"04"}, {"05"},
            {"06"}, {"07"}, {"08"}, {"09"}, {"10"},
            {"11"}, {"12"}, {"13"}, {"14"}, {"15"},
            {"16"}, {"17"}, {"18"}, {"19"}, {"20"},
            {"21"}, {"22"}, {"23"}, {"24"}
        };

        this.description = "Only released in Europe";
        this.wave = 2;
        this.waveName = "" + this.wave;
        this.ponies = new Pony[names.length];

        this.init();
    }
}
