import java.lang.*;

public class Cloth
{
	private String clname;
	private String clId;
	private String clprice;
	private String clquantity;
	private String clbrand;

	
	public void setClName(String clname)
	{
		this.clname=clname;
	}
	public void setClId(String clId)
	{
		this.clId=clId;
	}

	public void setClPrice(String clprice)
	{
		this.clprice=clprice;
	}
	public void setClQuantity(String clquantity)
	{
		this.clquantity=clquantity;
	}
	public void setClBrand(String clbrand)
	{
		this.clbrand=clbrand;
	}
	
	public String getClName()
	{
		return clname;
	}

	public String getClId()
	{
		return clId;
	}
	
	public String getClPrice()
	{
		return clprice;
	}
	public String getClQuantity()
	{
		return clquantity;
	}
	public String getClBrand()
	{
		return clbrand;
	}
	
}