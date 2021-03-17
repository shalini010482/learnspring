package com.ri.bootcamp.learn.dao;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.annotations.DynamicUpdate;

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
@Table(name = "specialisation_details")
@NoArgsConstructor
@AllArgsConstructor
@DynamicUpdate
@ToString
@EqualsAndHashCode(callSuper = true)
public class SpecialisationEntity extends BaseEntity {

	@Size(max = 50)
	@Column(name = "specialisation_name")
	private String specialisationName;

	@Size(max = 1024)
	@Column(name = "specialisation_description")
	private String specialisationDescription;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "resource", unique = true, referencedColumnName = "id")
	private ResourceDetailsEntity resourceDetailsEntity;

	public SpecialisationEntity(ResourceDetailsEntity resourceDetailsEntity,Specialisation specialisation) {
		super();
		this.id = specialisation.getId();
		this.active = specialisation.getActive();
		this.specialisationName = specialisation.getSpecialisationName();
		this.specialisationDescription = specialisation.getSpecialisationDescription();
		
		if (specialisation.getResourceDetailsId() != null) {
			resourceDetailsEntity.setId(specialisation.getResourceDetailsId());
			this.setResourceDetailsEntity(resourceDetailsEntity);
		}
	}

	public Specialisation getSpecialisationDomain() {
		Specialisation specialisation = new Specialisation(
				this.getId() == null ? "-" : this.getId(), this.getActive(),
				this.getSpecialisationName() == null ? "-" : this.getSpecialisationName(),
				this.getSpecialisationDescription() == null ? "-" : this.getSpecialisationDescription());

		return specialisation;
	}
}
