package com.ri.bootcamp.learn.domain;

import java.util.List;

import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CorporateDetails extends BaseDomain {

	@NotEmpty
	private String corporateName;
	private String description;
	@NotEmpty
	private String mobile;
	@NotEmpty
	private String email;
	private String landline;
	@NotEmpty
	private String defaultStore;
	@NotEmpty
	private List<CorporateAddress> corporateAddressList;

}