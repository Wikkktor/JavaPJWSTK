public class AssignmentNoEight {
    public static void main(String[] args) {
        Box box1 = new Box("Box1",
                new Product[]{
                        new Product("Carrot", 15),
                        new Product("Apples", 20)
                });
        Box box2 = new Box("Box2",
                new Product[]{
                        new Product("Potato", 10),
                        new Product("Carrot", 12)
                });
        Storage sto = new Storage(
                new Box[]{box1, box2});
        System.out.println("Tot. quantity of product: " +
                sto.totQuant("Carrot"));
    }
}

class Product {
    private String name;
    private int quantity;

    Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }
    public int getQuantity() {
        return quantity;
    }

}
class Box {
    private String id;
    private Product[] prods;

    Box(String id, Product[] prods) {
        this.id = id;
        this.prods = prods;
    }
    public String getId() {
        return id;
    }

    public Product[] getProds() {
        return prods;
    }
}

class Storage {
    private Box[] boxes;

    Storage(Box[] boxes) {
        this.boxes = boxes;
    }

    public Box[] getBoxes() {
        return boxes;
    }
    public int totQuant(String productName) {
        int totalQuantity = 0;
        for (int i = 0; i < boxes.length; i++) {
            Box box = boxes[i];
            Product[] prods = box.getProds();
            for (int j = 0; j < prods.length; j++) {
                Product prod = prods[j];
                if (prod.getName().equals(productName)) {
                    totalQuantity += prod.getQuantity();
                }
            }
        }
        return totalQuantity;
    }}