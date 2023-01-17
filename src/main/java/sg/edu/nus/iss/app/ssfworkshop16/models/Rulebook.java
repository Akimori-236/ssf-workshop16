package sg.edu.nus.iss.app.ssfworkshop16.models;

import java.io.Serializable;

public class Rulebook implements Serializable {
    private int totalCount;
    private String filename;

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
