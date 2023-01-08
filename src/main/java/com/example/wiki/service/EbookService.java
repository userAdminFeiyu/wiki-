package com.example.wiki.service;

import com.example.wiki.domain.Demo;
import com.example.wiki.domain.Ebook;
import com.example.wiki.domain.EbookExample;
import com.example.wiki.mapper.DemoMapper;
import com.example.wiki.mapper.EbookMapper;
import com.example.wiki.req.EbookReq;
import com.example.wiki.resp.EbookRsp;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EbookService {

    @Autowired
    private EbookMapper ebookMapper;


    public List<EbookRsp> list(EbookReq req){
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%" + req.getName() + "%");

        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);
        List<EbookRsp> respList = new ArrayList<>();
        for (Ebook ebook : ebookList) {
            EbookRsp ebookRsp = new EbookRsp();
            //实现对象的复制
            BeanUtils.copyProperties(ebook,ebookRsp);
            respList.add(ebookRsp);
        }
        return respList;
    }
}
