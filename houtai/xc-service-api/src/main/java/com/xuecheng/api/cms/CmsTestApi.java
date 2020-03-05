package com.xuecheng.api.cms;

import com.xuecheng.framework.domain.cms.CmsPage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "这是一个测试接口")
public interface CmsTestApi {
@ApiOperation(value = "这是test方法")
    public Object test(CmsPage cmsPage);
}
