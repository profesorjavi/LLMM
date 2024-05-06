package ej_3;

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

    public void setIcon_url(String icon_url) {
        this.icon_url = icon_url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ChuckNorrisJoke{" +
                "category='" + category + '\'' +
                ", icon_url='" + icon_url + '\'' +
                ", id='" + id + '\'' +
                ", url='" + url + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
