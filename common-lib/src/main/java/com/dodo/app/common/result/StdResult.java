package com.dodo.app.common.result;

public class StdResult<T> {

    private T response;
    private String version = "1.0";

    public StdResult() {
    }

    public StdResult(T response) {
        this.response = response;
    }

    public T getResponse() {
        return response;
    }

    public void setResponse(T response) {
        this.response = response;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override public String toString() {
        return "StdResult{" + "response=" + response + ", version='" + version + '\'' + '}';
    }
}
