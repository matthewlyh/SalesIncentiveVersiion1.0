package com.chinaTele.SalesIncentive.SalesIncentive.query;

/**
 * Created by Administrator on 2017/10/27.
 */
public class InterViewQuery extends BaseQuery{
    private int staff_id;
    private String staff_name;
    private String channel_name;
    private float gold;

    public int getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
    }

    public String getStaff_name() {
        return staff_name;
    }

    public void setStaff_name(String staff_name) {
        this.staff_name = staff_name;
    }

    public String getChannel_name() {
        return channel_name;
    }

    public void setChannel_name(String channel_name) {
        this.channel_name = channel_name;
    }

    public float getGold() {
        return gold;
    }

    public void setGold(float gold) {
        this.gold = gold;
    }

}
