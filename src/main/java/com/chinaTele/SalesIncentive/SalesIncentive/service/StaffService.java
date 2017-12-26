package com.chinaTele.SalesIncentive.SalesIncentive.service;
import com.chinaTele.SalesIncentive.SalesIncentive.model.StaffModel;
import com.chinaTele.SalesIncentive.SalesIncentive.query.PagedData;
import com.chinaTele.SalesIncentive.SalesIncentive.query.StaffQuery;

/**
 * Created by Administrator on 2017/10/25.
 */
public interface StaffService {
    //验证账号密码是否正确String staff_code,String pass_word
    StaffModel findStaffByIdAndPass(String staff_code,String pass_word);
    StaffModel findStaffById(int id);
    public PagedData<StaffModel> query(StaffQuery query);
    boolean UpdatePassWord(int ID,String OldPWD,String NewPWD);
}
