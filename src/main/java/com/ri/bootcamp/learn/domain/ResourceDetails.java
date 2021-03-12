package com.ri.bootcamp.learn.domain;

import java.util.Set;
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
public class ResourceDetails extends BaseDomain {

	private static final long serialVersionUID = 1L;
	private String name;
	private String gender;
	private String caste;
	private String religion;
	private String maritalStatus;
	private String qualification;
	private String motherTongue;
	private String postApplierFor;

	private Set<MetaSkill> skillSet;

	public String getSkillIdList() {
		StringBuilder skillIds = new StringBuilder();
		for (MetaSkill s : skillSet) {
			skillIds.append(s.getId()).append(",");
		}
		return skillIds.toString();
	}

}
