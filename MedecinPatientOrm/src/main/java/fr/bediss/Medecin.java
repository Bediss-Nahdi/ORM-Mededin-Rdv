package fr.bediss;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ ToString
@Table (name ="T_Medecin")
public class Medecin {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nom;
	
	private String specialite;
	
	private String email;
	
	@OneToMany (mappedBy = "medecin") 
	private Collection<RendezVous> rendezVous;
	

}
