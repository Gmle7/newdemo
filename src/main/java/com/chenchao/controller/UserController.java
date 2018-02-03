package com.chenchao.controller;

import com.chenchao.bean.TbUserBean;
import com.chenchao.dao.TbUserDao;
import com.chenchao.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by T005 on 2018/1/8.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    //使用JPA
    @Autowired
    TbUserDao userDao;
    @Autowired
    IUserService userService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<TbUserBean> getAllUsers(){
        return userDao.findAll();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public  TbUserBean getUserById(@PathVariable("id") long id){
        return userDao.getOne(id);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    public String deleteUser(@RequestParam(value = "id",required = true)long id){
        try {
            userDao.delete(id);
        }catch (Exception e){
            return "fail";
        }
        return "success";
    }

    /*@RequestMapping(value = "/update",method = RequestMethod.PUT)
    public  String updateUser(@RequestParam(value = "id",required = true)int id , @RequestParam(value = "name",required = true)String name,
                                 @RequestParam(value = "money" ,required = true)double money){
        TbUserBean userBean=new TbUserBean();
        userBean.setEmail();
        userBean.setPassword();
        userBean.setPhone();
        userBean.setUsername();
        userBean.setId(id);
        userBean=userDao.saveAndFlush(userBean);
        return userBean.toString();
    }*/

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public  String postUser(@RequestBody TbUserBean myUserBean){
        TbUserBean userBean=new TbUserBean();
        userBean.setEmail(myUserBean.getEmail());
        userBean.setPassword(myUserBean.getPassword());
        userBean.setPhone(myUserBean.getPhone());
        userBean.setUsername(myUserBean.getUsername());
        userBean=userDao.saveAndFlush(userBean);
        return userBean.toString();
    }
    
    
}
