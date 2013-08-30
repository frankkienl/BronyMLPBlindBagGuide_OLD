package nl.fluffikens.pony;

import nl.fluffikens.pony.waves.AbstractWave;
import java.util.ArrayList;
import java.util.List;
import nl.fluffikens.pony.waves.*;
/**
 *
 * @author Fluffikens
 */
public class Test {

    private List<AbstractWave> waves;

    public Test() {
        waves = new ArrayList<AbstractWave>();
        waves.add(new Wave1());
        waves.add(new Wave2());
        waves.add(new Wave3());
        waves.add(new Wave4());
        waves.add(new Wave5());
        waves.add(new Wave6());
        waves.add(new Wave7());
        waves.add(new Wave8());

        System.out.println(waves);
    }

    public static void main(String[] args) {
        new Test();
    }
}
