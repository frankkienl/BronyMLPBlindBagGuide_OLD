
package nl.fluffikens.pattern;
/**
 *
 * @author Fluffikens
 */
public class NumberPattern extends Pattern {

    private char[] pattern;
    private String appendum;

    public NumberPattern(String pattern) {
        this(pattern, "");
    }

    public NumberPattern(String pattern, String appendum) {
        this.pattern = pattern.toCharArray();
        this.appendum = appendum;
    }

    @Override
    public String get(int nr) {
        nr++;
        StringBuilder patternBuilder = new StringBuilder();
        patternBuilder.append(pattern[0]);
        patternBuilder.append((nr >= 20) ? 2 : ((nr >= 10) ? 1 : 0));
        patternBuilder.append(pattern[2]);
        patternBuilder.append((nr % 10));
        patternBuilder.append(pattern[4]);

        if(appendum.length() > 0) {
            patternBuilder.append(", ");
            patternBuilder.append(appendum);
        }
        return patternBuilder.toString();
    }
}