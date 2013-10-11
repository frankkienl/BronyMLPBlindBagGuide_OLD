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
                        "Rainbow Dash",
                        "Applejack",
                        "Fluttershy",
                        "Flower Wishes",
                        "Skywishes",
                        "Gardenia Glow",
                        "Lemon Hearts",
                        "Big MacIntosh",
                        "Granny Smith",
                        "Comet Tail",
                        "Royal Riff",
                        "Flim Skim",
                };

        this.descriptions = new String[][]
                {
                        {"01"}, {"02"}, {"03"}, {"04"}, {"05"},
                        {"06"}, {"07"}, {"08"}, {"09"}, {"10"},
                        {"11"}, {"12"}
                };

        this.wave = 81;
        this.waveName = "8 UK alternative 1";
        this.ponies = new Pony[names.length];

        this.patterns.add(new AZPattern());

        this.description = "UK Only?";

        this.init();

    }

    /*
    Thanks to Rory for reporting!
    Rainbow Dash - AA - 01
    Applejack - AB - 02
    Fluttershy - AC - 03
    Flower Wishes - AD - 04
    Skywishes - AE - 05
    Gardenia Glow - AF - 06
    Lemon Hears - AG - 07
    Big MacIntosh - AH - 08
    Granny Smith - AI - 09
    Comet Tail - AK - 10
    Royal Riff - AL - 11
    Flim Skim - AM - 12
    */
}
