
public class Position
{
	private int x;
	private int y;
	
	
	public Position(int x, int y)
	{
		this.setPosition(x,y);
	}
	
	public void setPosition(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	public void setPosition(Position p)
	{
		this.x = p.getX();
		this.y = p.getY();
	}
	
	public int getX(){ return x;}
	public int getY(){ return y;}
	
	
}

