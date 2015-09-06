package memento.game;

public class Caretaker {
	 /**
     * 备忘录实体
     */
    private GameMemento memento;

    public GameMemento getMemento() {
        return memento;
    }

    public void setMemento(GameMemento memento) {
        this.memento = memento;
    }
}
