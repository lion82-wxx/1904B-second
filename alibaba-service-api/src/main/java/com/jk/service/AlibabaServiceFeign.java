package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("provider-user")
public interface AlibabaServiceFeign {
}
