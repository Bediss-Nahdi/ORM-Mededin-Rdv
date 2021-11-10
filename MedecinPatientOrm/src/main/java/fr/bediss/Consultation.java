package fr.bediss;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ ToString
@Table (name ="T_Consultation")
public class Consultation {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Date dateConsultation;
	
	private String rapportConsultation;
	
	private double prixConsultation;
	
	@OneToOne (mappedBy ="consultation")
	private RendezVous rendezVous;
}
