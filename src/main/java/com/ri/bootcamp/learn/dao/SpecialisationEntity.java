package com.ri.bootcamp.learn.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import com.ri.bootcamp.learn.utility.StringConstantsUtil;
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
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "resource", unique = true, referencedColumnName = "id")
	private List<ResourceDetailsEntity> resourceDetailsEntitySet = new ArrayList<>();

	public SpecialisationEntity(ResourceDetailsEntity resourceDetailsEntity,Specialisation specialisation) {
		super();
		this.id = specialisation.getId();
		this.active = specialisation.getActive();
		this.specialisationName = specialisation.getSpecialisationName();
		this.specialisationDescription = specialisation.getSpecialisationDescription();
		
		if (specialisation.getResourceDetailsId() != null) {
			resourceDetailsEntity.setId(specialisation.getResourceDetailsId());
			this.resourceDetailsEntitySet.add(resourceDetailsEntity);
		}
	}
	
	public Specialisation getSpecialisationDomain() {
		Specialisation specialisation = new Specialisation(
				this.getId() == null ? StringConstantsUtil.EMPTY_DATA_PLACEHOLDER : this.getId(), this.getActive(),
				this.getSpecialisationName() == null ? StringConstantsUtil.EMPTY_DATA_PLACEHOLDER : this.getSpecialisationName(),
				this.getSpecialisationDescription() == null ? StringConstantsUtil.EMPTY_DATA_PLACEHOLDER : this.getSpecialisationDescription());

		return specialisation;
	}
}
