package pl.coderslab.domain;

public class Smurf {

    String name;
    String attribute;
    String description;

    public Smurf(String name, String attribute, String description) {
        this.name = name;
        this.attribute = attribute;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getAttribute() {
        return attribute;
    }

    public String getDescription() {
        return description;
    }
}
