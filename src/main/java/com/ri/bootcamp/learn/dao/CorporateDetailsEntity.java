package com.ri.bootcamp.learn.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.ri.bootcamp.learn.domain.CorporateAddress;
import com.ri.bootcamp.learn.domain.CorporateDetails;
import com.ri.bootcamp.learn.utility.StringConstantsUtil;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
CREATE TABLE `store_details` (
  `dup_id` varchar(45) DEFAULT NULL,
  `testing` varchar(45) DEFAULT NULL,
  `id` varchar(45) NOT NULL,
  `store_name` varchar(245) DEFAULT NULL,
  `description` varchar(245) DEFAULT NULL,
  `mobile` varchar(45) DEFAULT NULL,
  `email` varchar(245) DEFAULT NULL,
  `landline` varchar(45) DEFAULT NULL,
  `default_store` varchar(45) DEFAULT '1',
  `updated_by` varchar(45) DEFAULT NULL,
  `created_at` date DEFAULT NULL,
  `updated_at` date DEFAULT NULL,
  `active` tinyint(4) DEFAULT '1',
  `deleted_at` date DEFAULT NULL,
  `created_by` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


*/

@Entity
@Table(name = "store_details")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString
public class CorporateDetailsEntity extends BaseEntity {

	@Size(max = 245)
	@Column(name = "store_name", unique = true, nullable = false)
	private String corporateName;

	@Size(max = 245)
	@Column(name = "description")
	private String description;

	@Size(max = 45)
	@Column(name = "mobile", unique = true, nullable = false)
	private String mobile;

	@Size(max = 45)
	@Column(name = "email")
	private String email;

	@Size(max = 45)
	@Column(name = "landline")
	private String landline;

	@Size(max = 45)
	@Column(name = "default_store")
	private String defaultStore;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "corporateDetailsEntity", cascade = CascadeType.ALL)
	private List<CorporateAddressEntity> corporateAddressEntity;

	public CorporateDetailsEntity(CorporateDetails corporateDetails) {
		super();
		this.id = corporateDetails.getId();
		this.active = corporateDetails.getActive();
		this.corporateName = corporateDetails.getCorporateName();
		this.description = corporateDetails.getDescription();
		this.mobile = corporateDetails.getMobile();
		this.email = corporateDetails.getEmail();
		this.landline = corporateDetails.getLandline();
		this.defaultStore = corporateDetails.getLandline();

		List<CorporateAddressEntity> corpAddressEntyList = new ArrayList<>();
		if (corporateDetails.getCorporateAddressList() != null) {

			for (CorporateAddress corpAddress : corporateDetails.getCorporateAddressList()) {
				corpAddressEntyList.add(new CorporateAddressEntity(this, corpAddress));
			}
			// this.corporateAddressEntity = new CorporateAddressEntity(this,
			// corporateDetails.getCorporateAddress());

		}
		this.corporateAddressEntity = corpAddressEntyList;
	}

	public CorporateDetails getCorporateDetailsDomain() {
		CorporateAddress corporateAddress = new CorporateAddress();
//	CorporateDetails corporateDetails = new CorporateDetails(
//		this.getId() == null ? StringConstantsUtil.EMPTY_DATA_PLACEHOLDER : this.getId(), this.getActive(),
//		this.getCorporateName() == null ? StringConstantsUtil.EMPTY_DATA_PLACEHOLDER : this.getCorporateName(),
//		this.getDescription() == null ? StringConstantsUtil.EMPTY_DATA_PLACEHOLDER : this.getDescription(),
//		this.getMobile() == null ? StringConstantsUtil.EMPTY_DATA_PLACEHOLDER : this.getMobile(),
//		this.getEmail() == null ? StringConstantsUtil.EMPTY_DATA_PLACEHOLDER : this.getEmail(),
//		this.getLandline() == null ? StringConstantsUtil.EMPTY_DATA_PLACEHOLDER : this.getLandline(),
//		this.getDefaultStore() == null ? StringConstantsUtil.EMPTY_DATA_PLACEHOLDER : this.getLandline(),
//				null
//				
////		this.getCorporateAddressEntity() == null ? corporateAddress
////			: this.getCorporateAddressEntity().getCorporateAddressDomain()
//			);

		return null;
	}
}
