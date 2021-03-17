package com.ri.bootcamp.learn.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import java.util.Date;

import javax.persistence.CascadeType;
import org.hibernate.annotations.DynamicUpdate;

import com.ri.bootcamp.learn.domain.Experience;
import com.ri.bootcamp.learn.utility.StringConstantsUtil;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@Table(name = "experience_details")
@NoArgsConstructor
@AllArgsConstructor
@DynamicUpdate
@ToString
@EqualsAndHashCode(callSuper = true)
public class ExperienceEntity extends BaseEntity {

	@Size(max = 50)
	@Column(name = "org_name")
	private String orgName;

	@Size(max = 1024)
	@Column(name = "org_address")
	private String orgAddress;

	@Size(max = 50)
	@Column(name = "no_of_years")
	private float noOfYears;

	@Column(name = "date_of_joining")
	private Date dateOfJoining;

	@Column(name = "date_of_resigning")
	private Date dateOfResigning;

	@Size(max = 1024)
	@Column(name = "reason_for_resignation")
	private String reasonForResignation;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "resource", unique = true, referencedColumnName = "id")
	private ResourceDetailsEntity resourceDetailsEntity;

	public ExperienceEntity(ResourceDetailsEntity resourceDetailsEntity, Experience experience) {
		super();

		this.id = experience.getId();
		this.active = experience.getActive();
		this.orgName = experience.getOrgName();
		this.orgAddress = experience.getOrgAddress();
		this.noOfYears = experience.getNoOfYears();
		this.dateOfJoining = experience.getDateOfJoining();
		this.dateOfResigning = experience.getDateOfResigning();
		this.reasonForResignation = experience.getReasonForResignation();

		if (experience.getResourceDetailsId() != null) {
			resourceDetailsEntity.setId(experience.getResourceDetailsId());
			this.setResourceDetailsEntity(resourceDetailsEntity);
		}
	}

	public Experience getExperienceDomain() {

		Experience experience = new Experience(
				this.getId() == null ? StringConstantsUtil.EMPTY_DATA_PLACEHOLDER : this.getId(), this.getActive(),
				this.getOrgName() == null ? StringConstantsUtil.EMPTY_DATA_PLACEHOLDER : this.getOrgName(),
				this.getOrgAddress() == null ? StringConstantsUtil.EMPTY_DATA_PLACEHOLDER : this.getOrgAddress(),
				this.getNoOfYears(), this.getDateOfJoining() == null ? null : this.getDateOfJoining(),
				this.getDateOfResigning() == null ? null : this.getDateOfResigning(),
				this.getReasonForResignation() == null ? StringConstantsUtil.EMPTY_DATA_PLACEHOLDER
						: this.getReasonForResignation(),
				this.getResourceDetailsEntity() == null ? StringConstantsUtil.EMPTY_DATA_PLACEHOLDER
						: this.getResourceDetailsEntity().getId());

		return experience;
	}
}
