package design_patterns.structural.adapter.round;

public class RoundPeg {
	private double radius;
		
	public RoundPeg() {
		
	}
	
	public RoundPeg(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public boolean fits(RoundPeg peg) {
		boolean result;
		result = (this.getRadius() >= peg.getRadius());
		return result;
	}
}
