
import java.lang.*;


public interface ProductOperations
{
	void insertProduct(Product p);
	void removeProduct(Product p);
	Product getProduct(String pid);
	void showAllProducts();
}