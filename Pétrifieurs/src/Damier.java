
public class Damier
{
	private int largeur;
	private int hauteur;
	
	private Case[][] cases;
	
	
	public Damier(int l , int h)
	{
		largeur = l;
		hauteur = h;
		
		cases = new Case[h][l];
		
	}
	
	public Damier()
	{
		this(30,30);
	}
	
	
	
	public void init()
	{
		double rand;
		int l,h;
		for (h=1; h<hauteur-1;h++)
		{
			for (l=1; l<largeur-1; l++)
			{
				rand =(Math.random()*10);
				
				if( rand > 3 ) 
				{
					cases[h][l]= new Empty(new Position(l,h));
				}
				else if (rand >2)
				{
					cases[h][l]= new Wall(new Position(l,h));
				}
				else if (rand >1)
				{
					cases[h][l]= new Spin(new Position(l,h));
				}
				else if (rand >.66)
				{
					cases[h][l]= new Walker(new Position(l,h));
				}
				else if (rand >.33)
				{
					cases[h][l]= new Stoner(new Position(l,h));
				}
				else 
				{
					cases[h][l]= new Resurrector(new Position(l,h));
				}
			}
		}
		
		for (l=0;l<largeur;l++)
		{
			cases[0][l]= new Wall(new Position(l,h));
		}
		
		for (l=0;l<largeur;l++)
		{
			cases[hauteur-1][l]= new Wall(new Position(l,h));
		}
		
		for (h=0;h<hauteur;h++)
		{
			cases[h][0]= new Wall(new Position(l,h));
		}
		
		for (h=0;h<hauteur;h++)
		{
			cases[h][largeur-1]= new Wall(new Position(l,h));
		}
		
	}
	
	public String toString()
	{
		String res = new String("");
		int l,h;
		
		
		
		for (h=0; h < hauteur;h++)
		{
			
			for (l=0 ; l<largeur;l++)
			{
				res +=  cases[h][l].getSymbole() +" ";
			}
			
			res+= "\n";
			
		}
	
		return res;
	}
	
	public int getHauteur()
	{
		return hauteur;
	}
	
	public int getLargeur()
	{
		return largeur;
	}
	
	public void nextTurn()
	{
		
	}
	
	
}

