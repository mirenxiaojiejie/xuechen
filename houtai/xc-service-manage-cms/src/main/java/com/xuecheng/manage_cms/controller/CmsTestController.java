package com.xuecheng.manage_cms.controller;

import com.xuecheng.api.cms.CmsTestApi;
import com.xuecheng.framework.domain.cms.CmsPage;
import com.xuecheng.manage_cms.dao.CmsPageRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
@ResponseBody
public class CmsTestController implements CmsTestApi {

    @Autowired
    CmsPageRepository cmsPageRepository;

    @GetMapping("/test")
    public Object test(CmsPage cmsPage) {

        return cmsPageRepository.findAll();


    }

}
