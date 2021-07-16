package com.example.order.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.ToString;

import java.io.Serializable;

@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Context implements Serializable {
    private static final long serialVersionVID = 7519387928670129413L;

    @JsonProperty("process_id")
    private String processId;

    @JsonProperty("request_parameter")
    private DomainModel domainModel;

    @JsonProperty("domain_model")
    private RequestParameter requestParameter;

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public DomainModel getDomainModel() {
        return domainModel;
    }

    public RequestParameter getRequestParameter() {
        return requestParameter;
    }
}
