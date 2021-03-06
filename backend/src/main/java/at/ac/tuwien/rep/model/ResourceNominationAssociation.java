package at.ac.tuwien.rep.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="resource_nomination_association")
public class ResourceNominationAssociation {
	@Id
	@GeneratedValue
	private Long id;
	private String participant;
	@OneToMany(mappedBy="association")
	private List<ResourceNomination> nominations;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getParticipant() {
		return participant;
	}

	public void setParticipant(String participant) {
		this.participant = participant;
	}
	
	public List<ResourceNomination> getNominations() {
		return nominations;
	}
	
	public void setNominations(List<ResourceNomination> nominations) {
		this.nominations = nominations;
	}
}
