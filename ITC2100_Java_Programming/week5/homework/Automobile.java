public class Automobile {
  int idNumber;
  String make;
  String model;
  String color;
  int year;
  int mpg;

  // set methods
  public void setidNumber(int id) {
    idNumber = id;
  }

  public void setYear(int yr) {
    year = yr;
  }

  public void setMpg(int mpgallon) {
    mpg = mpgallon;
  }

  public void setMake(String carMake) {
    make = carMake;
  }

  public void setModel(String carModel) {
    model = carModel;
  }

  public void setColor(String carColor) {
    color = carColor;
  }

  // get methods
  public int getIdNumber() {
    if(idNumber > 9999 || idNumber < 0)
      idNumber = 0;
    return idNumber;
  }

  public int getYear() {
    if(year < 2000 || year > 2017)
      year = 0;
    return year;
  }

  public int getMpg() {
    if(mpg < 10 || mpg > 60)
      mpg = 0;
    return mpg;
  }

  public String getMake() {
    return make;
  }

  public String getModel() {
    return model;
  }

  public String getColor() {
    return color;
  }

  public void display() {
    System.out.println("Car is " + make);
  }
}
