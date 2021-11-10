package fr.bediss;

import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.Generated;
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

@Table (name ="T_Patient")
public class Patient {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nom;
	
	private String email;
	
	@OneToMany (mappedBy = "patient") //mappedBy : il y aura une clé étrangère dans la Table Rendez-vous nommé idPatient
	private Collection<RendezVous> rendezVous;
	
	/*
	 * Quand on a @OneToMany : c'est la Class cible (dans notre cas "Rendezvous") qui DOIT contenir la clé étrangère
	 * 
	 */
	
}
