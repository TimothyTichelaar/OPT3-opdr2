package opdr2;

public class VerhuurInformatie {
    private Medewerker medewerker;
    private Klant klant;
    private boolean verzekering;

    public VerhuurInformatie(Medewerker medewerker, Klant klant, boolean verzekering){
        this.medewerker = medewerker;
        this.klant = klant;
        this.verzekering = verzekering;
    }

    public Medewerker getMedewerker(){return this.medewerker;}

    public Klant getKlant(){return this.klant;}

    public boolean getVerzekering(){return this.verzekering;}
}
