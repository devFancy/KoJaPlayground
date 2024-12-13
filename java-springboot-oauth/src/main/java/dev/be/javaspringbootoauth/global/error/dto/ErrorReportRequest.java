package dev.be.javaspringbootoauth.global.error.dto;

import javax.servlet.http.HttpServletRequest;

public class ErrorReportRequest {

    private static final String ERROR_REPORT_FORMAT = "[RequestUri: %s] Method: %s";

    private final HttpServletRequest request;

    private final Exception exception;

    public ErrorReportRequest(final HttpServletRequest request, final Exception exception) {
        this.request = request;
        this.exception = exception;
    }

    public String getLogMessage() {
        String requestUri = request.getRequestURI();
        String requestMethod = request.getMethod();

        return String.format(ERROR_REPORT_FORMAT, requestUri, requestMethod);
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public Exception getException() {
        return exception;
    }
}
