package ej_1;
import java.util.List;

public class Superhero {
    private String name;
    private int age;
    private String secretIdentity;
    private List<String> powers;

    // Constructor
    public Superhero(String name, int age, String secretIdentity, List<String> powers) {
        this.name = name;
        this.age = age;
        this.secretIdentity = secretIdentity;
        this.powers = powers;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSecretIdentity() {
        return secretIdentity;
    }

    public List<String> getPowers() {
        return powers;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSecretIdentity(String secretIdentity) {
        this.secretIdentity = secretIdentity;
    }

    public void setPowers(List<String> powers) {
        this.powers = powers;
    }

}
