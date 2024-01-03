package Session21;

public class EcommApplication
{
    public EcommApplication login()
    {
        System.out.println("Login to app");
        return this;
    }

    public EcommApplication login(String un, String pw)
    {
        System.out.println("Login to app" + un + ":" +pw);
        return this;
    }

    public  EcommApplication doSearch(String productName)
    {
        System.out.println("Search the Product :" + productName);
        return this;
    }

    public  EcommApplication doSearch(String productName, int price)
    {
        System.out.println("Search the Product :" + productName + " and price :" + price);
        return this;
    }

    public  EcommApplication doSearch(String productName, int price, String brand)
    {
        System.out.println("Search the Product :" + productName + " and price :" + price + " and brand as : " + brand);
        return this;
    }

    public  EcommApplication addToCart(String productName)
    {
        System.out.println("adding to cart: " + productName);
        return this;
    }

    public EcommApplication doPayment(String cc, int cvv)
    {
        System.out.println("Making Payment using credit card details: " + cc + " and CVV is :" + cvv);
        return this;
    }

    public EcommApplication doPayment(String paypal,  String password)
    {
        System.out.println("Making Payment using Paypal Details: " + paypal + " and password is :" + password);
        return this;
    }

    public  EcommApplication generateOrder()
    {
        System.out.println("Generate order Id :" + 323432);
        return this;
    }

    public EcommApplication logout()
    {
        System.out.println("Logout");
        return this;
    }

}
