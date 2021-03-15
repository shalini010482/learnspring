package com.ri.bootcamp.learn.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Size;

import com.ri.bootcamp.learn.domain.State;
import com.ri.bootcamp.learn.utility.StringConstantsUtil;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
 CREATE TABLE `state` (
  `dup_id` varchar(45) DEFAULT NULL,
  `testing` varchar(45) DEFAULT NULL,
  `id` varchar(45) NOT NULL,
  `name` varchar(100) NOT NULL,
  `created_at` date DEFAULT NULL,
  `updated_at` date DEFAULT NULL,
  `country` varchar(45) DEFAULT NULL,
  `active` tinyint(4) DEFAULT '1',
  `deleted_at` date DEFAULT NULL,
  `created_by` varchar(45) DEFAULT NULL,
  `updated_by` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

 */

@Entity
@Table(name = "state", uniqueConstraints = @UniqueConstraint(columnNames = { "name", "country" }))
@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class StateEntity extends BaseEntity {

    @Size(max = 100)
    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country", referencedColumnName = "id")
    private CountryEntity countryEntity;

    public StateEntity(State state) {
        super();
        this.id = state.getId();
        this.active = state.getActive();
        this.name = state.getName();

        if (state.getCountryId() != null) {
            CountryEntity countryEntity = new CountryEntity();
            countryEntity.setId(state.getCountryId());
            this.setCountryEntity(countryEntity);
        }
    }

    public State getStateDomain() {

        State state = new State(this.getId() == null ? StringConstantsUtil.EMPTY_DATA_PLACEHOLDER : this.getId(),
                this.getActive(), this.getName() == null ? StringConstantsUtil.EMPTY_DATA_PLACEHOLDER : this.getName(),
                this.getCountryEntity() == null ? StringConstantsUtil.EMPTY_DATA_PLACEHOLDER
                        : this.getCountryEntity().getId(),
                this.getCountryEntity() == null ? StringConstantsUtil.EMPTY_DATA_PLACEHOLDER
                        : this.getCountryEntity().getName());
        return state;
    }

}
