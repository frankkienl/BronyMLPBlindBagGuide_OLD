package nl.fluffikens.pony.waves;

import nl.fluffikens.pattern.AZPattern;
import nl.fluffikens.pony.Pony;

/**
 * Created by FrankkieNL on 5-10-13.
 */
public class Wave8_2 extends AbstractWave {

    public Wave8_2() {
        this.names = new String[]
                {
                        "Sunny Rays",
                        "Princess Cadence",
                        "Mosely Orange",
                        "Pinkie Pie",
                        "Flam",
                        "Sassaflash",
                        "Ribbon Wishes",
                        "Rarity",
                        "Golden Harvest",
                        "Lotus Blossom",
                        "Gilda the Griffon",
                        "Twilight Sparkle",
                };

        this.descriptions = new String[][]
                {
                        {"01"}, {"02"}, {"03"}, {"04"}, {"05"},
                        {"06"}, {"07"}, {"08"}, {"09"}, {"10"},
                        {"11"}, {"12"}
                };

        this.wave = 82;
        this.waveName = "8 UK alternative 2";
        this.ponies = new Pony[names.length];

        this.patterns.add(new AZPattern());

        this.description = "UK Only? Warning: Information could be incorrect!";

        this.init();

    }
}
