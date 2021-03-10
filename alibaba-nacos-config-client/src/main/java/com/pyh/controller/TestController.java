package com.pyh.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RefreshScope //主要用来让这个类下的配置内容支持动态刷新，也就是当我们的应用启动之后，修改了Nacos中的配置内容之后，这里也会马上生效。
public class TestController {


    //@Value("${pyhtitle}")
    @NacosValue(value = "${pyhtitle}", autoRefreshed = true)
    private String title;


    @GetMapping("/test")
    public String hello() {
        return title;
    }
}
