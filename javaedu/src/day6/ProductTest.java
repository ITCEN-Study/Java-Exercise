package day6;



class Product {
    String name;
    int balance;
    int price;


    Product() {
        this.name = "듀크인형";
        this.balance = 5;
        this.price = 10000;
    }


    Product(String name, int balance, int price) {
        this.name = name;
        this.balance = balance;
        this.price = price;
    }

    String getName() {
        return name;
    }

    int getBalance() {
        return balance;
    }

    int getPrice() {
        return price;
    }
}


public class ProductTest {
    public static void main(String[] args) {

        Product[] products = new Product[5];


        products[0] = new Product(); // 기본 생성자 호출
        products[1] = new Product("노트북", 2, 1500000);
        products[2] = new Product("무선마우스", 15, 35000);
        products[3] = new Product("기계식키보드", 8, 120000);
        products[4] = new Product("모니터", 4, 320000);


        System.out.println("상품명\t재고량\t가격");
        System.out.println("----------------------------");
        
        for (int i = 0; i < products.length; i++) {
            String name = products[i].getName();
            int balance = products[i].getBalance();
            int price = products[i].getPrice();


            System.out.printf("%s\t%d\t%,d원\n", name, balance, price);
        }
    }
}