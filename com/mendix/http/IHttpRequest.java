package com.mendix.http;

public interface IHttpRequest {
    public HttpHeader[] getAllHeaders();
    public java.util.Optional<java.io.InputStream> getContent();
    public String getMethod();
    public String getUri();
    public void setContent(java.io.InputStream newContent, long length);
    public void setHeaders(HttpHeader[] headers);
}
