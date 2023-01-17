package sg.edu.nus.iss.app.ssfworkshop16.models;

import java.io.Serializable;
import java.util.List;

import jakarta.json.Json;
import jakarta.json.JsonArrayBuilder;
import jakarta.json.JsonObjectBuilder;

public class Pegs implements Serializable {
    private int total_count;
    private List<Type> types;

    public int getTotal_count() {
        return total_count;
    }

    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }

    public List<Type> getTypes() {
        return types;
    }

    public void setTypes(List<Type> types) {
        this.types = types;
    }

    public JsonObjectBuilder toJson() {
        JsonArrayBuilder jab = Json.createArrayBuilder();
        for (Type t : this.types) {
            jab.add(Json.createObjectBuilder()
                    .add("type", t.getType())
                    .add("count", t.getCount()));
        }
        return Json.createObjectBuilder()
                .add("totalCount", this.getTotal_count())
                .add("types", jab);
    }

}
