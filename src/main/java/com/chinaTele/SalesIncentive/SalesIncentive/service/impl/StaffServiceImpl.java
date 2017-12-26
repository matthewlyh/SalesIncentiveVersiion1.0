package com.chinaTele.SalesIncentive.SalesIncentive.service.impl;

import com.chinaTele.SalesIncentive.SalesIncentive.dao.StaffMapper;
import com.chinaTele.SalesIncentive.SalesIncentive.model.StaffModel;
import com.chinaTele.SalesIncentive.SalesIncentive.query.PagedData;
import com.chinaTele.SalesIncentive.SalesIncentive.query.StaffQuery;
import com.chinaTele.SalesIncentive.SalesIncentive.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2017/10/25.
 */
@Component
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffMapper staffmapper;

    public StaffModel findStaffByIdAndPass(String staff_code, String pass_word) {
        System.out.println("进入Service :findStaffByIdAndPass");

        //String staff_code,String pass_word
        StaffModel staffModel=staffmapper.findStaffByCode(staff_code);
        if (!staffModel.getPass_word().equals(pass_word))
            staffModel =null;
        return staffModel;
    }

    public StaffModel findStaffById(int id) {
        StaffModel Staff = staffmapper.findStaffById(id);
        System.out.println("name:" + Staff.getStaff_name());
        return Staff;
    }

    public boolean UpdatePassWord(int ID,String OldPWD,String NewPWD)
    {
        boolean T=false;

        if ((staffmapper.findStaffById(ID).getPass_word()).equals(OldPWD)) {

            StaffQuery query = new StaffQuery();
            query.setStaff_id(ID);
            query.setPass_word(NewPWD);
            T = staffmapper.updateStaff(query);
        }

        return T;
    }

    public PagedData<StaffModel> query(StaffQuery query)
    {

        if (query == null) {
            throw new IllegalArgumentException();
        }
        try {
            PagedData<StaffModel> pagedData = new PagedData<StaffModel>();
            pagedData.setPageNo(query.getPageNo());
            pagedData.setPageSize(query.getPageSize());

            List<StaffModel> taskConfigDOs = staffmapper.queryList(query);

            pagedData.setList(taskConfigDOs);

            if (taskConfigDOs != null && !taskConfigDOs.isEmpty() && query.getNeedPagedInfo()) {
                pagedData.setTotalNum(staffmapper.countList(query));
            }
            return pagedData;
        } catch (Exception e) {
//            throw new SeiyaException(location, e);
            return null;
        }
    }
}
