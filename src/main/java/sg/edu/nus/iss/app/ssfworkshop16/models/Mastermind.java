package sg.edu.nus.iss.app.ssfworkshop16.models;

import java.io.Serializable;
import java.util.Random;

import jakarta.json.Json;
import jakarta.json.JsonObject;

public class Mastermind implements Serializable {
    private String name;
    private Pieces pieces;
    private String id;
    private int insertCount;
    private int updateCount;
    private Boolean upsert;

    public Mastermind(String name, Pieces pieces, String id, int insertCount, int updateCount, Boolean upsert) {
        this.name = name;
        this.pieces = pieces;
        this.id = generateId(4);
        this.insertCount = insertCount;
        this.updateCount = updateCount;
        this.upsert = upsert;
    }

    private synchronized String generateId(int numChars) {
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        while (sb.length() < numChars) {
            sb.append(Integer.toHexString(r.nextInt()));
        }
        return sb.toString().substring(0, numChars);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pieces getPieces() {
        return pieces;
    }

    public void setPieces(Pieces pieces) {
        this.pieces = pieces;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getInsertCount() {
        return insertCount;
    }

    public void setInsertCount(int insertCount) {
        this.insertCount = insertCount;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    public void setUpdateCount(int updateCount) {
        this.updateCount = updateCount;
    }

    public Boolean getUpsert() {
        return upsert;
    }

    public void setUpsert(Boolean upsert) {
        this.upsert = upsert;
    }

    public JsonObject toJson() {
        return Json.createObjectBuilder()
                .add("name", this.getName())
                .add("pieces", this.getPieces().toJson())
                .add("id", this.getId())
                // .add("insertCount", this.getInsertCount())
                // .add("updateCount", this.getUpdateCount())
                // .add("isUpsert", this.getUpsert())
                .build();
    }
}
