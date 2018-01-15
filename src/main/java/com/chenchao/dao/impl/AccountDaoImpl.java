package com.chenchao.dao.impl;

import com.chenchao.bean.AccountEntity;
import com.chenchao.dao.IAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by T005 on 2018/1/8.
 */
@Repository


public class AccountDaoImpl implements IAccountDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int add(AccountEntity account) {
        return jdbcTemplate.update("insert into account(name, money) values(?, ?)",
                account.getName(),account.getMoney());

    }

    @Override
    public int update(AccountEntity account) {
        return jdbcTemplate.update("UPDATE  account SET NAME=? ,money=? WHERE id=?",
                account.getName(),account.getMoney(),account.getId());
    }

    @Override
    public int delete(int id) {
        return jdbcTemplate.update("DELETE from account where id=?",id);
    }

    @Override
    public AccountEntity findAccountById(int id) {
        List<AccountEntity> list = jdbcTemplate.query("select * from account where id = ?", new Object[]{id}, new BeanPropertyRowMapper(AccountEntity.class));
        if(list!=null && list.size()>0){
            AccountEntity account = list.get(0);
            return account;
        }else{
            return null;
        }
    }

    @Override
    public List<AccountEntity> findAccountList() {
        List<AccountEntity> list = jdbcTemplate.query("select * from account", new Object[]{}, new BeanPropertyRowMapper(AccountEntity.class));
        if(list!=null && list.size()>0){
            return list;
        }else{
            return null;
        }
    }
}
