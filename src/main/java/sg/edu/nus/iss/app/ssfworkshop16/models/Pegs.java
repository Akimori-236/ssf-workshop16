package sg.edu.nus.iss.app.ssfworkshop16.models;

import java.io.Serializable;
import java.util.List;

public class Pegs implements Serializable {
    private List<Type> pegs;

    public List<Type> getPegs() {
        return pegs;
    }

    public void setPegs(List<Type> pegs) {
        this.pegs = pegs;
    }
}
