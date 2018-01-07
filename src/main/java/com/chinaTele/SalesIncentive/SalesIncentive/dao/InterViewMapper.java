package com.chinaTele.SalesIncentive.SalesIncentive.dao;

import com.chinaTele.SalesIncentive.SalesIncentive.model.InterViewModel;
import com.chinaTele.SalesIncentive.SalesIncentive.query.InterViewQuery;
import java.util.List;
/**
 * Created by Administrator on 2017/10/27.
 */
public interface InterViewMapper {
   InterViewModel findViewById(int id);
   public List<InterViewModel> queryList(InterViewQuery StaffQuery);
   int countList(InterViewQuery query);
}
