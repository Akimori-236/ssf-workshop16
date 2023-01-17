package sg.edu.nus.iss.app.ssfworkshop16.models;

import jakarta.json.Json;
import jakarta.json.JsonObjectBuilder;

public class DecodingBoard {
    private int totalCount;

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public JsonObjectBuilder toJson() {
        return Json.createObjectBuilder()
                .add("totalCount", this.getTotalCount());
    }
}
