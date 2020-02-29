package com.fangjie.springcloud.hystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author fangjie
 * @Description: ${todo}
 * @date 2020/2/27 17:54
 */
@SpringBootApplication
//启动hystrix监控页面
@EnableHystrixDashboard
public class HystrixDashboardStartMain {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardStartMain.class, args);
    }
}
