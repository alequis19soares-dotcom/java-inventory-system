//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Criando a lista (O estoque)
        ArrayList<Product> inventory = new ArrayList<>();

        // 2. Criando produtos (Instanciando)
        Product p1 = new Product("Smartphone", 1500.0, 10);
        Product p2 = new Product("Laptop", 3500.0, 5);

        // 3. Adicionando ao estoque
        inventory.add(p1);
        inventory.add(p2);

        // Aqui o programa faz uma pausa para o usuário digitar
        Scanner scanner = new Scanner(System.in);

        int option = 1;

        while (option != 0) {
            System.out.println("--- Invetory Menu ---");
            System.out.println("1 - Add Product");
            System.out.println("2 - Search Product");
            System.out.println("0 - Exit and Show List");
            System.out.println("Choose an option: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Dica: Limpa o teclado para o próximo texto

            if (option == 1) {
                System.out.print("Entre product name: ");
                String newName = scanner.nextLine();

                System.out.print("Entre price: ");
                double newPrice = scanner.nextDouble();

                System.out.print("Entre qunatity: ");
                int newQty = scanner.nextInt();

                inventory.add(new Product(newName, newPrice, newQty));

            } else if (option == 2) {
                System.out.print("Enter product name to search: ");
                String searchName = scanner.nextLine();
                boolean found = false;

                for (Product p : inventory) {
                    if (p.name.equalsIgnoreCase(searchName)) {
                        System.out.println("Product Found: " + p.name + " | Price: $" + p.price + " | Qty: " + p.quantity);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Product not found in inventory");
                }
            } // 1. Fecha o else if (Option 2)
        } // 2. Fecha o while (Menu)

        // 4. Listando os produtos (Isso fica FORA do while)
        System.out.println("--- Store Inventory ---");
        for (Product p : inventory) {
            System.out.println("Item: " + p.name + " | Price: $" + p.price + " | Qty: " + p.quantity);
        }

    } // 3. Fecha o método main
} // 4. Fecha a classe Main


///*        // numeros inteiros = 100, 23456, 255, 120, 1, 90989797979094
//        byte => 8 bits => -128 a 127
//        short => 16 bits => -32.768 a 32.767
//        int => 32 bits => -2.147.483.648 a 2.147.483.647
//        long => 64 bits => -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
//        // numeros decimais = 1.2, 3.4, 5.6, 7.8, 9.0
//        // 5.50
//        float => 32 bits => precisao simples
//        double => 64bits => precisao dupla
//
//        String => representar palavras e frases
//        char => representar um unico caractere => a, b, c, d
//        char meuChar = 'a';
//        meuChar = "Alex";
//
//        boolean => true ou false
//
//
//    byte b = 100;
//    short s = 10000;
//    int i = 100000;
//    long l = 100000L;
//    float f = 10.5f;
//    double d = 20.5;
//    char c = 'A';
//    String str = "Alex";
//    boolean bool = true;
//
//        ArrayList<String> nomes = new ArrayList<>();
//        nomes.add("Alex");
//*/
//        Carro meuCarro = new Carro (modelo: "Fusca");
//        Carro meuCarro1 = new Carro(modelo: "Sandero");
//        Carro meuCarro2 = new Carro(modelo: "BMW");
//
//
//        System.out.println("Hello and welcome!");
//
///*        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);}*/
//    }
//}
//class Carro {
//
//    String modelo;
//
//    public Carro (String modelo){
//        this.modelo = modelo;
//    }
//
//    public String
//}