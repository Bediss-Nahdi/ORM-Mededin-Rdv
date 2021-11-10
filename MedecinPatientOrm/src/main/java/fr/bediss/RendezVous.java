package fr.bediss;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ ToString

@Table (name ="T_Rendez_Vous")
public class RendezVous {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	private Date dateRendezVous;
	
	@ManyToOne//(fetch = FetchType.LAZY)
//	@JoinColumn(name="Patient_id", nullable=false )
	private Patient patient;
	
	@ManyToOne
	private Medecin medecin;
	
	@OneToOne
	private Consultation consultation;
	
	
	

}
