
public class Direction
{
	private int x;
	private int y;
	
	public void setDirection(Direction dir)
	{
		this.x = dir.x;
		this.y = dir.y;
	}
	
	public Direction getInstance()
	{
		return this;
	}
	
	public void setRandomDir()
	{
		this.x = (int)(Math.random()*3 ) -1;
		this.y = (int)(Math.random()*3 ) -1;
	}
}
