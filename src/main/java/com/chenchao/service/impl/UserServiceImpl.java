package com.chenchao.service.impl;

import com.chenchao.bean.TbUserBean;
import com.chenchao.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by T005 on 2018/1/8.
 */
@Service
public class UserServiceImpl implements IUserService {

    @Override
    public int add(TbUserBean userBean) {
        return 0;
    }

    @Override
    public int update(TbUserBean userBean) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public TbUserBean findAccountById(int id) {
        return null;
    }

    @Override
    public List<TbUserBean> findAccountList() {
        return null;
    }
}