package com.infostudio.ba.service.dto;


import com.infostudio.ba.domain.EmEmployees;

import java.time.Instant;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the EmEmpMetaData entity.
 */
public class EmEmpMetaDataDTO implements Serializable {

    private Long id;

    private String title;

    private String value;

    private String displayvalue;

    private Double ordering;

    private String createdBy;

    private Instant createdAt;

    private String updatedBy;

    private Instant updatedAt;

    private Integer idMetaData;

    private EmEmployees idEmployee;

    public Integer getIdMetaData() {
        return idMetaData;
    }

    public void setIdMetaData(Integer idMetaData) {
        this.idMetaData = idMetaData;
    }

    public EmEmployees getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(EmEmployees idEmployee) {
        this.idEmployee = idEmployee;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDisplayvalue() {
        return displayvalue;
    }

    public void setDisplayvalue(String displayvalue) {
        this.displayvalue = displayvalue;
    }

    public Double getOrdering() {
        return ordering;
    }

    public void setOrdering(Double ordering) {
        this.ordering = ordering;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        EmEmpMetaDataDTO emEmpMetaDataDTO = (EmEmpMetaDataDTO) o;
        if(emEmpMetaDataDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), emEmpMetaDataDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "EmEmpMetaDataDTO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", value='" + value + '\'' +
                ", displayvalue='" + displayvalue + '\'' +
                ", ordering=" + ordering +
                ", createdBy='" + createdBy + '\'' +
                ", createdAt=" + createdAt +
                ", updatedBy='" + updatedBy + '\'' +
                ", updatedAt=" + updatedAt +
                ", idMetaData=" + idMetaData +
                ", idEmployee=" + idEmployee +
                '}';
    }
}
