package memento.game;

public class GameMemento {
	private HeroState hState;
	
	private SceneState sState;
	
	public GameMemento(HeroState hState,SceneState sState){
		this.hState = hState.clone();
		this.sState = sState.clone();
	}
	
	public HeroState gethState(){
		return hState;
	}
	
	public SceneState getsState(){
		return sState;
	}
}
