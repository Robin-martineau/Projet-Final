
public class Celsius {
	private double degrees;
	private String ville;
	
	Celsius(double aDegrees, String ville){
	 setDegrees(aDegrees);
	 setVille(ville);	 
	}
	
	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public void updateDegrees() {
		setDegrees(getDegrees()+1);
	}
	
	public double getDegrees(){
	return degrees;
	}
	
	public void setDegrees(double aDegrees){
	degrees = aDegrees;
	}
}