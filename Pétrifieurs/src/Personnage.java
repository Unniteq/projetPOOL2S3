
public abstract class Personnage extends Case implements Steerable
{


	protected Direction dir;
	protected boolean petrified;
	
	protected Personnage(char s, Position p)
	{
		super(s,p);
	}
	
	public Direction getDirection()
	{
		return dir.getInstance(); // TODO
	}
	
	public void setDirection(Direction dir)
	{
		//TODO
	}
	
	public Case getNextCase()
	{
		return null; //TODO
	}
	
	public void move()
	{
		//TODO
	}
	
	


}
