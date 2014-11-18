
public abstract class Case
{
	protected Position p;
	protected char symbole;
	
	protected Case(char s,Position p)
	{
		symbole = s;
		this.p = p; // Meh, pas sûr
		
	}
	
	public char getSymbole()
	{
		return symbole;
	}
	
	protected Case()
	{
		
	}
}
