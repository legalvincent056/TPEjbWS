package metier;

import javax.persistence.DiscriminatorValue;
import javax.xml.bind.annotation.XmlRootElement;

@DiscriminatorValue("avion")
@XmlRootElement
public class CargaisonAerienne extends Cargaison {

	
		private double poidsMax;

		public double getPoidsMax() {
			return poidsMax;
		}

		public void setPoidsMax(double poidsMax) {
			this.poidsMax = poidsMax;
		}
		
		
	
}
