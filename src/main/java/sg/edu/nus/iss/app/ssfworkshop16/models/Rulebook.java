package sg.edu.nus.iss.app.ssfworkshop16.models;

import java.io.Serializable;

import jakarta.json.Json;
import jakarta.json.JsonObject;

public class Rulebook implements Serializable {
    private int total_count;
    private String file;

    public int getTotal_count() {
        return total_count;
    }

    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public JsonObject toJson() {
        return Json.createObjectBuilder()
                .add("totalCount", this.getTotal_count())
                .add("file", this.getFile())
                .build();
    }
}
