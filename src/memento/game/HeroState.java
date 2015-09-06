package memento.game;

import java.util.Date;

/*需要备份保存的英雄状态信息对象*/
public class HeroState implements Cloneable{
	private int HP;
	private int MP;
	
	private Date stateDate;

	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}

	public int getMP() {
		return MP;
	}

	public void setMP(int mP) {
		MP = mP;
	}

	public Date getStateDate() {
		return stateDate;
	}

	public void setStateDate(Date stateDate) {
		this.stateDate = stateDate;
	}
	
	public HeroState clone (){
		try{
			return (HeroState)super.clone();
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
}
