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

public class Specialisation extends BaseDomain {
	private String specialisationName;
	private String specialisationDescription;

	public Specialisation(String id, int active, String specialisationName, String specialisationDescription) {
		super(id, active);
		this.specialisationName = specialisationName;
		this.specialisationDescription = specialisationDescription;
	}
}
