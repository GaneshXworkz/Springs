package com.xworkz.forest.ForestEntityDTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "forest_table")
@NamedQuery(name="findByname",query = "Select entity from ForestEntity entity where entity.name='amezon'")
@NamedQuery(name="findByState",query = "Select entity from ForestEntity entity where entity.state='WestBengal'")
@NamedQuery(name="findByNameAndStateAndArea",query = "Select  name from ForestEntity entity where entity.area='WestBengal'AND  entity.state='Kolkata'")
@NamedQuery(name="findAreaByName",query = "Select  area from ForestEntity entity where entity.name='Wayanad'")
@NamedQuery(name="findIdByNameAndState",query = "Select  id from ForestEntity entity where entity.name='Wayanad'AND entity.state='Kerala'")
@NamedQuery(name="findNameById",query = "Select  name from ForestEntity entity where entity.id=1")
@NamedQuery(name="findStateByNameAndArea",query = "Select  state from ForestEntity entity where entity.name='kukrail' AND entity.area='lucknow'")
@NamedQuery(name="findCount",query = "Select count(entity) from ForestEntity entity")
@NamedQuery(name="findMaxArea",query = "Select max(id) from ForestEntity entity")


public class ForestEntity {

	@Id
	@Column(name = "f_id")
	private int id;

	@Column(name = "f_name")
	private String name;

	@Column(name = "f_state")
	private String state;

	@Column(name = "f_area")
	private String area;

	@Column(name = "f_type")
	private String type;

}
