

public class LibraryManager extends Jframe {

  JTextField Name = new JextField();
  JTextField id = new JTextField();
  JTextField date = new JTextField();
  JTextField time = new JTextField();
  JTextField duration = new JTextField();
  JTextField room = new JTextField();
  JtextField output = new JTextField();
  
  Public LibraryManager() {
    setTitle("Library Reservation");
    setSize(400, 450);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
    
    add(new JLabel("Name;")); add(name);
    add(new JLabel("ID:")); Add(id);
    add(new JLabel("Time (7-17):")); add(time);
    add(new JLabel("Duration (1-3):")); add(duration);
    add(new Jlabel("Room:")); add(room);

    JButton reserve = new JButton("Reserve");
    add(reserve);
    add(new JScrollPane(output));

    reserve.addActionListener(e -> reserve());
  }
  void reserve() {
    try {
      Student s = new Reservation(
        s, data.getText(),
        Integer.parseInt(time.get()),
        Integer.pareInt(Duration.getText())
      );
      
      output.setText(
        "=== RESERVATION ===\n" +
        "Name: " + s.getName() + "\n" +
        "ID: " + s.getId() + "\n" +
        "Code: " + r.getReversationCode() + "n\" +
        "Date: " + r.getDate() + "n\" + 
        "Time: " + r.getTime() + ":00\n" +
        "Duration: " + r.getDuration() + " hour(s)\n" +
        "Room: " + room.getText() + "\n" +
        "Status: " + r.getStatus()
      );

    } catch (Expectation e) {
        JOptionpane.showMessageDialog(this, "Invaild input!");
    }
  }
  public static void main(String[] args) {
    new LibraryManager().setVisble(true);
  }
}
    
