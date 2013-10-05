package nl.fluffikens.pony.waves;

import nl.fluffikens.pattern.NumberPattern;
import nl.fluffikens.pony.Pony;
/**
 *
 * @author Fluffikens
 */
public class Wave4 extends AbstractWave {

    public Wave4() {

        this.names = new String[]{
            "Applejack", "Fluttershy", "Lulamoon", "Crimson Gala", "Minuette",
            "Royal Riff", "Pinkie Pie", "Merry May", "Electric Sky",
            "Chance-A-Lot", "Berry Green", "Rarity", "Twilight Sparkle",
            "Rarity", "Sassaflash", "Peachy Sweet", "Twilight Sky",
            "Applejack", "Rainbow Dash", "Mosely Orange", "Amethyst Star",
            "Twilight Velvet", "Shoeshine", "PinkiePie"
        };

        this.descriptions = new String[][]{
            {"01", "crystal"}, {"02", "crystal"}, {"03", "crystal"},
            {"04", "crystal"}, {"05", "crystal"}, {"06", "crystal"},
            {"07", "crystal"}, {"08", "crystal"}, {"09", "crystal"},
            {"10", "crystal"}, {"11", "crystal"}, {"12", "metallic"},
            {"13", "crystal"}, {"14", "crystal"}, {"15", "crystal"},
            {"16", "crystal"}, {"17", "crystal"}, {"18", "metallic"},
            {"19", "crystal"}, {"20", "crystal"}, {"21", "crystal"},
            {"22", "crystal"}, {"23", "crystal"}, {"24", "metallic"}
        };

        this.wave = 4;
        this.waveName = "" + this.wave;
        this.ponies = new Pony[names.length];

        this.patterns.add(new NumberPattern("50402", "EUR"));
        this.patterns.add(new NumberPattern("80206", "US"));
        this.patterns.add(new NumberPattern("80602", "CAN"));

        this.init();
    }

    @Override
    protected String getImageName(int wave, int pony) {
        return super.getImageName() + ((pony+1 < 10) ? "0" + (pony + 1)
                : pony + 1) + "_" + names[pony].replace(" ", "").replace("-", "") + ".jpg";
    }
}
