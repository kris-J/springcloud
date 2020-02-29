package com.fangjie.springcloud.consumer.ribbonRule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;

/**
 * @author fangjie
 * @Description: 自定义ribbon负载均衡策略
 * @date 2020/2/26 17:37
 */
public class ConsumerRibbonRule extends AbstractLoadBalancerRule {

    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }


    @Override
    public Server choose(Object key) {
        ILoadBalancer loadBalancer = this.getLoadBalancer();
        List<Server> reachableServers = loadBalancer.getReachableServers();
        return reachableServers.get(0);
    }


}
