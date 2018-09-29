 package com.megvii.dzh.spider.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.megvii.dzh.spider.domain.po.Comment;
import com.megvii.dzh.spider.domain.vo.NameValue;
import com.megvii.dzh.spider.mapper.CommentMapper;
import com.megvii.dzh.spider.service.ICommentService;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CommentServiceImpl extends BaseServiceImpl<Comment> implements ICommentService {

    @Autowired
    private CommentMapper commentMapper;
    
    @Override
    public List<NameValue> getActiveUser(String year,int limit) {
        try {
            List<NameValue> list = commentMapper.getActiveUser(year,limit);
            log.info("---> size {} data {}", list.size());
            return list;
        } catch (Exception e) {
            log.error("getActiveUser error {}", e);
        }
        return null;
    }

    @Override
    public List<NameValue> getActiveUserBar(int limit) {
        try {
            List<NameValue> list = commentMapper.getActiveUserBar(limit);
            log.info("---> size {} data {}", list.size());
            return list;
        } catch (Exception e) {
            log.error("getActiveUserBar error {}", e);
        }
        return null;
    }


}