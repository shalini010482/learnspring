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
public class CorporateAddress extends BaseDomain {

    @NotEmpty
    private String address1;
    private String address2;
    @NotEmpty
    private String country;
    private String countryName;
    @NotEmpty
    private String state;
    private String stateName;
    @NotEmpty
    private String district;
    private String districtName;
    @NotEmpty
    private String taluk;
    private String talukName;
    @NotEmpty
    private String pincode;
    private String pincodeNumber;
    private String landmark;
    @NotEmpty
    private double latitude;
    @NotEmpty
    private double longtitude;
    private String storeDetails;

    public CorporateAddress(String id, int active, @NotEmpty String address1, String address2, @NotEmpty String country,
	    @NotEmpty String state, @NotEmpty String district, @NotEmpty String taluk, @NotEmpty String pincode,
	    String landmark, @NotEmpty double latitude, @NotEmpty double longtitude, String storeDetails) {
	super(id, active);
	this.address1 = address1;
	this.address2 = address2;
	this.country = country;
	this.state = state;
	this.district = district;
	this.taluk = taluk;
	this.pincode = pincode;
	this.landmark = landmark;
	this.latitude = latitude;
	this.longtitude = longtitude;
	this.storeDetails = storeDetails;

    }

}
