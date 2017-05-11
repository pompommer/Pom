package asteroids.model;

import asteroids.part3.programs.SourceLocation;

public class GetDirectionExpression extends Expression<Double>{
	
	private SourceLocation sourceLocation;

	public GetDirectionExpression(SourceLocation sourceLocation) {
		super(sourceLocation);
	}

	@Override
	public Double evaluate() {
		return getProgram().getShip().getOrientation();
		
	}

}
