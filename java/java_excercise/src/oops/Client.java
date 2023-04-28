package oops;

public class Client {

	public static void main(String[] args) {
		Product obj =new Product();
		obj.setProdid(111);
		obj.setProdcategory("Soap");
		obj.setProdname("Santoor");
		obj.setProdprice(20);
		System.out.println("Product name "+obj.getProdname());
		// TODO Auto-generated method stub

	}

}
