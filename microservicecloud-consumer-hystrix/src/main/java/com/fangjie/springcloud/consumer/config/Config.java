package com.fangjie.springcloud.consumer.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author fangjie
 * @Description: ${todo}
 * @date 2020/2/24 13:48
 */
@Configuration
public class Config {

    /**
     * rest请求template
     *
     * @return
     */
    @Bean
    //负载均衡ribbon
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    /**
     * 更改ribbon的负载均衡算法
     * @return
     */
//    @Bean
//    public IRule getIRuleConfig(){
//        return new RetryRule();
//    }
}
