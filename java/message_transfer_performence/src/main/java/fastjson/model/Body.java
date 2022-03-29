package fastjson.model;

import java.io.Serializable;

public class Body implements Serializable {
    private static final long serialVersionUID = -9223365651070458732L;
    private String activity_no;
    private String activity_name;
    private String annual_fee;

    public String getActivity_no() {
        return activity_no;
    }

    public void setActivity_no(String activity_no) {
        this.activity_no = activity_no;
    }

    public String getActivity_name() {
        return activity_name;
    }

    public void setActivity_name(String activity_name) {
        this.activity_name = activity_name;
    }

    public String getAnnual_fee() {
        return annual_fee;
    }

    public void setAnnual_fee(String annual_fee) {
        this.annual_fee = annual_fee;
    }
}
