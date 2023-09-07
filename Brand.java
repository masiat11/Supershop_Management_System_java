import java.lang.*;


public class Brand implements ClothOperations
{
   private Cloth clothes[]=new Cloth[300];


    
    public void addCloth(Cloth cl)
	{
		int flag = 0;
		for(int i=0; i<clothes.length; i++)
		{
			if(clothes[i] == null)
			{
				clothes[i] = cl;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Cloth Added");
		}
		else
		{
			System.out.println("Can Not Add");
		}
	}
	
	
	public void removeCloth(Cloth cl)
	{
		int flag = 0;
		for(int i=0; i<clothes.length; i++)
		{
			if(clothes[i] == cl)
			{
				clothes[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Cloth Removed");
	    }
		else
		{
			System.out.println("Can Not Remove");
		}
	}
	public void showAllClothes()
	{
		System.out.println("*/////////////////////////////////*");
		for(Cloth cl : clothes)
		{
			if(cl != null)
			{
				System.out.println("Cloth Name: "+ cl.getClName());

				System.out.println("Cloth ID: "+ cl.getClId());

				System.out.println();
			}
		}
		System.out.println("*//////////////////////////////////*");
	}
	public Cloth getCloth(String clId)
	{
		Cloth cl = null;
		
		for(int i=0; i<clothes.length; i++)
		{
			if(clothes[i] != null)
			{
				if(clothes[i].getClId().equals(clId))
				{
					cl = clothes[i];
					break;
				}
			}
		}
		if(cl != null)
		{
			System.out.println("Cloth Found");
		}
		else
		{
			System.out.println("Cloth Not Found");
		}
		return cl;
	}
	
}   
	   