package com.zz.dubbo.demo.impl;


import com.zz.dubbo.demo.DemoService;
import java.util.ArrayList;
import java.util.List;

/**
*@Author: ZhangZhe
*@Description 服务实现类
*@Date: 14:38 2017/12/15
*/

public class DemoServiceImpl implements DemoService {
    @Override
    public List<String> getPermissions(Long id) {
        List<String> demo = new ArrayList<String>();
        demo.add(String.format("Permission_%d", id - 1));
        demo.add(String.format("Permission_%d", id));
        demo.add(String.format("Permission_%d", id + 1));
        return demo;
    }
}
