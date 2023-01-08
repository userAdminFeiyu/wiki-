package com.example.wiki.controller;


import com.example.wiki.req.EbookReq;
import com.example.wiki.resp.CommonResp;
import com.example.wiki.resp.EbookRsp;
import com.example.wiki.service.EbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ebook")
public class EbookController {


    @Autowired
    private EbookService ebookService;



    @GetMapping("list")
    public CommonResp list(EbookReq req){
        CommonResp<List<EbookRsp>> resp = new CommonResp<>();
        List<EbookRsp> list = ebookService.list(req);
        resp.setContent(list);

        return resp;
    }
}
