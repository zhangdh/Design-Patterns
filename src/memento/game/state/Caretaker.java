package memento.game.state;

public class Caretaker {
	 private Memento memento;
	    
	    /**
	     * 备忘录的取值方法
	     */
	    public Memento retrieveMemento() {
	        return this.memento;
	    }

	    /**
	     * 备忘录的保存方法
	     */
	        public void saveMemento(Memento memento) {
	        this.memento = memento;
	    }
}
