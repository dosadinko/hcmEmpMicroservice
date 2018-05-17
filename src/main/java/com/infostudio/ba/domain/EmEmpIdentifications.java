package com.infostudio.ba.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Objects;

/**
 * A EmEmpIdentifications.
 */
@Entity
@Table(name = "eeid")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class EmEmpIdentifications implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @NotNull
    @Column(name = "identification_number", nullable = false)
    private String identificationNumber;

    @Column(name = "jurisdiction")
    private String jurisdiction;

    @Column(name = "valid_through")
    private LocalDate validThrough;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "updated_at")
    private Instant updatedAt;

    @Column(name = "id_identification")
    private Integer idIdentification;

    @Column(name = "id_region")
    private Integer idRegion;

    @OneToOne
    @JoinColumn(unique = true)
    private EmEmployees idEmployee;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public EmEmpIdentifications identificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
        return this;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public EmEmpIdentifications jurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
        return this;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public LocalDate getValidThrough() {
        return validThrough;
    }

    public EmEmpIdentifications validThrough(LocalDate validThrough) {
        this.validThrough = validThrough;
        return this;
    }

    public void setValidThrough(LocalDate validThrough) {
        this.validThrough = validThrough;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public EmEmpIdentifications createdBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public EmEmpIdentifications createdAt(Instant createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public EmEmpIdentifications updatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public EmEmpIdentifications updatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getIdIdentification() {
        return idIdentification;
    }

    public EmEmpIdentifications idIdentification(Integer idIdentification) {
        this.idIdentification = idIdentification;
        return this;
    }

    public void setIdIdentification(Integer idIdentification) {
        this.idIdentification = idIdentification;
    }

    public Integer getIdRegion() {
        return idRegion;
    }

    public EmEmpIdentifications idRegion(Integer idRegion) {
        this.idRegion = idRegion;
        return this;
    }

    public void setIdRegion(Integer idRegion) {
        this.idRegion = idRegion;
    }

    public EmEmployees getIdEmployee() {
        return idEmployee;
    }

    public EmEmpIdentifications idEmployee(EmEmployees emEmployees) {
        this.idEmployee = emEmployees;
        return this;
    }

    public void setIdEmployee(EmEmployees emEmployees) {
        this.idEmployee = emEmployees;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmEmpIdentifications emEmpIdentifications = (EmEmpIdentifications) o;
        if (emEmpIdentifications.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), emEmpIdentifications.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "EmEmpIdentifications{" +
            "id=" + getId() +
            ", identificationNumber='" + getIdentificationNumber() + "'" +
            ", jurisdiction='" + getJurisdiction() + "'" +
            ", validThrough='" + getValidThrough() + "'" +
            ", createdBy='" + getCreatedBy() + "'" +
            ", createdAt='" + getCreatedAt() + "'" +
            ", updatedBy='" + getUpdatedBy() + "'" +
            ", updatedAt='" + getUpdatedAt() + "'" +
            ", idIdentification=" + getIdIdentification() +
            ", idRegion=" + getIdRegion() +
            "}";
    }
}
