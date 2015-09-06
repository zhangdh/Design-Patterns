package memento.game;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Game game = new Game();
		 HeroState hState = new HeroState();
		 hState.setHP(109);
		 hState.setMP(100);
		 SceneState sState = new SceneState();
		 sState.setCoin(1000);
		 sState.setWood(1000);
		 game.sethState(hState);
		 game.setsState(sState);
		 System.out.println("游戏状态备份开始");
		 GameMemento memento = game.createMemento();
		 Caretaker ct = new Caretaker();
	     ct.setMemento(memento);
		 System.out.println("游戏状态备份完成");
         System.out.println("开始游戏，当前英雄生命值：" + game.gethState().getHP());
         game.play();
         System.out.println("游戏结束，当前英雄生命值：" + game.gethState().getHP());
         System.out.println("游戏状态还原开始");
         game.restore(ct.getMemento());
         System.out.println("游戏状态还原结束");
         System.out.println("当前英雄生命值：" + game.gethState().getHP());

	}

}
