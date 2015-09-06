package memento.game.state;

public class Originator {
	private State state;

    /**
     * 工厂方法，返回一个新的备忘录对象
         */
    public Memento createMemento() {
        return new Memento(state);
    }

    /**
     * 将发起人恢复到备忘录对象所记载的状态
     */
    public void restoreMemento(Memento memento) {
    	this.state = memento.getState();
    }

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
 
}
