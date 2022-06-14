package lesson_4.level_6;

public class Stock {
    String companyName;
    int currentPrice;
    int minPrice;
    int maxPrice;

    public Stock(String companyName, int currentPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }

    void updatePrice(int price) {
        this.currentPrice = price;

        if (price < this.minPrice) {
            this.minPrice = price;
        }

        if (price > this.maxPrice) {
            this.maxPrice = price;
        }
    }

    void getPriceInformation() {
        String priceInformation = "Company = " + companyName +
                ", Current Price = " + currentPrice +
                ", Min Price = " + minPrice +
                ", Max Price = " + maxPrice;

        System.out.println(priceInformation);
    }
}
