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
public class Country extends BaseDomain {

    @NotEmpty
    private String name;
    @NotEmpty
    private String telCode;

    private Map<String, String> stateKeyMap;

    public Country(String id, int active, String name, String telCode, Map<String, String> stateKeyMap) {
        super(id, active);
        this.name = name;
        this.telCode = telCode;
        this.stateKeyMap = stateKeyMap;
    }

}
