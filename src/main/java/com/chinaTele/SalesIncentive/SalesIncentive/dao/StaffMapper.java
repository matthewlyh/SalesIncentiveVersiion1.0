package com.chinaTele.SalesIncentive.SalesIncentive.dao;
import com.chinaTele.SalesIncentive.SalesIncentive.model.StaffModel;

import org.apache.ibatis.annotations.Param;
import com.chinaTele.SalesIncentive.SalesIncentive.query.StaffQuery;
import java.util.List;

/**
 * Created by Administrator on 2017/10/25.
 */
public interface StaffMapper {
    StaffModel findStaffByCode(String code);
    StaffModel findStaffById(int id);
    public List<StaffModel> queryList(StaffQuery StaffQuery);
    int countList(StaffQuery query);
    Boolean updateStaff(StaffQuery query);

}
