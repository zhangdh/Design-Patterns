package memento.game;

public class SceneState implements Cloneable{
	private int coin;
	
	private int wood;
	
	private String mapName;

	public int getCoin() {
		return coin;
	}

	public void setCoin(int coin) {
		this.coin = coin;
	}

	public int getWood() {
		return wood;
	}

	public void setWood(int wood) {
		this.wood = wood;
	}

	public String getMapName() {
		return mapName;
	}

	public void setMapName(String mapName) {
		this.mapName = mapName;
	}
	public SceneState clone(){
		try{
			return (SceneState)super.clone();
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
}
