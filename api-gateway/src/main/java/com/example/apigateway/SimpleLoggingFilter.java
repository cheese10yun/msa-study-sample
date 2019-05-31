package com.example.apigateway;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import java.text.MessageFormat;
import javax.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SimpleLoggingFilter extends ZuulFilter {

  @Override
  public String filterType() {
    return "pre";
  }

  @Override
  public int filterOrder() {
    return 1;
  }


  @Override
  public boolean shouldFilter() {
    return true;
  }

  @Override
  public Object run() {
    final RequestContext context = RequestContext.getCurrentContext();
    final HttpServletRequest request = context.getRequest();

    log.info(MessageFormat
        .format("Request Method : {0} \n URL : {1} ", request.getMethod(),
            request.getRequestURI()));
    return null;
  }
}
