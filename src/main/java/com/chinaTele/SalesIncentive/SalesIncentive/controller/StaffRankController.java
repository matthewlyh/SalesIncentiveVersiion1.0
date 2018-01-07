package com.chinaTele.SalesIncentive.SalesIncentive.controller;

import com.chinaTele.SalesIncentive.SalesIncentive.View.StaffRankModel;
import com.chinaTele.SalesIncentive.SalesIncentive.query.PagedData;
import com.chinaTele.SalesIncentive.SalesIncentive.query.StaffRankQuery;
import com.chinaTele.SalesIncentive.SalesIncentive.service.StaffRankService;
import com.chinaTele.SalesIncentive.SalesIncentive.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/10/26.
 */
@Controller
public class StaffRankController {
    @Autowired
    private StaffRankService staffRankService;

    @Autowired
    private StaffService staffService;

    @RequestMapping("/FindStaffRank")
    @ResponseBody
    @CrossOrigin
    public PagedData<StaffRankModel> FindStaffRank(HttpServletRequest request) {
        System.out.println("StaffRankController:FindStaffRank");
        String Sid= request.getParameter("id").toString();
        if (Sid != null) {
            System.out.println("Sid："+Sid);
            StaffRankQuery staffRankQuery=new StaffRankQuery();
            staffRankQuery.setChannel_id(staffService.findStaffById(Integer.valueOf(Sid)).getChannel_id());
            staffRankQuery.setChannel_id(staffService.findStaffById(Integer.valueOf(Sid)).getChannel_id());
            PagedData<StaffRankModel> PageS=staffRankService.query(staffRankQuery);
            if (PageS.getTotalNum()!=0) {
                StaffRankModel staffRankModel=new StaffRankModel();
                for (int i = 0; i < PageS.getTotalNum(); i++) {
                    for (int j=i+1;j<PageS.getTotalNum();j++)
                        if (PageS.getList().get(i).getGold()<PageS.getList().get(j).getGold()) {
                            staffRankModel = PageS.getList().get(i);
                            PageS.getList().set(i,PageS.getList().get(j));
                            PageS.getList().set(j,staffRankModel);
                        }
                }
            }
            return PageS;

        }
        else
            return null;
    }


}
