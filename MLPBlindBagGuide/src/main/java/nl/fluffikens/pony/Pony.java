package nl.fluffikens.pony;
/**
 *
 * @author Fluffikens
 */
public class Pony {

    private String name;
    private String imageName;
    private String[] description;

    public Pony(String name, String[] description, String imageName) {
        this.name = name;
        this.imageName = imageName;
        this.description = description;
    }

    public void addDescription(String... newDescriptions) {
        String[] tempDescriptions =
                new String[description.length + newDescriptions.length];

        for(int i = 0; i < description.length; i++) {
            tempDescriptions[i] = description[i];
        }

        for(int i = description.length; i < tempDescriptions.length; i++) {
            tempDescriptions[i] = newDescriptions[i - description.length];
        }

        description = tempDescriptions;
    }

    public String getNumberInWave() {
        return "#" + description[0];
    }

    public String getImageName(){
        return imageName;
    }

    public String getName(){
        return name;
    }

    public String[] getDescription(){
        return description;
    }

    @Override
    public String toString() {
        StringBuilder pony = new StringBuilder();

        pony.append("name: ");
        pony.append(name);
        pony.append(", ");
        pony.append("imageName");
        pony.append(imageName);
        pony.append(", ");
        pony.append("position: ");
        pony.append(getNumberInWave());
        pony.append(", ");
        if (description.length >= 2) {
            pony.append("description(s) : ");
            for (int i = 1; i < description.length; i++) {
                pony.append(description[i]);
                pony.append(", ");
            }
        }
        pony.append("\r\n");

        return pony.toString();
    }
}