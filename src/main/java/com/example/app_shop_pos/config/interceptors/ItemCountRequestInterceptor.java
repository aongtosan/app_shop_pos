package com.example.app_shop_pos.config.interceptors;

import com.example.app_shop_pos.controllers.ItemController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class ItemCountRequestInterceptor implements HandlerInterceptor {
    private final Logger logger = LogManager.getLogger(ItemCountRequestInterceptor.class);
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("Logging : ItemCountRequestInterceptor Enter preHandle");
        logger.info("Logging : Enter preHandle");
        logger.info("Logging : Enter preHandle From IP-ADDR : "+request.getRemoteAddr());
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("Logging : ItemCountRequestInterceptor Enter postHandle");
        logger.info("Logging : Enter postHandle");
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }
}
