
package nl.fluffikens.pattern;
/**
 *
 * @author Fluffikens
 */
public class AZPattern extends Pattern {

    private char[] alphabet;

    public AZPattern() {
        alphabet = "ABCDEFGHIKLMNOPRSTUVWXYZ".toCharArray();
    }

    @Override
    public String get(int nr) {
        return "A" + alphabet[nr];
    }
}
