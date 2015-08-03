package abstractfactory.widget;

public class MotifWidgetFactory implements WidgetFactory{

	@Override
	public ScrollBar createScrollBar() {
		// TODO Auto-generated method stub
		return new MotifScrollBar();
	}

	@Override
	public Windows createWindows() {
		// TODO Auto-generated method stub
		return new MotifWindows();
	}

}
