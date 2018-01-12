package com.chenchao.controller;

import com.chenchao.bean.Account;
import com.chenchao.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by T005 on 2018/1/8.
 */
@RestController
@RequestMapping("/account")
public class AccountController {
    /*@Autowired
    IaccountDao accountDao;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Account> getAccounts(){
        return accountDao.findAccountList();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public  Account getAccountById(@PathVariable("id") int id){
        return accountDao.findAccountById(id);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public String deleteAccount(@PathVariable(value = "id")int id){
        int t = accountDao.delete(id);
        if(t==1){
            return "success";
        }else {
            return "fail";
        }
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public  String updateAccount(@PathVariable("id")int id , @RequestParam(value = "name",required = true)String name,
                                 @RequestParam(value = "money" ,required = true)double money){
        Account account=new Account();
        account.setMoney(money);
        account.setName(name);
        account.setId(id);
        int t=accountDao.update(account);
        if(t==1){
            return account.toString();
        }else {
            return "fail";
        }
    }

    @RequestMapping(value = "",method = RequestMethod.POST)
    public  String postAccount(@RequestParam(value = "name")String name, @RequestParam(value = "money" )double money){
        Account account=new Account();
        account.setMoney(money);
        account.setName(name);
        int t= accountDao.add(account);
        if(t==1){
            return account.toString();
        }else {
            return "fail";
        }

    }*/
    //使用JPA
    @Autowired
    AccountDao accountDao;
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Account> getAccounts(){
        return accountDao.findAll();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public  Account getAccountById(@PathVariable("id") int id){
        return accountDao.findOne(id);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public String deleteAccount(@PathVariable(value = "id")int id){
        try {
            accountDao.delete(id);
        }catch (Exception e){
            return "fail";
        }
        return "success";
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public  String updateAccount(@PathVariable("id")int id , @RequestParam(value = "name",required = true)String name,
                                 @RequestParam(value = "money" ,required = true)double money){
        Account account=new Account();
        account.setMoney(money);
        account.setName(name);
        account.setId(id);
        account=accountDao.saveAndFlush(account);
        return account.toString();
    }

    @RequestMapping(value = "",method = RequestMethod.POST)
    public  String postAccount(@RequestParam(value = "name")String name, @RequestParam(value = "money" )double money){
        Account account=new Account();
        account.setMoney(money);
        account.setName(name);
        account=accountDao.save(account);
        return account.toString();
    }
    
    
}
