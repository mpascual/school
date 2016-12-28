import javax.swing.*;
import java.awt.*;
import java.awt.event.*; // enable ActionEvent

public class JSammysSeashore extends JFrame implements ActionListener, ItemListener {
  int group1 = 40;
  int group2 = 20;
  int group3 = 7;
  int lesson = 5;
  int totalPrice = 0;
  int inputHours = 0;
  int equipmentChosen;
  boolean lessonsTrue = false;
  String displayMessage;
  JCheckBox jetskiBox = new JCheckBox("Jet Ski $" + group1, false);
  JCheckBox pontoonBoatBox = new JCheckBox("Pontoon Boat $" + group1, false);
  JCheckBox rowboatBox = new JCheckBox("Row Boat $" + group2, false);
  JCheckBox canoeBox = new JCheckBox("Canoe $" + group2, false);
  JCheckBox kayakBox = new JCheckBox("Kayak $" + group2, false);
  JCheckBox beachChairBox = new JCheckBox("Beach Chair $" + group3, false);
  JCheckBox umbrellaBox = new JCheckBox("Umbrella $" + group3, false);
  JCheckBox lessonsBox = new JCheckBox("Additional Lessons $" + lesson, false);

  JLabel optionExplainLabel = new JLabel("How many hours to rent?");
  JLabel optionalEquip = new JLabel("Please Select Which Equipment to Rent");
  JTextField hours = new JTextField(4); // box space for hours
  JTextField totPrice = new JTextField(4); // box space for total price
  JLabel priceLabel = new JLabel("The total price is");
  JLabel chosenOptions = new JLabel(); // set blank JLabel for options chosen
  JButton calculate = new JButton("Calculate");

  public JSammysSeashore() {
    super("Sammy's Seashore Rentals");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());

    ButtonGroup activities = new ButtonGroup(); // separate buttons
    activities.add(jetskiBox);
    activities.add(pontoonBoatBox);
    activities.add(rowboatBox);
    activities.add(canoeBox);
    activities.add(kayakBox);
    activities.add(beachChairBox);
    activities.add(umbrellaBox);

    add(optionExplainLabel);
    add(hours);
    add(calculate);

    add(optionalEquip);
    add(jetskiBox);
    add(pontoonBoatBox);
    add(rowboatBox);
    add(canoeBox);
    add(kayakBox);
    add(beachChairBox);
    add(umbrellaBox);
    add(lessonsBox);

    add(priceLabel);
    add(totPrice);
    totPrice.setText("$" + totalPrice);
    add(chosenOptions);

    hours.addActionListener(this); // check for numeric, if not make hourly $0
    jetskiBox.addItemListener(this); // check for changes to these check boxes 
    pontoonBoatBox.addItemListener(this);
    rowboatBox.addItemListener(this);
    canoeBox.addItemListener(this);
    kayakBox.addItemListener(this);
    beachChairBox.addItemListener(this);
    umbrellaBox.addItemListener(this);
    lessonsBox.addItemListener(this);
    calculate.addActionListener(this);
  }

  // triggered by ActionListener via stdin, p757
  public void actionPerformed(ActionEvent e) {
    Object source = e.getSource(); // determine how this was generated (click or enter)
    if(source == calculate) {
      try { // check if input is an integer, if not catch and handle it
        inputHours = Integer.parseInt(hours.getText());
      }
      catch(Exception error) {
        inputHours = 0;
      }
      totalPrice = inputHours * equipmentChosen; // hours times equipment chosen
      String buildOrder = "Chosen Options: \n" + displayMessage + 
        "\nYou chose to rent for " + inputHours + " hours." + "\n";
      if (lessonsTrue) {
        totalPrice = (inputHours * equipmentChosen) + lesson; 
        buildOrder = "Chosen Options: \n" + displayMessage + 
          "\nYou chose to rent for " + inputHours + " hours. \nLessons " +
          "were also added.";
      }
      totPrice.setText("$" + totalPrice);
      chosenOptions.setText(buildOrder);
    }
  }

  public void itemStateChanged(ItemEvent event) {
    Object source = event.getSource();
    int select = event.getStateChange();
    if(source == jetskiBox || source == pontoonBoatBox) {
      equipmentChosen = group1;
      displayMessage = "Premium services chosen at $" + group1 + "/hour.";
    }
    else if(source == rowboatBox || source == canoeBox || source == kayakBox) {
      equipmentChosen = group2;
      displayMessage = "Rowboat, Canoe or Kayak chosen at $" + group2 + "/hour.";
    }
    else if(source == beachChairBox || source == umbrellaBox) {
      equipmentChosen = group3;
      displayMessage = "Beach chair or Umbrella chosen at $" + group3 + "/hour.";
    }
    if(source == lessonsBox) { lessonsTrue = true; }
  }

  public static void main(String[] args) {
    JSammysSeashore aFrame = new JSammysSeashore();
    aFrame.setSize(800, 200); // width x height
    aFrame.setVisible(true); // display
  }
}
