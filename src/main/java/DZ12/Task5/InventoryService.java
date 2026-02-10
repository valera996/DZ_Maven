package DZ12.Task5;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InventoryService {
    private boolean isInventoryOpen;

    public InventoryService(boolean isInventoryOpen){
        this.isInventoryOpen = isInventoryOpen;
    }
    public void setInventoryOpen(boolean newStatus){
        this.isInventoryOpen = newStatus;
    }

    private Map<String, List<Product>> products = new HashMap<>();

    public Map<String, List<Product>> getAll(){
        return Map.copyOf(products);
    }
    //Метод для добавления товара на склад.
    // Если флаг isInventoryOpen равен false, операция добавления не должна выполняться.
    public void addProduct(String category,Product product){
        if(isInventoryOpen) {
            if (products.containsKey(category)) {
                products.get(category).add(product);
            } else {
                products.put(category, new LinkedList<Product>(List.of(product)));
            }
        }else {throw new OutOfStockException("Сервис сейчас недоступен");}
    }


    //Метод для получения товара по категории.
    // Если в указанной категории нет товаров, должно выбрасываться исключение OutOfStockException.
    public List<Product> getProductByCategory(String category){
        if(isInventoryOpen) {
        if(products.containsKey(category)) {
            return products.entrySet().stream()
                    .filter(n -> n.getKey().equals(category))
                    .flatMap(n -> n.getValue().stream())
                    .collect(Collectors.toList());
         } else{throw new OutOfStockException("Ошибка, такой категории нет");}
        } else {throw new OutOfStockException("Сервис сейчас недоступен");}
    }

    //Фильтрация товаров по цене
    public List<Product> filterProductByPrice(int price){
        if(isInventoryOpen) {
            return products.values().stream()
                    .flatMap(n -> n.stream())
                    .filter(n -> n.getPrice() == price)
                    .collect(Collectors.toList());
        }else {throw new OutOfStockException("Сервис сейчас недоступен");}
    }





}
