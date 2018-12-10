package uk.gov.ons.fwmt.census.tm.mock.logging;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.util.ContentCachingRequestWrapper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collection;
import java.util.Collections;

@Component
public class RawRESTInterceptor implements HandlerInterceptor {
  @Autowired private MockLogger mockLogger;

  @Override public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
    ContentCachingRequestWrapper requestCacheWrapperObject = new ContentCachingRequestWrapper(request);
    requestCacheWrapperObject.getParameterMap(); // this is required to force caching to occur
    String body = new String((requestCacheWrapperObject).getContentAsByteArray());

    Collection<String> headers = Collections.list(requestCacheWrapperObject.getHeaderNames());
    StringBuilder builder = new StringBuilder();
    for (String header : headers) {
      Collection<String> value = Collections.list(requestCacheWrapperObject.getHeaders(header));
      builder.append(header);
      builder.append(": ");
      builder.append(value);
    }

    mockLogger.logRawRequest(builder.toString(), body);
    return false;
  }

  @Override public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
      Exception ex) {
    Collection<String> headers = response.getHeaderNames();
    StringBuilder builder = new StringBuilder();
    for (String header : headers) {
      Collection<String> value = response.getHeaders(header);
      builder.append(header);
      builder.append(": ");
      builder.append(value);
    }
    mockLogger.logRawResponse(builder.toString(), null);
  }
}
