package com.geshanzsq.system.log.login.service.impl;

import com.geshanzsq.common.framework.web.service.impl.BaseServiceImpl;
import com.geshanzsq.system.log.login.mapper.LogLoginMapper;
import com.geshanzsq.system.log.login.po.LogLogin;
import com.geshanzsq.system.log.login.service.LogLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 登录日志
 *
 * @author geshanzsq
 * @date 2022/7/3
 */
@Service
public class LogLoginServiceImpl extends BaseServiceImpl<LogLoginMapper, LogLogin> implements LogLoginService {

    @Autowired
    private LogLoginMapper logLoginMapper;

}
