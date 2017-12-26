package com.chinaTele.SalesIncentive.SalesIncentive.controller;
import com.chinaTele.SalesIncentive.SalesIncentive.dao.InterViewMapper;
import com.chinaTele.SalesIncentive.SalesIncentive.model.*;
import com.chinaTele.SalesIncentive.SalesIncentive.query.*;
import com.chinaTele.SalesIncentive.SalesIncentive.service.ChannelService;
import com.chinaTele.SalesIncentive.SalesIncentive.service.InterViewService;
import com.chinaTele.SalesIncentive.SalesIncentive.service.LanService;
import com.chinaTele.SalesIncentive.SalesIncentive.service.StaffService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.rmi.transport.Channel;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2017/10/25.
 */
@Controller
public class StaffController {
    @Autowired
    private StaffService staffservice;

    @Autowired
    private ChannelService channelService;

    @Autowired
    private LanService lanService;

    @Autowired
    private InterViewService interViewService;

    //测试使用
    @RequestMapping("/LoginTest")
    @ResponseBody
    @CrossOrigin
    public StaffModel LoginTest(HttpServletRequest request, ModelMap model) {

        String staff_code = request.getParameter("staff_code");
        //System.out.println("后端获取到"+staff_code);
        String pass_word = request.getParameter("pass_word");
        String Pwd=MD5Utils.md5Password(pass_word);
        System.out.println(staff_code+" "+pass_word+"  "+Pwd);
        StaffModel Staff=staffservice.findStaffById(Integer.valueOf(staff_code));
        return Staff;
    }

    //登录后记录session会话，获取用户ID及信息
    @RequestMapping("/LoginIn")
    @ResponseBody
    @CrossOrigin
    public StaffList LoginIn(HttpServletRequest request) {
        StaffList list=new StaffList();

        System.out.println("StaffController：LoginIn");
        String Sid= request.getParameter("id").toString();
        //System.out.println("ID:"+Sid);
        if (Sid != null) {
            int id = Integer.valueOf(Sid);
            StaffModel sm=staffservice.findStaffById(id);
            ChannelModel cm=channelService.FindChannelById(sm.getChannel_id());
            LanModel lm=lanService.FindLanByID(sm.getLan_id());
            list.setStaff_code(sm.getStaff_code());
            list.setStaff_name(sm.getStaff_name());
            list.setSex(sm.getSex());
            list.setLan_name(lm.getLan_name());
            list.setPhone_nbr(sm.getPhone_nbr());
            list.setChannel_name(cm.getChannel_name());
            return list;
        }
        else
            return null;
    }

    //登录使用，验证账号密码是否正确
    @RequestMapping("/Login")
    @ResponseBody
    @CrossOrigin
    public StaffModel Login(HttpServletRequest request) {
        System.out.println("StaffController：Login");
        String staff_code = request.getParameter("staff_code");
        //System.out.println("后端获取到"+staff_code);
        String pass_word=MD5Utils.md5Password(request.getParameter("pass_word").toString());
        System.out.println(staff_code+" "+pass_word);
        StaffModel Staff=staffservice.findStaffByIdAndPass(staff_code,pass_word);
//        if (Staff !=null) {
//            request.getSession().setAttribute("id", Staff.getStaff_id());
//            System.out.println("加入SessionID");
//        }
        return Staff;
    }
    //修改密码，{"bool":null,"boolI":2}反馈类型，BoolI，1代表用户修改成功，2代表修改失败，3代表旧密码不正确，4代表用户不存在
    @RequestMapping("/UpdatePWD")
    @ResponseBody
    @CrossOrigin
    public BooleanT UpdatePWD(HttpServletRequest request) {
        System.out.println("StaffController：UpdatePWD");
        String OldPassWord = MD5Utils.md5Password(request.getParameter("oldpwd").toString());
        String NewPassWord = MD5Utils.md5Password(request.getParameter("newpwd").toString());

        BooleanT T=new BooleanT();
        StaffModel Staff=new StaffModel();
        Object id= request.getParameter("id");
        if (id == null)
            T.setBoolI(4);
        else {
            Staff = staffservice.findStaffByIdAndPass(staffservice.findStaffById(Integer.valueOf(id.toString())).getStaff_code(), OldPassWord);
            if (Staff == null)
                T.setBoolI(3);
            else if (staffservice.UpdatePassWord(Integer.valueOf(id.toString()), OldPassWord, NewPassWord))
                T.setBoolI(1);
            else
                T.setBoolI(2);
            System.out.println(id + "修改密码：" + OldPassWord + " " + NewPassWord);
        }
        return T;
    }

    //通过Staff_name
    @RequestMapping("/StaffList")
    @ResponseBody
    @CrossOrigin
    public ModelMap queryList(HttpServletRequest request) {
        StaffQuery query = new StaffQuery();
        System.out.println("StaffController：queryList");
        String staff_code = request.getParameter("staff_code");
       String Staff_name = request.getParameter("Staff_name");
        String lan_id = request.getParameter("lan_id");
        String staff_type = request.getParameter("staff_type");
        if (!StringUtils.isBlank(staff_type))
            query.setStaff_type(Integer.valueOf(staff_type));
        if (!StringUtils.isBlank(lan_id))
            query.setLan_id(Integer.valueOf(lan_id));
        query.setStaff_code(staff_code);
        query.setStaff_name(Staff_name);

  //      query.setLan_id(Integer.valueOf(lan_id));
        PagedData<StaffModel> staffModelPagedData = staffservice.query(query);
        ModelMap model=new ModelMap();
        model.put("Model",staffModelPagedData);
        return model;
    }


    //通过Staff_name
    @RequestMapping("/StaffGold")
    @ResponseBody
    @CrossOrigin
    public InterViewQuery StaffGold(HttpServletRequest request) {
        InterViewQuery query = new InterViewQuery();
        System.out.println("StaffController：StaffGold");
        String id = request.getParameter("id");
        StaffModel person= staffservice.findStaffById(Integer.valueOf(id));
        ChannelModel cm=channelService.FindChannelById(person.getChannel_id());
        InterViewModel im=interViewService.findInterViewById(Integer.valueOf(id));
        query.setStaff_id(person.getStaff_id());
        query.setStaff_name(person.getStaff_name());
        query.setChannel_name(cm.getChannel_name());
        query.setGold(im.getGold());
         return query;

    }


    @RequestMapping("/Error")
    public void Error() {
        System.out.println("Error");
    }

}
