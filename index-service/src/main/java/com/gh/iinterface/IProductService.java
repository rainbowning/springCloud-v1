package com.gh.iinterface;

import com.gh.entity.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GuoHui
 * @Date 2020/4/9
 */

@FeignClient(name="product-service",fallback = IProductService.ProductServiceFallback.class)
public interface IProductService {

    @RequestMapping("product/list")
    public List<Product> list();

    //内部类来实现降级处理
    @Component
    @Slf4j
    static class ProductServiceFallback implements IProductService{
        @Override
        public List<Product> list() {
            log.info("Product服务当前不可调用，降级处理...");
            return new ArrayList<>();
        }
    }

}
