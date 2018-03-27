package io.aamzerin.microservices.start.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("skeleton-service")
public interface SkeletonClient {

}
