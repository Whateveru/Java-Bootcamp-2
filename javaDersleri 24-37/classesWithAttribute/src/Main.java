public class Main {
    public static void main(String[] args) {

        Product product=new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(888);


        ProductManeger productManeger = new ProductManeger();
        productManeger.add(product);


        System.out.println(product.getKod());



    }
}