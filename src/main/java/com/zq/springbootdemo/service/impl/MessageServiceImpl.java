package com.zq.springbootdemo.service.impl;

import com.zq.springbootdemo.entity.Message;
import com.zq.springbootdemo.exception.CustomException;
import com.zq.springbootdemo.repository.MessageRepository;
import com.zq.springbootdemo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zq
 * @Date: 2020/3/24 11:23
 * @Description:
 */
@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageRepository messageRepository;
    @Override
    public List<Message> findAll() {
        return messageRepository.findAll();
    }

    @Override
    public Message findOne(Long id) {
        return messageRepository.findOne(id);
    }

    @Override
    public Message save(Message message) throws CustomException {
        return messageRepository.save(message);
    }

    @Override
    public void delete(Long id) {
        messageRepository.delete(id);
    }

    @Override
    public Message update(Message message) throws CustomException {
        return messageRepository.update(message);
    }

    @Override
    public Message updateText(Message message) throws CustomException {
        return messageRepository.updateText(message);
    }
}