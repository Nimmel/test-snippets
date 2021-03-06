package fr.an.tests.hivemetastorejpa;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "WM_TRIGGER")
@Data
public class MWMTrigger {

	@Id
	@Column(name = "TRIGGER_ID", nullable = false)
	private int triggerId;

	@ManyToOne
	@Column(name = "RP_ID", nullable = false)
	private MWMResourcePlan resourcePlan;

	@Column(name = "NAME", length = 128, nullable = false)
	private String name;

	@Column(name = "TRIGGER_EXPRESSION", length = 1024)
	private String triggerExpression;

	@Column(name = "ACTION_EXPRESSION", length = 1024)
	private String actionExpression;

	// This is integer because in Derby DN converts boolean to char, breaking sysdb.
	@Column(name = "IS_IN_UNMANAGED")
	private int isInUnmanaged;

	private Set<MWMPool> pools;

}
