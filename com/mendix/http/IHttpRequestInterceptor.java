package com.mendix.http;

public interface IHttpRequestInterceptor {
    public void process(IHttpRequest request, IHttpContext context);
}
