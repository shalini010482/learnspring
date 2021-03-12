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

public class Organisation extends BaseDomain {
	private String organisationName;
	private String organisationAddress;

	public Organisation(String id, int active, String organisationName, String organisationAddress) {
		super(id, active);
		this.organisationName = organisationName;
		this.organisationAddress = organisationAddress;
	}
}
