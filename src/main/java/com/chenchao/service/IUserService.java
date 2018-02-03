package com.chenchao.service;

import com.chenchao.bean.AccountEntity;
import com.chenchao.bean.TbUserBean;
import com.chenchao.dao.TbUserDao;

import java.util.List;

/**
 * Created by T005 on 2018/1/8.
 */
public interface IUserService {

    int add(TbUserBean userBean);

    int update(TbUserBean userBean);

    int delete(int id);

    TbUserBean findAccountById(int id);

    List<TbUserBean> findAccountList();

}