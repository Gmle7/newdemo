package com.chenchao.service.impl;

import com.chenchao.bean.AccountEntity;
import com.chenchao.dao.IAccountDao;
import com.chenchao.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by T005 on 2018/1/8.
 */
@Service
public class AccountServiceImpl implements IAccountService {
    @Autowired
    IAccountDao accountDao;
    @Override
    public int add(AccountEntity account) {
        return accountDao.add(account);
    }

    @Override
    public int update(AccountEntity account) {
        return accountDao.update(account);
    }

    @Override
    public int delete(int id) {
        return accountDao.delete(id);
    }

    @Override
    public AccountEntity findAccountById(int id) {
        return accountDao.findAccountById(id);
    }

    @Override
    public List<AccountEntity> findAccountList() {
        return accountDao.findAccountList();
    }
}