package com.ri.bootcamp.learn.dao;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.ri.bootcamp.learn.domain.CorporateAddress;
import com.ri.bootcamp.learn.utility.StringConstantsUtil;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
CREATE TABLE `store_details_address` (
  `dup_id` varchar(45) DEFAULT NULL,
  `testing` varchar(45) DEFAULT NULL,
  `id` varchar(45) NOT NULL,
  `address1` varchar(250) DEFAULT NULL,
  `address2` varchar(258) DEFAULT NULL,
  `country` varchar(45) DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  `district` varchar(45) DEFAULT NULL,
  `taluk` varchar(45) DEFAULT NULL,
  `pincode` varchar(45) DEFAULT NULL,
  `landmark` varchar(250) DEFAULT NULL,
  `latitude` double DEFAULT NULL,
  `longtitude` double DEFAULT NULL,
  `store_details` varchar(45) DEFAULT NULL,
  `active` tinyint(4) DEFAULT '1',
  `created_at` date DEFAULT NULL,
  `updated_at` date DEFAULT NULL,
  `deleted_at` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

*/

@Entity
@Table(name = "store_details_address")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString
public class CorporateAddressEntity extends BaseEntity {

    @Size(max = 250)
    @Column(name = "address1")
    private String address1;

    @Size(max = 258)
    @Column(name = "address2")
    private String address2;

    @Column(name = "country")
    private String country;

    @Column(name = "state")
    private String state;

    @Column(name = "district")
    private String district;

    @Column(name = "taluk")
    private String taluk;

    @Column(name = "pincode")
    private String pincode;

    @Size(max = 250)
    @Column(name = "landmark")
    private String landmark;

    @Column(name = "latitude")
    private double latitude;

    @Column(name = "longtitude")
    private double longtitude;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "store_details", unique = true, referencedColumnName = "id")
    private CorporateDetailsEntity corporateDetailsEntity;

    public CorporateAddressEntity(CorporateDetailsEntity corporateDetailsEntity, CorporateAddress corporateAddress) {
	super();
	this.corporateDetailsEntity = corporateDetailsEntity;
	this.id = corporateAddress.getId();
	this.active = corporateAddress.getActive();
	this.address1 = corporateAddress.getAddress1();
	this.address2 = corporateAddress.getAddress2();
	this.country = corporateAddress.getCountry();
	this.state = corporateAddress.getState();
	this.district = corporateAddress.getDistrict();
	this.taluk = corporateAddress.getTaluk();
	this.landmark = corporateAddress.getLandmark();
	this.pincode = corporateAddress.getPincode();
	this.latitude = corporateAddress.getLatitude();
	this.longtitude = corporateAddress.getLongtitude();

	if (corporateAddress.getStoreDetails() != null) {
	    corporateDetailsEntity.setId(corporateAddress.getStoreDetails());
	    this.setCorporateDetailsEntity(corporateDetailsEntity);
	}

    }

    public CorporateAddress getCorporateAddressDomain() {

	CorporateAddress corporateAddress = new CorporateAddress(
		this.getId() == null ? StringConstantsUtil.EMPTY_DATA_PLACEHOLDER : this.getId(), active,
		this.getAddress1() == null ? StringConstantsUtil.EMPTY_DATA_PLACEHOLDER : this.getAddress1(),
		this.getAddress2() == null ? StringConstantsUtil.EMPTY_DATA_PLACEHOLDER : this.getAddress2(),
		this.getCountry() == null ? StringConstantsUtil.EMPTY_DATA_PLACEHOLDER : this.getCountry(),
		this.getState() == null ? StringConstantsUtil.EMPTY_DATA_PLACEHOLDER : this.getState(),
		this.getDistrict() == null ? StringConstantsUtil.EMPTY_DATA_PLACEHOLDER : this.getDistrict(),
		this.getTaluk() == null ? StringConstantsUtil.EMPTY_DATA_PLACEHOLDER : this.getTaluk(),
		this.getPincode() == null ? StringConstantsUtil.EMPTY_DATA_PLACEHOLDER : this.getPincode(),
		this.getLandmark() == null ? StringConstantsUtil.EMPTY_DATA_PLACEHOLDER : this.getLandmark(),
		this.getLatitude(), this.getLongtitude(),
		this.getCorporateDetailsEntity() == null ? StringConstantsUtil.EMPTY_DATA_PLACEHOLDER
			: this.getCorporateDetailsEntity().getId());

	return corporateAddress;

    }

}
