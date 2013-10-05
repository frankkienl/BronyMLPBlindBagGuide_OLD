
package nl.fluffikens.pony.waves;

import nl.fluffikens.pattern.NumberPattern;
import nl.fluffikens.pony.Pony;
/**
 *
 * @author Fluffikens
 */
public class Wave1 extends AbstractWave {

    public Wave1() {
        this.names = new String[]
        {
            "Pinkie Pie", "Applejack", "Rainbow Dash", "Rarity",
            "Twilight Sparkle", "Fluttershy", "Sugar Grape", "Lily Blossom",
            "Lily Blossom Alt", "Minty", "Bumble Sweet", "Fizzy pop",
            "Flower Wishes", "Rose luck", "Sweetie Blue", "Pepper Dance",
            "Lemon Hearts", "Cherry Spices", "Sweetie Swirl", "Lucky Swirl",
            "Sweetcream Scoops", "Firecracker Burst", "Pinkie Pie",
            "Twilight Sparkle", "Twilight Sparkle Alt", "Rainbow Dash"
        };

        this.descriptions = new String[][]
        {
            {"01"}, {"02"}, {"03"}, {"04"}, {"05"},
            {"06"}, {"07"}, {"08"}, {"08", "darker variation"},
            {"09"}, {"10"}, {"11"}, {"12"}, {"13"}, {"14"}, {"15"},
            {"16"}, {"17"}, {"18"}, {"19"}, {"20"}, {"21"},
            {"22", "glittery/transparent"},
            {"23", "glittery/transparent", "pink variation", "Euro Exclusive"},
            {"23", "glittery/transparent", "purple variation"},
            {"24", "glittery/transparent"}
        };

        this.wave = 1;
        this.waveName = "" + this.wave;
        this.ponies = new Pony[names.length];

        //@TODO remove hardcoded pattern codes
        this.patterns.add(new NumberPattern("20405"));

        this.init();
    }

    @Override
    protected String getImageName(int wave, int pony) {
        int offset = pony >= 8 ? pony >= 24 ? 2 : 1 : 0;

        return getImageName() + ((pony < (9 + offset)) ? "0" + (pony - offset + 1)
                : pony - offset + 1) + "_" + names[pony].replace(" ", "") + ".jpg";
    }

    @Override
    public String[] getPatternString(int pony) {
        String[] patternDescriptions = new String[patterns.size()];

        for (int i = 0; i < patternDescriptions.length; i++) {

            int offset = pony >= 8 ? pony >= 24 ? 2 : 1 : 0;

            patternDescriptions[i] = patterns.get(i).get(pony - offset);
        }

        return patternDescriptions;
    }
}
