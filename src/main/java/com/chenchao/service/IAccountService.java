package com.chenchao.service;

import com.chenchao.bean.AccountEntity;

import java.util.List;

/**
 * Created by T005 on 2018/1/8.
 */
public interface IAccountService {


    int add(AccountEntity account);

    int update(AccountEntity account);

    int delete(int id);

    AccountEntity findAccountById(int id);

    List<AccountEntity> findAccountList();

}