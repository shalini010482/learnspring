package com.ri.bootcamp.learn.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class MetaSkill extends BaseDomain {
	private String skillName;
	private String skillDescription;

	public MetaSkill(String id, int active, String skillName, String skillDescription) {
		super(id, active);
		this.skillName = skillName;
		this.skillDescription = skillDescription;
	}
}
