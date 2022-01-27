package com.example.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.monitor.MonitorService;

import java.util.List;
@Slf4j
@DubboService
public class SimpleMonitorService implements MonitorService {
    @Override
    public void collect(URL statistics) {
        log.info("请求collect:{}",statistics);

    }

    @Override
    public List<URL> lookup(URL query) {
        log.info("请求lookup:{}",query);
        return null;
    }
}
