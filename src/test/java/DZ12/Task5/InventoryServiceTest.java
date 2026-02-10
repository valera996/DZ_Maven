package DZ12.Task5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InventoryServiceTest {

    /**
     Метод для добавления товара на склад.
        Позитивные сценарии:
     1)Добавление товара при отсутсвии добавляемой категории в списке,
      флаг isInventoryOpen true -> ОР в список добавилась и категория и товар
     2)Добавление товара при наличии добавляемой категории в списке,
      флаг isInventoryOpen true -> ОР в список товаров к уже имеющимся добавился товар
        Негативные сценарии:
     1)Добавление товара при флаге isInventoryOpen false -> ОР OutOfStockException

     Метод для получения товара по категории.
        Позитивные сценарии:
     1)Получение товара по категрии имеющейся в в списке,
     флаг isInventoryOpen true -> ОР получен список товаров из соответсвующей категории
        Негативные сценарии:
     1)Получение товара по категрии не имеющейся в списке,
     флаг isInventoryOpen true -> ОР OutOfStockException
     2)Получение товара по категрии имеющейся в в списке,
     флаг isInventoryOpen false -> ОР OutOfStockException

     Фильтрация товаров по цене
        Позитивные сценарии:
     1)Фильтрация товаров по цене при наличии в списке товаров с требуемуей ценой,
      флаг isInventoryOpen true ->
      ОР цены товаров в списке соответсвуют требуемой цене
        Негативный сценарий:
     1)Фильтрация товаров по цене при наличии в списке товаров с требуемуей ценой,
      флаг isInventoryOpen true -> ОР OutOfStockException
         Угловой сценарий:
     1)Фильтрация товаров по цене при отсутствии товаров с требуемуей ценой,
      флаг isInventoryOpen true ->
      ОР возвращается пустой список

     */

    private InventoryService inventoryService;
    @BeforeEach
    public void setUp(){
        inventoryService = new InventoryService(true);
    }


    @DisplayName("Добавление товара при отсутсвии добавляемой категории в списке, флаг isInventoryOpen true")
    @Test
    public void addProductToNotContainedCategory(){
        Product drill = new Product("Электроинструмент","Дрель1",1000);

        inventoryService.addProduct("Электроинструмент",drill);

        assertTrue(inventoryService.getAll().containsKey("Электроинструмент") && inventoryService.getAll().get("Электроинструмент").contains(drill));
    }

    @DisplayName("Добавление товара при наличии добавляемой категории в списке, флаг isInventoryOpen true")
    @Test
    public void addProductToContainedCategory(){
        Product drill = new Product("Электроинструмент","Дрель1",1000);
        Product drill2 = new Product("Электроинструмент","Дрель2",1000);
        inventoryService.addProduct("Электроинструмент",drill);
        inventoryService.addProduct("Электроинструмент",drill2);

        assertTrue(inventoryService.getAll().get("Электроинструмент").contains(drill) && inventoryService.getAll().get("Электроинструмент").contains(drill2));
    }

    @DisplayName("Добавление товара при флаге isInventoryOpen false")
    @Test
    public void addProductWhenIsInventoryOpenFalse(){
        Product drill = new Product("Электроинструмент","Дрель1",1000);
        inventoryService.setInventoryOpen(false);
        assertThrows(OutOfStockException.class,() -> inventoryService.addProduct("Электроинструмент",drill));
    }

    @DisplayName("Получение товара по категрии имеющейся в списке,флаг isInventoryOpen true")
    @Test
    public void getProductByContainedCategory(){
        Product drill = new Product("Электроинструмент","Дрель1",1000);
        inventoryService.addProduct("Электроинструмент",drill);

        assertTrue(inventoryService.getProductByCategory("Электроинструмент").contains(drill));
    }

    @DisplayName("Получение товара по категрии не имеющейся в списке,флаг isInventoryOpen true")
    @Test
    public void getProductByNotContainedCategory(){
        Product drill = new Product("Электроинструмент","Дрель1",1000);
        inventoryService.addProduct("Электроинструмент",drill);

        assertThrows(OutOfStockException.class,() -> inventoryService.getProductByCategory("Бытовая химия"));
    }
    @DisplayName("Получение товара по категрии имеющейся в списке,флаг isInventoryOpen false")
    @Test
    public void getProductByContainedCategoryWhenIsInventoryOpenFalse(){
        Product drill = new Product("Электроинструмент","Дрель1",1000);
        inventoryService.addProduct("Электроинструмент",drill);

        inventoryService.setInventoryOpen(false);
        assertThrows(OutOfStockException.class, () ->inventoryService.getProductByCategory("Электроинструмент"));
    }


    @DisplayName("Фильтрация товаров по цене при наличии в списке товаров с требуемуей ценой, флаг isInventoryOpen true")
    @Test
    public void filterProductByContainedPrice(){
        Product drill = new Product("Электроинструмент","Дрель1",1000);
        Product cup = new Product("Посуда","Кружка",200);
        Product pen = new Product("Канцелярия","Ручка",200);

        inventoryService.addProduct("Электроинструмент",drill);
        inventoryService.addProduct("Посуда",cup);
        inventoryService.addProduct("Канцелярия",pen);

        assertTrue(inventoryService.filterProductByPrice(200).contains(cup)
                && inventoryService.filterProductByPrice(200).contains(cup)
                && !inventoryService.filterProductByPrice(200).contains(drill)
        );

    }
    @DisplayName("Фильтрация товаров по цене при отсутствии товаров с требуемуей ценой, флаг isInventoryOpen true")
    @Test
    public void filterProductByNotContainedPrice(){
        Product drill = new Product("Электроинструмент","Дрель1",1000);
        Product cup = new Product("Посуда","Кружка",200);

        inventoryService.addProduct("Электроинструмент",drill);
        inventoryService.addProduct("Посуда",cup);

        assertTrue(inventoryService.filterProductByPrice(100).isEmpty());

    }
    @DisplayName("Фильтрация товаров по цене при наличии в списке товаров с требуемуей ценой, флаг isInventoryOpen false")
    @Test
    public void filterProductByContainedPriceWhenIsInventoryOpenFalse(){
        Product drill = new Product("Электроинструмент","Дрель1",1000);
        Product cup = new Product("Посуда","Кружка",200);
        Product pen = new Product("Канцелярия","Ручка",200);

        inventoryService.addProduct("Электроинструмент",drill);
        inventoryService.addProduct("Посуда",cup);
        inventoryService.addProduct("Канцелярия",pen);

        inventoryService.setInventoryOpen(false);

        assertThrows(OutOfStockException.class, () -> inventoryService.filterProductByPrice(200));

    }




}
