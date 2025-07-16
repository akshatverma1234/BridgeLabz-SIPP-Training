package Workshop.IceCreamFlavour;

public class IcecreamRushManagement {
    public static void iceCreamFlavourSorted(Flavour[] flavours) {
        boolean swapped = false;
        for (int i = 0; i < flavours.length-1; i++) {
            swapped = false;
            for (int j = 0; j < flavours.length-i-1; j++) {
                if (flavours[j].sales > flavours[j + 1].sales) {
                    Flavour temp = flavours[j];
                    flavours[j] = flavours[j + 1];
                    flavours[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped==false) {
                break;
            }
        }
    }

    public static void printFlavours(Flavour[] flavours) {
        for (Flavour flavour : flavours) {
            System.out.println(flavour.name + ": " + flavour.sales);
        }
    }

    public static void main(String[] args) {
        Flavour[] flavours = {
            new Flavour("Vanilla", 30),
            new Flavour("Chocolate", 15),
            new Flavour("Strawberry", 43)
        };
        iceCreamFlavourSorted(flavours);
        printFlavours(flavours);
    }
}
