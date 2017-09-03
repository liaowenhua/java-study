package com.lwh.spring.transaction;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lwh.spring.dao.mapper.PgcUserMapper;
import com.lwh.spring.dao.model.PgcUser;

@Service
public class Demo1 {
    @Resource private PgcUserMapper userMapper;
    @Transactional
    public void addUser(int uid) {
        PgcUser user = new PgcUser();
        user.setUid(uid);
        user.setStatus(true);
        userMapper.insert(user);
    }
    
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void updateUser(int uid) {
        PgcUser user = new PgcUser();
        user.setUid(uid);
        user.setStatus(false);
        userMapper.updateByPrimaryKey(user);
        //int i = 1/0;
    }
    
    @Transactional
    public void addAndUpdate (int addUid, int updateUid) {
        addUser(addUid);
        
        updateUser(updateUid);
        
        //int i = 1/0;
    }
}
