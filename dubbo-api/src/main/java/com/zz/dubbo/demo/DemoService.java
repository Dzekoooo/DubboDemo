package com.zz.dubbo.demo;

import java.util.List;


/**
*@Author: ZhangZhe
*@Description 公共服务接口
*@Date: 14:39 2017/12/15
*/
public interface DemoService {
    List<String> getPermissions(Long id);
}
