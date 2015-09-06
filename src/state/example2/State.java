package state.example2;

/*假设现在有一个开关，控制三种颜色的切换，blue，green，red，
 * 蓝色下一个绿色，绿色下一个红色，红色下一个是蓝色，也可以倒过来 
 */
public interface State {
	public void last(Context c);
	
	public void next(Context c);
	
	public String getState();
		
}
