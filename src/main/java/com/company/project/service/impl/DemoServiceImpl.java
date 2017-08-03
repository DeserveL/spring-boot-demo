package com.company.project.service.impl;

import com.company.project.dao.DemoMapper;
import com.company.project.model.Demo;
import com.company.project.service.DemoService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/07/21.
 */
@Service
@Transactional
public class DemoServiceImpl extends AbstractService<Demo> implements DemoService {
    @Resource
    private DemoMapper demoMapper;

}
