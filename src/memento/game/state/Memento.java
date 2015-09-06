package memento.game.state;

public class Memento {
	private State state;

    /**
     * 构造函数
     */
    public Memento(State state) {
        this.state = state;
    }
    
    public State getState(){
    	return this.state;
    }
}
