package dateadog.dateadog;

/**
 * This is the object created that stores the data for the tindercard
 * Created by nirav on 05/10/15.
 */
public class Data {

    private String description;

    private String imagePath;

    public Data(String imagePath, String description) {
        this.imagePath = imagePath;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getImagePath() {
        return imagePath;
    }

}
