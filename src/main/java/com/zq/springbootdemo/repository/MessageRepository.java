package com.zq.springbootdemo.repository;

import com.zq.springbootdemo.entity.Message;

import java.util.List;

/**
 * @Author: zq
 * @Date: 2020/3/24 11:24
 * @Description:
 */
public interface MessageRepository {
    List<Message> findAll();
    Message findOne(Long id);
    Message save(Message message);
    void delete(Long id);
    Message update(Message message);
    Message updateText(Message message);
}