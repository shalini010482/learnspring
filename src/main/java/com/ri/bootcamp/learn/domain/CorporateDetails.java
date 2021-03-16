package com.ri.bootcamp.learn.domain;

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
public class CorporateDetails extends BaseDomain {

    @NotEmpty
    private String corporateName;
    private String description;
    @NotEmpty
    private String mobile;
    @NotEmpty
    private String email;
    private String landline;
    @NotEmpty
    private String defaultStore;
    @NotEmpty
    private CorporateAddress corporateAddress;

    public CorporateDetails(String id, int active, @NotEmpty String corporateName, String description,
	    @NotEmpty String mobile, @NotEmpty String email, String landline, @NotEmpty String defaultStore,
	    @NotEmpty CorporateAddress corporateAddress) {
	super(id, active);
	this.corporateName = corporateName;
	this.description = description;
	this.mobile = mobile;
	this.email = email;
	this.landline = landline;
	this.defaultStore = defaultStore;
	this.corporateAddress = corporateAddress;
    }

}