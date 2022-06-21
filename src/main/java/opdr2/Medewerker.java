package opdr2;

public class Medewerker {
    private String naam;
    private String nummer;
    private String wachtwoord;

    //-----Constructor-----
    public Medewerker(String naam, String nummer, String wachtwoord){
        this.naam = naam;
        this.nummer = nummer;
        this.wachtwoord = wachtwoord;
    }

    //-----Get methoden-----
    public String getNaam(){return this.naam;}

    public String getNummer(){return this.nummer;}

    public String getWachtwoord(){return this.wachtwoord;}

    //-----Set methoden-----
    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setNummer(String nummer) {
        this.nummer = nummer;
    }

    public void setWachtwoord(String wachtwoord) {
        this.wachtwoord = wachtwoord;
    }

    //-----Overige methoden-----
    public boolean checkInlog(String nummer, String wachtwoord){
        return this.nummer.equals(nummer) && this.wachtwoord.equals(wachtwoord);
    }
}
