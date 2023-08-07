package movies;

public class Movie {
    //  Variables
    private String name;
    private String category;

    //  Constructors
    public Movie() {
        name = "untitled";
        category = "not set";
    }

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    //  Getters
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }
    //  Setters
    public String getCategory(String category) {
        if(this.category.equals(category)) {
            return this.name;
        }
        else
            return "";
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
