package com.lynne.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Description //TODO
 * @Date 2023/3/5 16:46
 * @Author fengyongli
 **/
public interface LoadBalancer {

    ServiceInstance instance(List<ServiceInstance> serviceInstances);
}
