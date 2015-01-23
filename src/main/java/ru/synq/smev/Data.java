package ru.synq.smev;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@JsonIgnoreProperties(value = { "handler", "hibernateLazyInitializer" })
public class Data {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    private String input1;
    @Column(nullable = false)
    private String input2;
    @Column(nullable = false)
    private String status;
    @Column(nullable = false)
    private Date lastUpdateTime;
    @Column(unique = true)
    private String providerId;
    @Column(columnDefinition = "TEXT") // add spring.datasource.url=...;sql.syntax_mys=true to support this data type
    private String error;

    public String getInput1() {
        return input1;
    }

    public void setInput1(String input1) {
        this.input1 = input1;
    }

    public String getInput2() {
        return input2;
    }

    public void setInput2(String input2) {
        this.input2 = input2;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public void setStatus(DataStatus status) {
        this.status = status.toString();
        this.lastUpdateTime = new Date();
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }
}
