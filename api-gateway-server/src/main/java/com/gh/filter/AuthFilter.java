package com.gh.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @author GuoHui
 * @Date 2020/4/10
 */

@Component
@Slf4j
public class AuthFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        //ServerWebExchange相当于当前请求和响应的上下文，通过它可以获取到request和response对象
        ServerHttpRequest request = exchange.getRequest();
        String token = request.getQueryParams().getFirst("token");
        if(token==null){
            //认证失败
            exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
           return  exchange.getResponse().setComplete();
        }
        //认证通过
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        //指定过滤器的优先级大小，值越小，优先级越高
        return 0;
    }
}
