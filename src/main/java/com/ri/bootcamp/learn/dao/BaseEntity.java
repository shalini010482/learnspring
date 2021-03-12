package com.ri.bootcamp.learn.dao;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@MappedSuperclass
@Getter
@Setter
@EqualsAndHashCode
@ToString
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id", unique = true)
    protected String id;

    @Column(name = "active", nullable = false, columnDefinition = "INT NOT NULL DEFAULT 1")
    protected int active = 1;

    @Column(name = "created_at", insertable = true, updatable = false)
    @CreatedDate
    protected Date createdAt;

    @Column(name = "updated_at", insertable = true, updatable = true)
    @LastModifiedDate
    protected Date updatedAt;

    @Column(name = "deleted_at")
    protected Date deletedAt;

    @Column(name = "created_by", insertable = true, updatable = false)
    @CreatedBy
    protected String createdBy;

    @Column(name = "updated_by", insertable = true, updatable = true)
    @LastModifiedBy
    protected String updatedBy;

}

