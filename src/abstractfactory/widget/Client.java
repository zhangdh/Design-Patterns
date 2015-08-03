package abstractfactory.widget;

public class Client {
	public static void main(String[] args){
		WidgetFactory wf = new MotifWidgetFactory();
		ScrollBar sb = wf.createScrollBar();
		Windows w = wf.createWindows();
		sb.printScrollbar();
		w.printWindows();
	}
}
