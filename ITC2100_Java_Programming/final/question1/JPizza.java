import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JPizza extends JFrame implements ItemListener {
  final int BASE_PRICE = 0;
  final int[] prices = {0, 7, 9, 11, 14};
  final int[] toppings = {0, 1, 1, 1, 1};
  final int CHEESE = 0;
  final int TOPPING = 1;
  int totalPrice = BASE_PRICE;

  JCheckBox cheeseBox = new JCheckBox("Cheese $" + CHEESE, false);
  JCheckBox pepperoniBox = new JCheckBox("Pepperoni $" + TOPPING, false);
  JCheckBox baconBox = new JCheckBox("Bacon $" + TOPPING, false);
  JCheckBox chickenBox = new JCheckBox("Chicken $" + TOPPING, false);
  JCheckBox veggiesBox = new JCheckBox("Veggies $" + TOPPING, false);

  JLabel priceLabel = new JLabel("The total price for your custom pizza is");
  JTextField totPrice = new JTextField(4); // width of total price field
  JLabel optionExplainLabel = new JLabel("Check the options you want.");

  JComboBox<String> boxSize = new JComboBox<String>(); // drop down menu

  public JPizza()
  {
    super("Marino's Pizzeria");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close on X
    setLayout(new FlowLayout()); // Flow Layout manager p744

    boxSize.addItem("Choose a size");
    boxSize.addItem("Small");
    boxSize.addItem("Medium");
    boxSize.addItem("Large");
    boxSize.addItem("XLarge");
    add(boxSize);

    add(optionExplainLabel);
    add(cheeseBox);
    add(pepperoniBox);
    add(baconBox);
    add(chickenBox);
    add(veggiesBox);

    add(priceLabel);
    add(totPrice);
    totPrice.setText("$" + totalPrice);

    boxSize.addItemListener(this);
    pepperoniBox.addItemListener(this);
    baconBox.addItemListener(this);
    chickenBox.addItemListener(this);
    veggiesBox.addItemListener(this);
  }

  @Override
  public void itemStateChanged(ItemEvent list) {
    Object source = list.getSource();
    int select = list.getStateChange();

    if(source == boxSize) {
      int selectedIndex = boxSize.getSelectedIndex();
      int boxPrice = prices[selectedIndex];
      totalPrice = boxPrice;
    }
    else if(source == pepperoniBox || source == baconBox
           || source == chickenBox || source == veggiesBox) {
      if(select == ItemEvent.SELECTED) {
        totalPrice += TOPPING;
      }
      else { totalPrice -= TOPPING; }
    }
    totPrice.setText("$" + totalPrice);
  }

  public static void main(String[] args) {
    JPizza aFrame = new JPizza();
    final int WIDTH = 300;
    final int HEIGHT = 300;
    aFrame.setSize(WIDTH, HEIGHT);
    aFrame.setVisible(true);
  }
}


