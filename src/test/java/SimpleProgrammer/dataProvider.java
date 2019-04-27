package SimpleProgrammer;

import org.testng.annotations.DataProvider;

import resources.Base;

public class dataProvider extends Base {
	
	@DataProvider(name="productData")
	public static Object[][] getProductData() {
		Object[][] data = new Object[1][2];
		data[0][0] = "M";
		data[0][1] = "2";	
		
		return data;
	}
	
	@DataProvider(name="cartData")
	public static Object[][] getCartData() {
		Object[][] data = new Object[1][3];
		data[0][0] = "Pennsylvania";
		data[0][1] = "Silent Hill";
		data[0][2] = "80323";
		
		return data;
	}

}
