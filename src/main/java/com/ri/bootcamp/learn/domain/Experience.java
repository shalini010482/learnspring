package com.ri.bootcamp.learn.domain;

import javax.validation.constraints.NotEmpty;

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
public class Experience extends BaseDomain {

	@NotEmpty
	private String orgName;
	private String orgAddress;

	@NotEmpty
	private String resourceDetailsId;

	public Experience(String id, int active, String orgName, String orgAddress, String resourceDetailsId) {
		super(id, active);
		this.orgName = orgName;
		this.orgAddress = orgAddress;
		this.resourceDetailsId = resourceDetailsId;
	}
}
