/**
 * Gadget class represents a generic gadget with model, price, weight, and size attributes.
 * This class provides methods to retrieve and display information about the gadget.
 *
 * @author: Jobayer Rahman Chowdhury
 * @version: 1.0
 */
public class Gadget {
    private String model; // Model of the gadget
    private double price; // Price of the gadget in pounds
    private int weight; // Weight of the gadget in grams
    private String size; // Size of the gadget

    /**
     * Constructs a new Gadget object with the specified attributes.
     *
     * @param model The model of the gadget
     * @param price The price of the gadget in pounds
     * @param weight The weight of the gadget in grams
     * @param size The size of the gadget
     */
    public Gadget(String model, double price, int weight, String size) {
        this.model = model;
        this.price = price;
        this.weight = weight;
        this.size = size;
    }

    /**
     * Gets the model of the gadget.
     *
     * @return The model of the gadget
     */
    public String getModel() {
        return model;
    }

    /**
     * Gets the price of the gadget.
     *
     * @return The price of the gadget in pounds
     */
    public double getPrice() {
        return price;
    }

    /**
     * Gets the weight of the gadget.
     *
     * @return The weight of the gadget in grams
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Gets the size of the gadget.
     *
     * @return The size of the gadget
     */
    public String getSize() {
        return size;
    }

    /**
     * Displays information about the gadget.
     * This method prints the model, price, weight, and size of the gadget.
     */
    public void display() {
        System.out.println("Model: " + model);
        System.out.println("Price: £" + price);
        System.out.println("Weight: " + weight + "g");
        System.out.println("Size: " + size);
    }
}
