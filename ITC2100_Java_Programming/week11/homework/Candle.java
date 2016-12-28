public class Candle {
  private String color;
  private String height;
  private int price;

  public String getColor() {
    return color;
  }

  public String getHeight() {
    return height;
  }

  public int getPrice() {
    return price;
  }

  public void setColor(String candleColor) {
    color = candleColor;
  }

  public void setHeight(String candleHeight) {
    height = candleHeight;
    // $2 per inch for price of the candle;
    price = 2;
  }

  //public void setPrice(int candlePrice) {
  //  price = candlePrice;
  //}
}
