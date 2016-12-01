package dateadog.dateadog;

/**
 * This class stores the data necessary to display a single dog card.
 */
public class DogCard {

    private long dogId;
    private String description;
    private String imagePath;

    public DogCard(Dog dog) {
        this.dogId = dog.getDogId();
        this.description = "Name: " + dog.getName() + "\nAge: " + dog.getAge()
                           + "\nSex: " + dog.getSex() + "\nBreeds: " + dog.getBreedsString()
                           + "\nSize of Dog: " + dog.getSize() + "\nDog Location: " + dog.getCity();
        this.imagePath = dog.getImage();
    }

    public long getDogId() { return dogId; }
    public String getDescription() {
        return description;
    }
    public String getImagePath() {
        return imagePath;
    }

}
