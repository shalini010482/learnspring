package com.ri.bootcamp.learn.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.annotations.DynamicUpdate;

import com.ri.bootcamp.learn.domain.Experience;
import com.ri.bootcamp.learn.domain.ResourceDetails;
import com.ri.bootcamp.learn.domain.Specialisation;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@Table(name = "resource_details")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@DynamicUpdate
@ToString
public class ResourceDetailsEntity extends BaseEntity {

	@Size(max = 150)
	@Column(name = "name")
	private String name;

	@Size(max = 10)
	@Column(name = "gender")
	private String gender;

	@Size(max = 50)
	@Column(name = "caste")
	private String caste;

	@Size(max = 50)
	@Column(name = "religion")
	private String religion;

	@Size(max = 50)
	@Column(name = "marital_status")
	private String maritalStatus;

	@Size(max = 100)
	@Column(name = "qualification")
	private String qualification;

	@Size(max = 50)
	@Column(name = "mother_tongue")
	private String motherTongue;

	@Size(max = 100)
	@Column(name = "post_applier_for")
	private String postApplierFor;

	@Size(max = 1024)
	@Column(name = "skill_id_list")
	private String skillIdList;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "resourceDetailsEntity", cascade = CascadeType.ALL)
	private List<ExperienceEntity> experienceEntyList = new ArrayList<>();
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "resourceDetailsEntity", cascade = CascadeType.ALL)
	private List<SpecialisationEntity> specialisationEntyList = new ArrayList<>();

	public ResourceDetailsEntity(ResourceDetails resourceDetails) {
		super();
		this.active = resourceDetails.getActive();
		this.name = resourceDetails.getName();
		this.gender = resourceDetails.getGender();
		this.caste = resourceDetails.getCaste();
		this.religion = resourceDetails.getReligion();
		this.maritalStatus = resourceDetails.getMaritalStatus();
		this.qualification = resourceDetails.getQualification();
		this.motherTongue = resourceDetails.getMotherTongue();
		this.postApplierFor = resourceDetails.getPostApplierFor();
		this.skillIdList = resourceDetails.getSkillIdList();

		List<ExperienceEntity> expEntityList = new ArrayList<>();		

		if (resourceDetails.getExperienceSet() != null) {
			for (Experience exp : resourceDetails.getExperienceSet()) {
				expEntityList.add(new ExperienceEntity(this, exp));
			}
		}
		this.experienceEntyList = expEntityList;	
		
		List<SpecialisationEntity> specialisationEntityList = new ArrayList<>();
		if (resourceDetails.getSpecialisationList() != null) {
			for (Specialisation specialisation : resourceDetails.getSpecialisationList()) {
				specialisationEntityList.add(new SpecialisationEntity(this, specialisation));
			}
		}
		this.specialisationEntyList = specialisationEntityList;
	}

	public ResourceDetails getResourceDetailsDomain() {

		List<Experience> experienceList = new ArrayList<>();
		List<ExperienceEntity> experienceEntyList = this.getExperienceEntyList();

		for (ExperienceEntity experienceEntity : experienceEntyList) {
			experienceList.add(experienceEntity.getExperienceDomain());
		}
		
		List<Specialisation> specialisationList = new ArrayList<>();
		List<SpecialisationEntity> specialisationEntyList = this.getSpecialisationEntyList();

		for (SpecialisationEntity specialisationEntity : specialisationEntyList) {
			specialisationList.add(specialisationEntity.getSpecialisationDomain());
		}

		ResourceDetails resourceDetails = new ResourceDetails(this.getName() == null ? "-" : this.getName(),
				this.getGender() == null ? "-" : this.getGender(), this.getCaste() == null ? "-" : this.getCaste(),
				this.getReligion() == null ? "-" : this.getReligion(),
				this.getMaritalStatus() == null ? "-" : this.getMaritalStatus(),
				this.getQualification() == null ? "-" : this.getQualification(),
				this.getMotherTongue() == null ? "-" : this.getMotherTongue(),
				this.getPostApplierFor() == null ? "-" : this.getPostApplierFor(),
						null, experienceList,specialisationList);

		return resourceDetails;
	}

}
