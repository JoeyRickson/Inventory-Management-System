package DAO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import entity.Inventory;

public class InventoryDAO {
    private List<Inventory> inventory; // Simulação dos dados do inventário em uma lista

    public InventoryDAO() {
        this.inventory = new ArrayList<>();
        // Adicionando alguns itens fictícios ao inventário para simular o banco de dados
        this.inventory.add(new Inventory("Arroz", "10/04/2024", "10/04/2025", 50, "pacote"));
        this.inventory.add(new Inventory("Feijão", "15/04/2024", "15/04/2025", 30, "pacote"));
    }

    public List<Inventory> listInventory() {
        // Simulando a obtenção dos dados do inventário
        return inventory;
    }

    public boolean insertInventoryItem(Inventory item) {
        // Simulando a inserção de um novo item no inventário
        // Aqui você pode adicionar o item à lista de inventário simulado
        inventory.add(item);
        return true; // Sempre retorna true para simular o sucesso da inserção
    }
    
    public boolean updateInventoryItem(Inventory newItem) {
        for (Inventory item : inventory) {
            if (item.getProductName().equals(newItem.getProductName())) {
                item.setManufactureDate(newItem.getManufactureDate());
                item.setExpiryDate(newItem.getExpiryDate());
                item.setQuantity(newItem.getQuantity());
                item.setType(newItem.getType());
                return true; // Retorna true se o item for encontrado e atualizado
            }
        }
        return false; // Retorna false se o item não for encontrado
    }
    
    public boolean removeInventoryItem(String productName) {
        Iterator<Inventory> iterator = inventory.iterator();
        while (iterator.hasNext()) {
            Inventory item = iterator.next();
            if (item.getProductName().equals(productName)) {
                iterator.remove();
                return true; // Retorna true se o item for encontrado e removido
            }
        }
        return false; // Retorna false se o item não for encontrado
    }
}
