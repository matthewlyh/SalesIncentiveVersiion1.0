package com.chinaTele.SalesIncentive.SalesIncentive.query;

/**
 * Created by Administrator on 2017/10/25.
 */
public class StaffQuery extends BaseQuery{
    private int staff_id;
    private String staff_code;
    private int lan_id;
    private String staff_name;
    private int staff_type;
private String Pass_word;

    public int getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
    }

    public String getStaff_code() {
        return staff_code;
    }

    public void setStaff_code(String staff_code) {
        this.staff_code = staff_code;
    }


    public int getLan_id() {
        return lan_id;
    }

    public void setLan_id(int lan_id) {
        this.lan_id = lan_id;
    }

    public String getStaff_name() {
        return staff_name;
    }

    public void setStaff_name(String staff_name) {
        this.staff_name = staff_name;
    }

    public int getStaff_type() {
        return staff_type;
    }

    public void setStaff_type(int staff_type) {
        this.staff_type = staff_type;
    }

    public String getPass_word() {
        return Pass_word;
    }

    public void setPass_word(String pass_word) {
        Pass_word = pass_word;
    }
}
