package memento.game.state;

public class Client {
private static Originator ori = new Originator();
    
    private static Caretaker taker = new Caretaker();
        
        public static void main(String[] args) {
        	State state = new State();
        	state.setState("不爱打扮，做事拖拖拉拉，十足马大哈");
        //amigo当前的状态
        ori.setState(state);
        System.out.println("amigo当前情况: " + ori.getState().getState());
        //保存amigo当前的状态
        taker.saveMemento(ori.createMemento());
        
        //mother要对amigo进行改造
        ori.getState().setState("穿着时髦,做事精练");
        
        System.out.println("amigo当前情况: " + ori.getState().getState());
        //mother发现改造后产生了很多副作用,于是反悔了,要恢复女儿以前的样子
                ori.restoreMemento(taker.retrieveMemento());
                
        //amigo被打回原型,^_^
                System.out.println("amigo当前情况: " + ori.getState().getState());
    }
}
