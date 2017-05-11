package asteroids.model;

import asteroids.part3.programs.SourceLocation;

public class GetVyExpression extends Expression<Double>{
	
	private SourceLocation sourceLocation;
	private Expression<? extends Entity> e;

	public GetVyExpression(Expression<? extends Entity> e,SourceLocation sourceLocation) {
		super(sourceLocation);
	}

	@Override
	public Double evaluate() {
		return e.evaluate().getYVelocity();
	}

}