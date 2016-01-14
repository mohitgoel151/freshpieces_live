package org.boot.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoggingInterceptor implements HandlerInterceptor {
    
    //http://stackoverflow.com/questions/18823241/assign-an-unique-id-to-every-request-in-a-spring-based-web-application

    @Override
    public boolean preHandle(HttpServletRequest request,
            HttpServletResponse response, Object handler) throws Exception {
        System.out.println("---Before Method Execution---");
        
        String method = "";
        if(handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod)handler;
            method = handlerMethod.getMethod().getName();
        }
        
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request,
            HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
        

//        try {
//            System.out.println("sd");
//        } catch (Exception e) {
//            System.out.println(e);
//        }
        System.out.println("---postHandle Method Execution---");
        
        
    }

    @Override
    public void afterCompletion(HttpServletRequest request,
            HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        System.out.println("---afterCompletion Method Execution---");
        
    }

}
