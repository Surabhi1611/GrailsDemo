/*
package com.ttnd.demo

import javax.servlet.FilterChain
import javax.servlet.ServletException
import javax.servlet.ServletRequest
import javax.servlet.ServletResponse
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class ApplicationInterceptor {

    boolean before() {
        println "Inside before Interceptor"
        true
    }

    boolean after() {
        println "Inside after Interceptor"
         String ae = request.getHeader("accept-encoding")
         if (ae != null && ae.indexOf("gzip") != -1) {
             response.addHeader("Content-Encoding", "gzip");
             GZIPResponseWrapper gzipResponse = new GZIPResponseWrapper(response)
         }
        true
    }

    void afterView() {
        // no-op
    }
*/
/*

    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain chain)
            throws IOException, ServletException {
        println "Inside doFilter"

        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        if (acceptsGZipEncoding(httpRequest)) {
            httpResponse.addHeader("Content-Encoding", "gzip");
            GZIPResponseWrapper gzipResponse =
                    new GZIPResponseWrapper(response);
            chain.doFilter(request, gzipResponse);
            gzipResponse.close()
        } else {
            chain.doFilter(request, response);
        }
    }

    private boolean acceptsGZipEncoding(request) {
        String acceptEncoding =
                httpRequest.getHeader("Accept-Encoding");

        return acceptEncoding != null &&
                acceptEncoding.indexOf("gzip") != -1;
    }
*//*


    public ApplicationInterceptor() {
        match(controller: 'user')
    }
}
*/
