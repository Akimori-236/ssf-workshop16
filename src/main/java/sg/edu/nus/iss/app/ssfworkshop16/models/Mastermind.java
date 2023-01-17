package sg.edu.nus.iss.app.ssfworkshop16.models;

import java.io.Serializable;

public class Mastermind implements Serializable {
    private String name;
    private Pieces pieces;
    private String id;
    private int insertCount;
    private int updateCount;
    private Boolean upsert;

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
}
