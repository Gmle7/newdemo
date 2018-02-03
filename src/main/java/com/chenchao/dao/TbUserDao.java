package com.chenchao.dao;

import com.chenchao.bean.TbUserBean;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by T005 on 2018/2/3.
 */
public interface TbUserDao extends JpaRepository<TbUserBean,Long>{

}
