package sg.edu.nus.iss.app.ssfworkshop16.models;

import java.io.Serializable;

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
}
