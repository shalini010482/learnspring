package com.ri.bootcamp.learn.dao;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.ri.bootcamp.learn.domain.Country;
import com.ri.bootcamp.learn.utility.StringConstantsUtil;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
 * CREATE TABLE `country` (
  `dup_id` varchar(45) DEFAULT NULL,
  `testing` varchar(45) DEFAULT NULL,
  `id` varchar(45) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `created_at` date DEFAULT NULL,
  `updated_at` date DEFAULT NULL,
  `active` tinyint(4) DEFAULT '1',
  `deleted_at` date DEFAULT NULL,
  `created_by` varchar(45) DEFAULT NULL,
  `updated_by` varchar(45) DEFAULT NULL,
  `tel_code` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

 */

@Entity
@Table(name = "country")
@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class CountryEntity extends BaseEntity {

    @Size(max = 45)
    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @Size(max = 45)
    @Column(name = "tel_code", unique = true, nullable = false)
    private String telCode;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "countryEntity")
    @OrderBy("name ASC")
    private List<StateEntity> stateEntityList = new ArrayList<>();

    public CountryEntity(Country country) {
        super();
        this.id = country.getId();
        this.active = country.getActive();
        this.name = country.getName();
        this.telCode = country.getTelCode();
    }

    public Country getCountryDomain() {
        List<StateEntity> stateEntityList = this.getStateEntityList();
        Map<String, String> stateKeyLinkHashMap = new LinkedHashMap<>();
        for (StateEntity stateEntity : stateEntityList) {
            stateKeyLinkHashMap.put(stateEntity.getId(), stateEntity.getName());
        }
        Country country = new Country(this.getId() == null ? StringConstantsUtil.EMPTY_DATA_PLACEHOLDER : this.getId(),
                this.getActive(), this.getName() == null ? StringConstantsUtil.EMPTY_DATA_PLACEHOLDER : this.getName(),
                this.getTelCode() == null ? StringConstantsUtil.EMPTY_DATA_PLACEHOLDER : this.getTelCode(),
                stateKeyLinkHashMap);
        return country;
    }

}
