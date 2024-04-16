package entity;

import java.sql.SQLException;
import java.util.Scanner;
import DAO.InventoryDAO;

@SuppressWarnings("unused")
public class App {
    public static void main(String[] args) {
        InventoryDAO inventoryDAO = new InventoryDAO();
        Scanner scanner = new Scanner(System.in);

        int option = 0;
        while (option != 5) {
            System.out.println("Selecione uma opção:");
            System.out.println("1. Adicionar novo produto");
            System.out.println("2. Editar produto existente");
            System.out.println("3. Remover produto do estoque");
            System.out.println("4. Visualizar todos os produtos no estoque");
            System.out.println("5. Sair");
            System.out.println("Adicione neste campo o número da opção desejada e pressione Enter:");

            option = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (option) {
                case 1:
                    addNewProduct(scanner, inventoryDAO);
                    break;
                case 2:
                    editProduct(scanner, inventoryDAO);
                    break;
                case 3:
                    removeProduct(scanner, inventoryDAO);
                    break;
                case 4:
                    viewInventory(inventoryDAO);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, selecione novamente.");
                    break;
            }
        }
        scanner.close();
    }

    private static void addNewProduct(Scanner scanner, InventoryDAO inventoryDAO) {
        boolean continueAdding = true;
        while (continueAdding) {
            // Área onde o usuário pode adicionar novos produtos ao inventário
            System.out.println("Adicionar novo produto:");
            System.out.println("Digite o nome do produto:");
            String productName = scanner.nextLine();

            System.out.println("Digite a data de fabricação (DD/MM/AAAA):");
            String manufactureDate = scanner.nextLine();

            System.out.println("Digite a data de validade (DD/MM/AAAA):");
            String expiryDate = scanner.nextLine();

            System.out.println("Digite a quantidade:");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha após o nextInt

            System.out.println("Digite o tipo:");
            String type = scanner.nextLine();

            // Criar um objeto Inventory com as informações fornecidas pelo usuário
            Inventory newItem = new Inventory(productName, manufactureDate, expiryDate, quantity, type);

            // Inserir o novo produto no inventário
            boolean inserted = inventoryDAO.insertInventoryItem(newItem);
            if (inserted) {
                System.out.println("Novo produto adicionado ao inventário com sucesso!");
            } else {
                System.out.println("Falha ao adicionar novo produto ao inventário.");
            }

            // Perguntar ao usuário se deseja adicionar mais produtos
            System.out.println("Deseja adicionar mais produtos? (S/N)");
            String choice = scanner.nextLine();
            continueAdding = choice.equalsIgnoreCase("S");
        }
    }

    private static void editProduct(Scanner scanner, InventoryDAO inventoryDAO) {
        // Implemente a lógica para editar um produto existente
        System.out.println("Funcionalidade de edição de produto ainda não implementada.");
    }

    private static void removeProduct(Scanner scanner, InventoryDAO inventoryDAO) {
        // Implemente a lógica para remover um produto do estoque
        System.out.println("Funcionalidade de remoção de produto ainda não implementada.");
    }

    private static void viewInventory(InventoryDAO inventoryDAO) {
        // Implemente a lógica para visualizar todos os produtos no estoque
        System.out.println("Funcionalidade de visualização do estoque ainda não implementada.");
    }
}
