package com.numerx.formboot.testform.service.impl;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.numerx.formboot.testform.entity.Test;
import com.numerx.formboot.testform.mapper.TestMapper;
import com.numerx.formboot.testform.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author matrixorz
 * @since 2019-08-13
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements ITestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public Page<Map<Object, Object>> selectTestPage(Page<Map<Object, Object>> mapPage){

        List<Map<Object, Object>> list = testMapper.selectMap(mapPage);
        mapPage.setRecords(list);
        return mapPage;
    }
}
