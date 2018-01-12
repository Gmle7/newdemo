package com.chenchao.dao;

import com.chenchao.bean.Account;

import java.util.List;

/**
 * Created by T005 on 2018/1/8.
 */
public interface IAccountDao{
    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
