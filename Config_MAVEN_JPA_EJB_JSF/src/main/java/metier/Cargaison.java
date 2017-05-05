package metier;

import java.beans.Transient;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="modalite")
@XmlSeeAlso({CargaisonRoutiere.class,CargaisonAerienne.class})
@XmlRootElement
public class Cargaison implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idReference;
	private int distance;
	private Date dateLivraison;
	
	@OneToMany (mappedBy="cargaison")
	private List<Marchandise> marchandises;
	
	
	public long getIdReference() {
		return idReference;
	}
	public void setIdReference(long idReference) {
		this.idReference = idReference;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public Date getDateLivraison() {
		return dateLivraison;
	}
	public void setDateLivraison(Date dateLivraison) {
		this.dateLivraison = dateLivraison;
	}
	@XmlTransient //Permet a Web Service de ne pas mettre la List dans le WSDL (en xml) 
	public List<Marchandise> getMarchandises() {
		return marchandises;
	}
	public void setMarchandises(List<Marchandise> marchandises) {
		this.marchandises = marchandises;
	}

	

}
