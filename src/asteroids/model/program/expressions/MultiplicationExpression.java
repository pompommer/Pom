package asteroids.model.program.expressions;

import asteroids.part3.programs.SourceLocation;

public class MultiplicationExpression extends Expression<Double> {

	public MultiplicationExpression(Expression<? extends Double> e1, 
			Expression<? extends Double> e2, SourceLocation sourceLocation) {
		super(sourceLocation);
		this.e1 = e1;
		this.e2 = e2;
	}
	
	private Expression<? extends Double> e1;
	private Expression<? extends Double> e2;

	@Override
	public Double evaluate() {
		return e1.evaluate() * e2.evaluate();
		
	}

}