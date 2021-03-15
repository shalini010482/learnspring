package com.ri.bootcamp.learn.domain;

import java.util.Map;

import javax.validation.constraints.NotEmpty;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@NoArgsConstructor
public class State extends BaseDomain {

    @NotEmpty
    private String name;
    @NotEmpty
    private String countryId;

    private String countryName;

    public State(String id, int active, String name, String countryId, String countryName) {
        super(id, active);
        this.name = name;
        this.countryId = countryId;
        this.countryName = countryName;
    }

}
