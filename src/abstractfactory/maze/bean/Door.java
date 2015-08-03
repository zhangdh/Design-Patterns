package abstractfactory.maze.bean;

public class Door extends MapSite{
	private Room room1;
	private Room room2;
	private boolean isOpen;
	public void Enter(){
		System.out.print("enter the door ");
	}
}
