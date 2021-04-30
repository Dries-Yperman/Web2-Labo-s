package domain.model;

public class Student {

    String naam;
    String voornaam;
    int leeftijd;
    String studierichting;

    public Student(String naam, String voornaam, int leeftijd, String studierichting){
        this.naam = naam;
        this.voornaam = voornaam;
        this.leeftijd = leeftijd;
        this.studierichting = studierichting;
    }

    public String getNaam() {
        return naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public String getStudierichting() {
        return studierichting;
    }

    public boolean isSamePerson(String naam, String voornaam){
        return this.getNaam().toLowerCase().equals(naam.toLowerCase()) && this.getVoornaam().toLowerCase().equals(voornaam.toLowerCase());
    }
}
