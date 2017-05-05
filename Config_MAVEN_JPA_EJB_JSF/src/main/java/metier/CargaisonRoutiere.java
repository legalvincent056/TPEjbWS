package metier;

import javax.persistence.DiscriminatorValue;
import javax.xml.bind.annotation.XmlRootElement;

@DiscriminatorValue("route")
@XmlRootElement
public class CargaisonRoutiere extends Cargaison {

	
	private double temperatureConservation;

	public double getTemperatureConservation() {
		return temperatureConservation;
	}

	public void setTemperatureConservation(double temperatureConservation) {
		this.temperatureConservation = temperatureConservation;
	}
	
	
}
