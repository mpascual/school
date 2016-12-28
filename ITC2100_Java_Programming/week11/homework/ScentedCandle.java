public class ScentedCandle extends Candle {
  private String scent;
  private String height;
  private int price;

  public String getScent() {
    return scent;
  }

  public void setScent(String newScent) {
    scent = newScent;
  }

  @Override
  public void setHeight(String candleHeight) {
    height = candleHeight;
    price = 3;
  }

  public String getHeight() {
    return height;
  }

  public int getPrice() {
    return price;
  }
}
