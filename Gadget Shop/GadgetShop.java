import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class GadgetShop extends JFrame {
    private ArrayList<Gadget> gadgets;
    private JTextField modelField, priceField, weightField, sizeField, creditField, memoryField,
    phoneNumberField, durationField, downloadSizeField, displayNumberField;
    private Border originalBorder;

    public GadgetShop() {
        gadgets = new ArrayList<>();

        // Initialize GUI components
        modelField = new JTextField(20);
        modelField.setBorder(BorderFactory.createLineBorder(new Color(144, 238, 144))); // Light green border color
        modelField.addFocusListener(new FocusListener() {
                @Override
                public void focusGained(FocusEvent e) {
                    modelField.setBorder(BorderFactory.createLineBorder(new Color(144, 238, 144)));
                }

                @Override
                public void focusLost(FocusEvent e) {
                    modelField.setBorder(UIManager.getBorder("TextField.border"));
                }
            });

        priceField = new JTextField(20);
        priceField.addFocusListener(new FocusListener() {
                @Override
                public void focusGained(FocusEvent e) {
                    priceField.setBorder(BorderFactory.createLineBorder(new Color(144, 238, 144)));
                }

                @Override
                public void focusLost(FocusEvent e) {
                    priceField.setBorder(UIManager.getBorder("TextField.border"));
                }
            });

        weightField = new JTextField(20);
        weightField.addFocusListener(new FocusListener() {
                @Override
                public void focusGained(FocusEvent e) {
                    weightField.setBorder(BorderFactory.createLineBorder(new Color(144, 238, 144)));
                }

                @Override
                public void focusLost(FocusEvent e) {
                    weightField.setBorder(UIManager.getBorder("TextField.border"));
                }
            });

        sizeField = new JTextField(20);
        sizeField.addFocusListener(new FocusListener() {
                @Override
                public void focusGained(FocusEvent e) {
                    sizeField.setBorder(BorderFactory.createLineBorder(new Color(144, 238, 144)));
                }

                @Override
                public void focusLost(FocusEvent e) {
                    sizeField.setBorder(UIManager.getBorder("TextField.border"));
                }
            });

        creditField = new JTextField(20);
        creditField.addFocusListener(new FocusListener() {
                @Override
                public void focusGained(FocusEvent e) {
                    creditField.setBorder(BorderFactory.createLineBorder(new Color(144, 238, 144)));
                }

                @Override
                public void focusLost(FocusEvent e) {
                    creditField.setBorder(UIManager.getBorder("TextField.border"));
                }
            });

        memoryField = new JTextField(20);
        memoryField.addFocusListener(new FocusListener() {
                @Override
                public void focusGained(FocusEvent e) {
                    memoryField.setBorder(BorderFactory.createLineBorder(new Color(144, 238, 144)));
                }

                @Override
                public void focusLost(FocusEvent e) {
                    memoryField.setBorder(UIManager.getBorder("TextField.border"));
                }
            });

        phoneNumberField = new JTextField(20);
        phoneNumberField.addFocusListener(new FocusListener() {
                @Override
                public void focusGained(FocusEvent e) {
                    phoneNumberField.setBorder(BorderFactory.createLineBorder(new Color(144, 238, 144)));
                }

                @Override
                public void focusLost(FocusEvent e) {
                    phoneNumberField.setBorder(UIManager.getBorder("TextField.border"));
                }
            });

        durationField = new JTextField(20);
        durationField.addFocusListener(new FocusListener() {
                @Override
                public void focusGained(FocusEvent e) {
                    durationField.setBorder(BorderFactory.createLineBorder(new Color(144, 238, 144)));
                }

                @Override
                public void focusLost(FocusEvent e) {
                    durationField.setBorder(UIManager.getBorder("TextField.border"));
                }
            });

        downloadSizeField = new JTextField(20);
        downloadSizeField.addFocusListener(new FocusListener() {
                @Override
                public void focusGained(FocusEvent e) {
                    downloadSizeField.setBorder(BorderFactory.createLineBorder(new Color(144, 238, 144)));
                }

                @Override
                public void focusLost(FocusEvent e) {
                    downloadSizeField.setBorder(UIManager.getBorder("TextField.border"));
                }
            });

        displayNumberField = new JTextField(20);
        displayNumberField.addFocusListener(new FocusListener() {
                @Override
                public void focusGained(FocusEvent e) {
                    displayNumberField.setBorder(BorderFactory.createLineBorder(new Color(144, 238, 144)));
                }

                @Override
                public void focusLost(FocusEvent e) {
                    displayNumberField.setBorder(UIManager.getBorder("TextField.border"));
                }
            });

        // Set the original border color

        // Other text fields focus listeners...
        
        JButton addMobileButton = new JButton("Add Mobile");
        addMobileButton.setBackground(new Color(60, 179, 113)); 
        addMobileButton.setForeground(Color.WHITE); 
        addMobileButton.setFont(new Font("Arial", Font.BOLD, 15)); 

        JButton addMP3Button = new JButton("Add MP3");
        addMP3Button.setBackground(new Color(30, 144, 255)); 
        addMP3Button.setForeground(Color.WHITE); 
        addMP3Button.setFont(new Font("Arial", Font.BOLD, 15));

        JButton clearButton = new JButton("Clear");
        clearButton.setBackground(new Color(153, 102, 255)); 
        clearButton.setForeground(Color.WHITE); 
        clearButton.setFont(new Font("Arial", Font.BOLD, 15)); 

        JButton displayAllButton = new JButton("Display All");
        displayAllButton.setBackground(new Color(153, 102, 255)); 
        displayAllButton.setForeground(Color.WHITE); 
        displayAllButton.setFont(new Font("Arial", Font.BOLD, 15));

        JButton makeACallButton = new JButton("Make A Call");
        makeACallButton.setBackground(new Color(60, 179, 113)); 
        makeACallButton.setForeground(Color.WHITE); 
        makeACallButton.setFont(new Font("Arial", Font.BOLD, 15)); 

        JButton downloadMusicButton = new JButton("Download Music");
        downloadMusicButton.setBackground(new Color(30, 144, 255)); 
        downloadMusicButton.setForeground(Color.WHITE); 
        downloadMusicButton.setFont(new Font("Arial", Font.BOLD, 15)); 
        

        // Set layout
        JPanel centerPanel = new JPanel(new GridLayout(15, 2));
        centerPanel.setBackground(new Color(177, 172, 242)); // Set background color 0

        Font labelFont = new Font("Arial", Font.BOLD, 16);
        // Create a color for the JLabels
        Color labelColor = new Color(0); 

        // Add JLabels with custom font and color
        JLabel modelLabel = new JLabel("Model: ");
        modelLabel.setFont(labelFont);
        modelLabel.setForeground(labelColor);
        centerPanel.add(modelLabel);
        centerPanel.add(modelField);

        JLabel priceLabel = new JLabel("Price: ");
        priceLabel.setFont(labelFont);
        priceLabel.setForeground(labelColor);
        centerPanel.add(priceLabel);
        centerPanel.add(priceField);

        JLabel weightLabel = new JLabel("Weight: ");
        weightLabel.setFont(labelFont);
        weightLabel.setForeground(labelColor);
        centerPanel.add(weightLabel);
        centerPanel.add(weightField);

        JLabel sizeLabel = new JLabel("Size: ");
        sizeLabel.setFont(labelFont);
        sizeLabel.setForeground(labelColor);
        centerPanel.add(sizeLabel);
        centerPanel.add(sizeField);

        JLabel creditLabel = new JLabel("Initial Credit: ");
        creditLabel.setFont(labelFont);
        creditLabel.setForeground(labelColor);
        centerPanel.add(creditLabel);
        centerPanel.add(creditField);

        JLabel memoryLabel = new JLabel("Initial Available Memory: ");
        memoryLabel.setFont(labelFont);
        memoryLabel.setForeground(labelColor);
        centerPanel.add(memoryLabel);
        centerPanel.add(memoryField);

        centerPanel.add(addMobileButton);
        centerPanel.add(addMP3Button);
        centerPanel.add(clearButton);
        centerPanel.add(displayAllButton);

        // Add more JLabels with the same font and color
        JLabel phoneNumberLabel = new JLabel("Phone Number: ");
        phoneNumberLabel.setFont(labelFont);
        phoneNumberLabel.setForeground(labelColor);
        centerPanel.add(phoneNumberLabel);
        centerPanel.add(phoneNumberField);

        JLabel durationLabel = new JLabel("Duration: ");
        durationLabel.setFont(labelFont);
        durationLabel.setForeground(labelColor);
        centerPanel.add(durationLabel);
        centerPanel.add(durationField);

        JLabel downloadSizeLabel = new JLabel("Download Size: ");
        downloadSizeLabel.setFont(labelFont);
        downloadSizeLabel.setForeground(labelColor);
        centerPanel.add(downloadSizeLabel);
        centerPanel.add(downloadSizeField);

        JLabel displayNumberLabel = new JLabel("Display Number: ");
        displayNumberLabel.setFont(labelFont);
        displayNumberLabel.setForeground(labelColor);
        centerPanel.add(displayNumberLabel);
        centerPanel.add(displayNumberField);

        centerPanel.add(makeACallButton);
        centerPanel.add(downloadMusicButton);

        add(centerPanel, BorderLayout.CENTER);

        // Create north panel for the image template
        JPanel northPanel = new JPanel();
        northPanel.setBackground(new Color(177, 172, 242)); // Set background color to violet

        // Load the image and resize it
        ImageIcon icon = resizeImage("z.png", 600, 150); // Adjust the path to your image

        // Create a JLabel to display the resized image
        JLabel imageLabel = new JLabel(icon);

        // Add the image label to the north panel
        northPanel.add(imageLabel);

        // Add north panel to the frame
        add(northPanel, BorderLayout.NORTH);

        // Add action listeners
        addMobileButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    addMobile();
                }
            });

        addMP3Button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    addMP3();
                }
            });

        clearButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    clearFields();
                }
            });

        displayAllButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    displayAll();
                }
            });

        makeACallButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    makeACall();
                }
            });

        downloadMusicButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    downloadMusic();
                }
            });

        // Set frame properties
        setTitle("Gadget Shop");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        // Set background color
        getContentPane().setBackground(new Color(0));
    }

    private ImageIcon resizeImage(String filename, int width, int height) {
        ImageIcon imageIcon = new ImageIcon(filename);
        Image image = imageIcon.getImage(); // transform it
        Image newImg = image.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        return new ImageIcon(newImg);  // transform it back
    }

    private void addMobile() {
        try {
            // Get values from text fields and create Mobile object
            String model = modelField.getText();
            double price = Double.parseDouble(priceField.getText());
            int weight = Integer.parseInt(weightField.getText());
            String size = sizeField.getText();
            int credit = Integer.parseInt(creditField.getText());

            Mobile mobile = new Mobile(model, price, weight, size, credit);
            gadgets.add(mobile);


            // Display success message
            JOptionPane.showMessageDialog(this, "Mobile added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter valid input.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        clearFields();
    }

    private void addMP3() {
        try {
            // Get values from text fields and create MP3 object
            String model = modelField.getText();
            double price = Double.parseDouble(priceField.getText());
            int weight = Integer.parseInt(weightField.getText());
            String size = sizeField.getText();
            int memory = Integer.parseInt(memoryField.getText());

            MP3 mp3 = new MP3(model, price, weight, size, memory);
            gadgets.add(mp3);


            // Display success message
            JOptionPane.showMessageDialog(this, "MP3 added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter valid input", "Error", JOptionPane.ERROR_MESSAGE);
        }
        clearFields();
    }

    private void clearFields() {
        // Clear all text fields
        modelField.setText("");
        priceField.setText("");
        weightField.setText("");
        sizeField.setText("");
        creditField.setText("");
        memoryField.setText("");
        phoneNumberField.setText("");
        durationField.setText("");
        downloadSizeField.setText("");
        displayNumberField.setText("");

        // Display success message
        JOptionPane.showMessageDialog(this, "Fields cleared successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
    }

    private void displayAll() {
        // Display details of all gadgets
        if (gadgets.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No gadgets to display.", "Information", JOptionPane.INFORMATION_MESSAGE);
        } else {
            for (int i = 0; i < gadgets.size(); i++) {
                System.out.println("Index: " + i);
                Gadget gadget = gadgets.get(i);
                if (gadget instanceof MP3) {
                    System.out.println("Type: MP3");
                } else if (gadget instanceof Mobile) {
                    System.out.println("Type: Mobile");
                }
                gadget.display();
                System.out.println("------------------------");
            }
        }
    }

    private void makeACall() {
        int displayNumber = getDisplayNumber();
        if (displayNumber != -1) {
            try {
                // Get values from text fields
                String phoneNumber = phoneNumberField.getText();
                int duration = Integer.parseInt(durationField.getText());

                Gadget gadget = gadgets.get(displayNumber);
                if (gadget instanceof Mobile) {
                    Mobile mobile = (Mobile) gadget;
                    mobile.makePhoneCall(phoneNumber, duration);
                }


                // Display success message
                JOptionPane.showMessageDialog(this, "Phone call made successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid input.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        clearFields();
    }

    private void downloadMusic() {
        int displayNumber = getDisplayNumber();
        if (displayNumber != -1) {
            try {
                // Get values from text fields
                int downloadSize = Integer.parseInt(downloadSizeField.getText());

                Gadget gadget = gadgets.get(displayNumber);
                if (gadget instanceof MP3) {
                    MP3 mp3 = (MP3) gadget;
                    mp3.downloadMusic(downloadSize);
                }

                // Display success message
                JOptionPane.showMessageDialog(this, "Music downloaded successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid input.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        clearFields();
    }

    private int getDisplayNumber() {
        // Get the display number from text field
        try {
            int displayNumber = Integer.parseInt(displayNumberField.getText());
            if (displayNumber >= 0 && displayNumber < gadgets.size()) {
                return displayNumber;
            } else {
                JOptionPane.showMessageDialog(this, "Invalid display number. Please enter a valid index." , "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid input.", "Error", JOptionPane.ERROR_MESSAGE );
        }
        return -1;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    new GadgetShop();
                }
            });
    }
}

