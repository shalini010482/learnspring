package com.ri.bootcamp.learn.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import javax.validation.constraints.*;
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@NoArgsConstructor

public abstract class BaseDomain implements Serializable {
    /**
     * 
     */
//    private static final long serialVersionUID = 1L;
    @NotEmpty
    protected String id;
    @NotEmpty
    protected int active;
}
