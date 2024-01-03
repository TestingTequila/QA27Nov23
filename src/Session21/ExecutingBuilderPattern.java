package Session21;

public class ExecutingBuilderPattern
{
    public static void main(String[] args) {
        EcommApplication ec = new EcommApplication();
        ec.login("Jason", "test@1234")
                .doSearch("MacBook")
                .doPayment("jason.roger", "test@4321")
                .generateOrder();

        EcommApplication ec1 = new EcommApplication();
        ec1.login("Kerrie", "test@3454")
                .doSearch("Iphone15", 6557556)
                .addToCart("Iphone15")
                .doPayment("kerrie.wright", "test@3334")
                .generateOrder().logout();

        EcommApplication ec2 = new EcommApplication();
        ec2.doSearch("Macbook", 43534534, "Apple").logout();

        EcommApplication ec3 = new EcommApplication();
        ec3.doSearch("Macbook", 43534534, "Apple").logout().login().doSearch("Samsung S20").addToCart("Samsung S20").logout();

        EcommApplication ec4 = new EcommApplication();
        ec4.doSearch("Macbook", 43534534, "Apple")
                .logout()
                .login()
                .doSearch("Samsung S20")
                .addToCart("Samsung S20")
                .logout().
                login()
                .doPayment("Bill", 546546)
                .generateOrder()
                .logout();

    }
}
