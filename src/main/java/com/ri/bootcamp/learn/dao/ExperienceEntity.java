package com.ri.bootcamp.learn.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

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
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "resource", referencedColumnName = "id")
	private ResourceDetailsEntity resourceDetailsEntity;

	public ExperienceEntity(Experience experience) {
		super();
		this.id = experience.getId();
		this.active = experience.getActive();
		this.orgName = experience.getOrgName();
		this.orgAddress = experience.getOrgAddress();

		if (experience.getResourceDetailsId() != null) {
			ResourceDetailsEntity resourceDetailsEntity = new ResourceDetailsEntity();
			resourceDetailsEntity.setId(experience.getResourceDetailsId());
			this.setResourceDetailsEntity(resourceDetailsEntity);
		}
	}

	public Experience getExperienceDomain() {

		Experience experience = new Experience(this.getId() == null ? "-" : this.getId(), this.getActive(),
				this.getOrgName() == null ? "-" : this.getOrgName(),
				this.getOrgAddress() == null ? "-" : this.getOrgAddress(),
				this.getResourceDetailsEntity() == null ? StringConstantsUtil.EMPTY_DATA_PLACEHOLDER
						: this.getResourceDetailsEntity().getName());

		return experience;
	}
}
