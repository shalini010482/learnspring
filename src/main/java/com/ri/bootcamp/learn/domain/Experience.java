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
	private String noOfYears;	
	private String dateOfJoining;
	private String dateOfResigning;
	private String reasonForResignation;
	@NotEmpty
	private String resourceDetailsId;

	public Experience(String id, int active, String orgName, String orgAddress,String noOfYears,String dateOfJoining,String dateOfResigning,String reasonForResignation, String resourceDetailsId) {
		super(id, active);
		this.orgName = orgName;
		this.orgAddress = orgAddress;
		this.noOfYears = noOfYears;		
		this.dateOfJoining = dateOfJoining;
		this.dateOfResigning = dateOfResigning;
		this.reasonForResignation = reasonForResignation;
	}
}
