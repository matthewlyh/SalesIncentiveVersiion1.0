package com.chinaTele.SalesIncentive.SalesIncentive.model;

/**
 * Created by Administrator on 2017/10/25.
 */
public class ChannelModel {
    private int channel_id;
    private String channel_name;
    private int status_cd;
    private String lan_id;
    private String attr_value_1;
    private String attr_value_2;
    private String attr_value_3;

    public int getChannel_id() {
        return channel_id;
    }

    public void setChannel_id(int channel_id) {
        this.channel_id = channel_id;
    }

    public String getChannel_name() {
        return channel_name;
    }

    public void setChannel_name(String channel_name) {
        this.channel_name = channel_name;
    }

    public int getStatus_cd() {
        return status_cd;
    }

    public void setStatus_cd(int status_cd) {
        this.status_cd = status_cd;
    }

    public String getLan_id() {
        return lan_id;
    }

    public void setLan_id(String lan_id) {
        this.lan_id = lan_id;
    }

    public String getAttr_value_1() {
        return attr_value_1;
    }

    public void setAttr_value_1(String attr_value_1) {
        this.attr_value_1 = attr_value_1;
    }

    public String getAttr_value_2() {
        return attr_value_2;
    }

    public void setAttr_value_2(String attr_value_2) {
        this.attr_value_2 = attr_value_2;
    }

    public String getAttr_value_3() {
        return attr_value_3;
    }

    public void setAttr_value_3(String attr_value_3) {
        this.attr_value_3 = attr_value_3;
    }
}
