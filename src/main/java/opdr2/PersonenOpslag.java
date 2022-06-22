package opdr2;

import java.util.ArrayList;
import java.util.List;

public abstract class PersonenOpslag {
    private static final List<Medewerker> medewerkers = new ArrayList<>();

    public static void initialize(){
        medewerkers.add(new Medewerker("Tim Tichelaar", "pnltt313", "wachtwoord"));
        medewerkers.add(new Medewerker("Noah Albin", "pnlna626", "qwerty"));
        medewerkers.add(new Medewerker("Daniel Tellez Pedrosa", "pnl04z5a", "zomer123"));
    }

    public static List<Medewerker> getMedewerkers(){return PersonenOpslag.medewerkers;}

    public static boolean checkInlog(String code, String wachtwoord){
        for(Medewerker medewerker: medewerkers){
            if(medewerker.checkInlog(code, wachtwoord)){return true;}
        }
        return false;
    }

    public static Medewerker getMedewerker(String code){
        for(Medewerker medewerker: medewerkers){
            if(medewerker.getNummer().equals(code)){return medewerker;}
        }
        return null;
    }

    public static void addMedewerker(Medewerker medewerker){
        medewerkers.add(medewerker);
    }
}
