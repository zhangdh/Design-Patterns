package memento.game;

public class Game {
	private HeroState hState;
	
	private SceneState sState;

	public HeroState gethState() {
		return hState;
	}

	public void sethState(HeroState hState) {
		this.hState = hState;
	}

	public SceneState getsState() {
		return sState;
	}

	public void setsState(SceneState sState) {
		this.sState = sState;
	}
	
	/*自身进行备份的方法*/
	
	public GameMemento createMemento(){
		return new GameMemento(hState,sState);
	}
	/*玩游戏，内部状态改变*/
	public void play(){
		hState.setHP(10);
		hState.setMP(10);
		sState.setCoin(1);
		sState.setWood(1);
	}
	
	public void restore(GameMemento game){
		this.hState = game.gethState();
		this.sState = game.getsState();
	}
}
