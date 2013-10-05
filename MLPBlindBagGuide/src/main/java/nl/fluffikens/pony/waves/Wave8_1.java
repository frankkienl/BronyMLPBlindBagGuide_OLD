package nl.fluffikens.pony.waves;

import nl.fluffikens.pattern.AZPattern;
import nl.fluffikens.pony.Pony;

/**
 * Created by FrankkieNL on 5-10-13.
 */
public class Wave8_1 extends AbstractWave {

    public Wave8_1() {
        this.names = new String[]
                {
                        "Applejack",
                        "Big MacIntosh",
                        "Royal Riff",
                        "Skywishes",
                        "Gardenia Glow",
                        "Lemon Hearts",
                        "Flower Wishes",
                        "Granny Smith",
                        "Flim Skim",
                        "Fluttershy",
                        "Rainbow Dash",
                        "Comet Tail",
                };

        this.descriptions = new String[][]
                {
                        {"01"}, {"02"}, {"03"}, {"04"}, {"05"},
                        {"06"}, {"07"}, {"08"}, {"09"}, {"10"},
                        {"11"}, {"12"}
                };

        this.wave = 81;
        this.waveName = "8 UK alternative";
        this.ponies = new Pony[names.length];

        this.patterns.add(new AZPattern());

        this.description = "UK Only? Warning: Information could be incorrect!";

        this.init();

    }
}
