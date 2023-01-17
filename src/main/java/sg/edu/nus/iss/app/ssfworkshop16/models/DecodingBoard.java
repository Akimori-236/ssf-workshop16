package sg.edu.nus.iss.app.ssfworkshop16.models;

import jakarta.json.Json;
import jakarta.json.JsonObject;

public class DecodingBoard {
    private int totalCount;

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public JsonObject toJson() {
        return Json.createObjectBuilder()
                .add("totalCount", this.getTotalCount())
                .build();
    }
}
