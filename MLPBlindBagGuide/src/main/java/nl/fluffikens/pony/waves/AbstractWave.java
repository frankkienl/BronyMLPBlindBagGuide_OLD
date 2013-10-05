package nl.fluffikens.pony.waves;

import java.util.ArrayList;
import java.util.List;

import nl.fluffikens.pattern.Pattern;
import nl.fluffikens.pony.Pony;
/**
 *
 * @author Fluffikens
 */
public abstract class AbstractWave {

    protected int wave;
    protected String waveName;
    protected String description;
    protected List<Pattern> patterns = new ArrayList<Pattern>();
    protected Pony[] ponies;
    protected String[] names;
    protected String[][] descriptions;

    protected void init() {
        for (int i = 0; i < ponies.length; i++) {
            ponies[i] = new Pony(names[i], descriptions[i], getImageName(this.wave, i));
            ponies[i].addDescription(getPatternString(i));
        }
    }

    public String[] getPatternString(int pony) {
        String[] patternDescriptions = new String[patterns.size()];

        for(int i = 0; i < patternDescriptions.length; i++) {
            patternDescriptions[i] = patterns.get(i).get(pony);
        }

        return patternDescriptions;
    }

    protected String getImageName(int wave, int pony) {
            return getImageName() +
                    ((pony + 1 < 10) ? "0" + (pony + 1) : pony + 1)
                    + "_" + names[pony].replace(" ", "") + ".jpg";
    }

    protected String getImageName() {
        return "Wave " + wave + "/";
    }

    public String getWaveCover() {
        return "Wave " + wave + "/cover.jpg";
    }

    public String getDescription() {
        return description;
    }

    public int getWave() {
        return wave;
    }

    public String getWaveName(){
        return waveName;
    }

    public Pony[] getPonies() {
        return ponies;
    }

    public Pony getPony(int position) {
        return ponies[position];
    }

    @Override
    public String toString() {
        StringBuilder ponyBuilder = new StringBuilder();
        ponyBuilder.append("=== Building Wave ");
        ponyBuilder.append(wave);
        ponyBuilder.append(" =========\r\n");

        if (this.description != null) {
            ponyBuilder.append("Description: ");
            ponyBuilder.append(description);
            ponyBuilder.append("\r\n");
        }

        ponyBuilder.append("Length: ");
        ponyBuilder.append(ponies.length);
        ponyBuilder.append("\r\n");

        for (int i = 0; i < ponies.length; i++) {
            if (!patterns.isEmpty()) {
                ponyBuilder.append("Code: ");
                for (Pattern pattern : patterns) {
                    ponyBuilder.append(pattern.get(i));
                    ponyBuilder.append(", ");
                }
            }

            Pony pony = ponies[i];
            ponyBuilder.append(pony);
        }

        ponyBuilder.append("==================\r\n");
        return ponyBuilder.toString();
    }
}