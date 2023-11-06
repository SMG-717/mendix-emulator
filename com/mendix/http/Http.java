package com.mendix.http;

import java.net.http.HttpResponse;

public interface Http {
    public HttpResponse<?> executeHttpRequest​(java.net.URI uri, HttpMethod method, HttpHeader[] headers, java.io.InputStream content);
    public void registerHttpRequestInterceptor​(java.lang.String host, IHttpRequestInterceptor httpRequestInterceptor);
}
