
import java.util.ArrayList;
import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        System.out.println("Hej välkommen till min checkpoint Tony");
        ArrayList<NyClass> it = new ArrayList<NyClass>();
        Scanner scanner = new Scanner(System.in);
        Boolean isAddMore;

        do {
            NyClass item = new NyClass();
            System.out.print("Please enter a item:");
            String name = scanner.next();
            item.setName(name);

            System.out.print("Please enter the price:");
            int price = scanner.nextInt();
            NyClass.setPrice(price);
            // add item to Shoppinglist.
            it.add(item);

            System.out.println("Do you want to add more items? y/n");
            String yesNo = scanner.next();

            if (yesNo.equals("y")) {
                isAddMore = true;
            }
            else {
                isAddMore = false;

            }
        } while(isAddMore);

    }
}


    }
}