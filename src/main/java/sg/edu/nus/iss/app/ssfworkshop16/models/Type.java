package sg.edu.nus.iss.app.ssfworkshop16.models;

import java.io.Serializable;

import jakarta.json.Json;
import jakarta.json.JsonObject;

public class Type implements Serializable {
    private String type;
    private int count;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public JsonObject toJson() {
        return Json.createObjectBuilder()
                .add("type", this.getType())
                .add("count", this.getCount())
                .build();
    }
}
