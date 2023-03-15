package com.lynne.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description //TODO
 * @Date 2023/3/5 16:53
 * @Author fengyongli
 **/
@Component
public class MyLB implements LoadBalancer {

    private AtomicInteger atomicInteger = new AtomicInteger();

    @Override
    public ServiceInstance instance(List<ServiceInstance> serviceInstances) {
        int index = getInstance() % serviceInstances.size();
        return serviceInstances.get(index);
    }

    private final int getInstance() {

        int current;
        int next;
        do {
            current = this.atomicInteger.get();
            next = current >= 2147483647 ? 0 : current + 1;
        } while (!this.atomicInteger.compareAndSet(current, next));
        System.out.println("*******第几次访问，次数next: " + next);
        return next;

    }
}
