package with;

public class FichierContext extends State{
	
	private State state;
	
	public FichierContext(State state) {
		this.state = state;
	}
	
	@Override
	public void lecture() {
		state.lecture();
	}

}
