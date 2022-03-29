package fastjson.model;

import java.io.Serializable;

public class Header implements Serializable {
    //private static final long serialVersionUID = -9223365651070458542L;
    private String chnl_time;
    private String open_id;
    private String crypt;
    private String rsp_code;
    private String chnl_date;
    private String rsp_msg;
    private String chnl;
    private String chnl_flow;

    public String getChnl_time() {
        return chnl_time;
    }

    public void setChnl_time(String chnl_time) {
        this.chnl_time = chnl_time;
    }

    public String getOpen_id() {
        return open_id;
    }

    public void setOpen_id(String open_id) {
        this.open_id = open_id;
    }

    public String getCrypt() {
        return crypt;
    }

    public void setCrypt(String crypt) {
        this.crypt = crypt;
    }

    public String getRsp_code() {
        return rsp_code;
    }

    public void setRsp_code(String rsp_code) {
        this.rsp_code = rsp_code;
    }

    public String getChnl_date() {
        return chnl_date;
    }

    public void setChnl_date(String chnl_date) {
        this.chnl_date = chnl_date;
    }

    public String getRsp_msg() {
        return rsp_msg;
    }

    public void setRsp_msg(String rsp_msg) {
        this.rsp_msg = rsp_msg;
    }

    public String getChnl() {
        return chnl;
    }

    public void setChnl(String chnl) {
        this.chnl = chnl;
    }

    public String getChnl_flow() {
        return chnl_flow;
    }

    public void setChnl_flow(String chnl_flow) {
        this.chnl_flow = chnl_flow;
    }


}
