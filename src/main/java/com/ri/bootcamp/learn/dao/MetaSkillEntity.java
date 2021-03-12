package com.ri.bootcamp.learn.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.annotations.DynamicUpdate;

import com.ri.bootcamp.learn.domain.MetaSkill;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@Table(name = "skill_details_metadata")
@NoArgsConstructor
@AllArgsConstructor
@DynamicUpdate
@ToString
@EqualsAndHashCode(callSuper = true)
public class MetaSkillEntity extends BaseEntity {

	@Size(max = 50)
	@Column(name = "skill_name")
	private String skillName;

	@Size(max = 1024)
	@Column(name = "skill_description")
	private String skillDescription;		

	public MetaSkillEntity(MetaSkill metaSkill) {
		super();
		this.id = metaSkill.getId();
		this.active = metaSkill.getActive();
		this.skillName = metaSkill.getSkillName();
		this.skillDescription = metaSkill.getSkillDescription();
	}

	public MetaSkill getMetaSkillDomain() {

		MetaSkill metaSkill = new MetaSkill(
				this.getId() == null ? "-" : this.getId(), this.getActive(),
				this.getSkillName() == null ? "-" : this.getSkillName(),
				this.getSkillDescription() == null ? "-" : this.getSkillDescription());

		return metaSkill;
	}
}
