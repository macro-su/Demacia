package com.macro.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.*;

/**
 * @author suhong
 * @version V1.0
 * @Title: Demacia
 * @Package com.macro.filter
 * @Description: 请求过滤
 * @date 2020/02/04 11:08
 */
public class AccessFilter extends ZuulFilter {

    /**
     * 过滤器类型，决定过滤器在请求的哪个生命周期中执行，这里定义为“pre"代表请求会在路由之前执行
     */
    @Override
    public String filterType() {
        return PRE_TYPE;
    }
    /**
     * 过滤器顺序，当请求在一个阶段中存在多个过滤器时需要根据该方法返回的值来依次执行
     */
    @Override
    public int filterOrder() {
        return 0;
    }
    /**
     * 判断该过滤器是否需要执行
     */
    @Override
    public boolean shouldFilter() {
        RequestContext ctx = RequestContext.getCurrentContext();
        return !ctx.containsKey(FORWARD_TO_KEY) // a filter has already forwarded
                    && !ctx.containsKey(SERVICE_ID_KEY); // a filter has already determined serviceId
    }

    /**
     * 过滤器的实际逻辑
     */
    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        Object accessToken = request.getParameter("token");

        if(accessToken == null){
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            ctx.getResponse().setContentType("text/html;charset=UTF-8");
            ctx.setResponseBody("无效的请求");
            return null;
        }
        return null;
    }
}
