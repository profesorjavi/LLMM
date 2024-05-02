package ej_2;

public class ChuckNorrisJoke {
    private String category;
    private String icon_url;
    private String id;
    private String url;
    private String value;

    // Constructor, getters y setters
    public ChuckNorrisJoke() {}

    public ChuckNorrisJoke(String category, String icon_url, String id, String url, String value) {
        this.category = category;
        this.icon_url = icon_url;
        this.id = id;
        this.url = url;
        this.value = value;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getIcon_url() {
        return icon_url;
    }
    

}

