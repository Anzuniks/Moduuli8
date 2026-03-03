package moduuli8_2.Task2;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import moduuli8_2.task2.ShoppingCart;


/**
 * ShoppingCartTest - Testit ShoppingCart -luokalle
 *
 * Testattavat tilanteet:
 * 1. Tuotteiden lisääminen koriin
 * 2. Tuotteiden poistaminen korista
 * 3. Kokonaishintzan laskeminen
 * 4. Erikoistapaukset (tyhjä kori)
 */


@DisplayName("ShoppingCart - Testit")
public class ShoppingCartTest {

    private ShoppingCart cart;

    @BeforeEach
    public void setUp() {

        cart = new ShoppingCart();

    }

    @Test
    @DisplayName("Tuotteiden lisääminen koriin")
     void testAddItem() {
        cart.addItem("Apple", 1.0);
        assertEquals(1, cart.getItemCount(),
                "Koriin pitäisi lisätä yksi tuote");
    }

    @Test
    @DisplayName("Lisää useita tuotteita koriin")
    void testAddMultipleItems() {
        cart.addItem("Apple", 1.0);
        cart.addItem("Banana", 0.5);
        assertEquals(2, cart.getItemCount(),
                "Koriin pitäisi lisätä kaksi tuotetta");
    }

    @Test
    @DisplayName("Lisää kolme tuotetta koriin")
    void testAddThreeItems() {
        cart.addItem("Apple", 1.0);
        cart.addItem("Banana", 0.5);
        cart.addItem("Orange", 0.75);
        assertEquals(3, cart.getItemCount(),
                "Koriin pitäisi lisätä kolme tuotetta");
    }

        @Test
        @DisplayName("Tuotteiden poistaminen korista")
        void testRemoveItem() {
            cart.addItem("Apple", 1.0);
            cart.addItem("Banana", 0.5);
            cart.removeItem("Apple");
            assertEquals(1, cart.getItemCount(),
                    "Koriin pitäisi jäädä yksi tuote poiston jälkeen");
        }


        @Test
        @DisplayName("Poista monta tuotetta korista")
        void testRemoveMultipleItems() {
            cart.addItem("Apple", 1.0);
            cart.addItem("Banana", 0.5);
            cart.addItem("Orange", 0.75);
            cart.removeItem("Apple");
            cart.removeItem("Banana");
            assertEquals(1, cart.getItemCount(),
                    "Koriin pitäisi jäädä yksi tuote poiston jälkeen");
        }


        @Test
        @DisplayName("Kokonaishinta  laskeminen yhden tuotteen jälkeen")
        void testGetTotalPrice() {
        cart.addItem("Apple", 1.0);
        assertEquals(1.0, cart.getTotalPrice(), 0.001,
                "Kokonaishintzan pitäisi olla 1.0 yhden tuotteen jälkeen");
        }


        @Test
        @DisplayName("Kokonaishinta laskeminen kahden tuotteiden jälkeen")
        void testGetTotalPriceMultipleItems() {
            cart.addItem("Apple", 1.0);
            cart.addItem("Banana", 0.5);
            assertEquals(1.5, cart.getTotalPrice(), 0.001,
                    "Kokonaishintan pitäisi olla 1.5 kahden tuotteen jälkeen");
        }

        @Test
        @DisplayName("Kokonaishinta laskeminen kolmen tuotteiden jälkeen")
        void testGetTotalPriceThreeItems() {
            cart.addItem("Apple", 1.0);
            cart.addItem("Banana", 0.5);
            cart.addItem("Orange", 0.75);
            assertEquals(2.25, cart.getTotalPrice(), 0.001,
                    "Kokonaishintan pitäisi olla 2.25 kolmen tuotteen jälkeen");
        }

        @Test
        @DisplayName("Yhteensä hinnan laskeminen kun poistetaan tuote")
        void testGetTotalPriceAfterRemovingItem() {
        cart.addItem("Apple", 1.0);
        cart.addItem("Banana", 0.5);
        cart.addItem("Orange", 0.75);
            assertEquals(2.25, cart.getTotalPrice(), 0.01,
                    "Alustava yhteensä pitäisi olla 2.25");

            cart.removeItem("Apple");
            assertEquals(1.25, cart.getTotalPrice(), 0.01,
                    "Yhteensä pitäisi olla 1.25 poiston jälkeen");
        }

        @Test
        @DisplayName("Tyhjä kori mis on nolla tuotetta")
        void testEmptyCart() {
        assertEquals(0, cart.getItemCount(),
                "Tyhjä korin pitäisi sisältää nolla tuotetta");
        }

        @Test
        @DisplayName("Poista kaikki tuotteet korista")
        void testRemoveAllItems() {
        cart.addItem("Apple", 1.0);
        cart.addItem("Banana", 0.5);
        cart.removeItem("Apple");
        cart.removeItem("Banana");
        assertEquals(0, cart.getItemCount(),
                "Koriin pitäisi jäädä nolla tuotetta poiston jälkeen");
        assertEquals(0.0, cart.getTotalPrice(), 0.001,
                "Kaikki pitäisi olla 0.0 tyhjän korin jälkeen");

        }
}
