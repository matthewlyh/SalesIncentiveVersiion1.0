package com.chinaTele.SalesIncentive.SalesIncentive.controller;

import com.chinaTele.SalesIncentive.SalesIncentive.View.CustOrderViewModel;
import com.chinaTele.SalesIncentive.SalesIncentive.model.BooleanT;
import com.chinaTele.SalesIncentive.SalesIncentive.model.CustOrderModel;
import com.chinaTele.SalesIncentive.SalesIncentive.model.ProdOfferModel;
import com.chinaTele.SalesIncentive.SalesIncentive.query.CustOrderQuery;
import com.chinaTele.SalesIncentive.SalesIncentive.query.CustOrderViewQuery;
import com.chinaTele.SalesIncentive.SalesIncentive.query.PagedData;
import com.chinaTele.SalesIncentive.SalesIncentive.service.CustOrderService;
import com.chinaTele.SalesIncentive.SalesIncentive.service.CustOrderViewService;
import com.chinaTele.SalesIncentive.SalesIncentive.service.OfferProdRelService;
import com.chinaTele.SalesIncentive.SalesIncentive.service.ProdOfferService;
import com.chinaTele.SalesIncentive.SalesIncentive.service.ProductService;
import com.chinaTele.SalesIncentive.SalesIncentive.service.StaffService;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/10/26.
 */
@Controller
public class CustCoderController {
    @Autowired
    private CustOrderService custOrderService;

    @Autowired
    private ProdOfferService prodOfferService;

    @Autowired
    private CustOrderViewService custOrderViewService;
    
    @Autowired
    private ProductService productService;
    
    @Autowired
    private StaffService staffService;
    @Autowired
    private OfferProdRelService offerProdRelService;
    //根据id获取到当前销售品信息
    @RequestMapping("/FindCustId")
    @ResponseBody
    @CrossOrigin
    public CustOrderQuery FindCustId(HttpServletRequest request, ModelMap model) {

        System.out.println("启动程序CustCoderController：FindCust");
        String CustOrderId = request.getParameter("id");
        //System.out.println("id"+CustOrderId);
        CustOrderModel custOrderModel=custOrderService.FindCustOrderByID(Integer.valueOf(CustOrderId));
        int id=custOrderModel.getProd_offer_id();
        //System.out.println("custOrderModel:"+id);

        ProdOfferModel prodOfferModel=prodOfferService.FindProdOfferById(id);
        //System.out.println("prodOfferModel"+prodOfferModel.getProd_offer_name());

        //request.getSession().setAttribute("id",);
        boolean T=custOrderService.FindCustOrderId(Integer.valueOf(CustOrderId));

        CustOrderQuery custOrderQuery=new CustOrderQuery();
        custOrderQuery.setCust_order_id(custOrderModel.getCust_order_id());
        custOrderQuery.setStaff_name(staffService.findStaffById(custOrderModel.getStaff_id()).getStaff_name());
        custOrderQuery.setProduct_name(productService.selectByPrimaryKey(offerProdRelService.selectByPrimaryKey(custOrderModel.getProd_offer_id()).getProductId()).getProductName());
        custOrderQuery.setCust_order_date(custOrderModel.getCust_order_date());
        custOrderQuery.setProd_offer_id(custOrderModel.getProd_offer_id());
        custOrderQuery.setProd_offer_name(prodOfferModel.getProd_offer_name());
        custOrderQuery.setOffer_type(prodOfferModel.getOffer_type());
        custOrderQuery.setGold(prodOfferModel.getGold());
        custOrderQuery.setBool(T);
        return custOrderQuery;
    }

//    @RequestMapping("/FindCustId")
//    @ResponseBody
//    @CrossOrigin
//    public BooleanT FindCustId(HttpServletRequest request) {
//        System.out.println("启动程序CustCoderController：FindCustId");
//        String CustOrderId = request.getParameter("id");
//        //System.out.println("id"+CustOrderId);
//
//        BooleanT bT=new BooleanT();
//        bT.setBool(T);
//        return bT;
//    }
    //根据产品ID、时间、销售品类型订单信息表。
    @RequestMapping("/FindCustViewId")
    @ResponseBody
    @CrossOrigin
    public PagedData<CustOrderViewModel> FindCustViewId(HttpServletRequest request) {
        System.out.println("启动程序CustCoderController：FindCustViewId");
        String CustOrderId = request.getParameter("CustId");
        String Date = request.getParameter("Date");
        String StatusCd = request.getParameter("StatusCd");
        //System.out.println("id"+CustOrderId);
        PagedData<CustOrderViewModel> custOrderViewModelPagedData=new PagedData<CustOrderViewModel>();

        CustOrderViewQuery query = new CustOrderViewQuery();

        if (!StringUtils.isBlank(CustOrderId))
            query.setCust_order_id(Integer.valueOf(CustOrderId));
        if (!StringUtils.isBlank(Date))
            query.setCust_order_date(Date);
        if (!StringUtils.isBlank(StatusCd))
            query.setStatus_cd(Integer.valueOf(StatusCd));

        custOrderViewModelPagedData=custOrderViewService.query(query);
        return custOrderViewModelPagedData;
    }





}
