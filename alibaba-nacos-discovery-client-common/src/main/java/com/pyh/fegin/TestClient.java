package com.pyh.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient("alibaba-nacos-discovery-server")
public interface TestClient {
    @GetMapping("/hello")
    String hello(@RequestParam(name = "name") String name);
}
