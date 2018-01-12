package com.chenchao.dao;

import com.chenchao.bean.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by T005 on 2018/1/8.
 */
public interface AccountDao extends JpaRepository<Account,Integer> {
    
}
