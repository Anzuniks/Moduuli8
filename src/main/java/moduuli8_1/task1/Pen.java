package moduuli8_1.task1;

/**
 * Moduuli 8.1 - Tehtävä 1
 *
 * Tämä on pääluokka tehtävälle 8.1.1
 */
public class Pen {

    public enum Color {
            RED("red"), GREEN("green"), BLUE("blue");
            private final String color;
            Color(String color) {this.color = color; }
            @Override public String toString() { return color; }
        }

            private Color currentColor;
            private boolean isCapped;

            public Pen() {
                this.currentColor = Color.RED; // Oletusväri
                this.isCapped = true; // Kynä on oletuksena kiinni
            }

            public Pen(Color color) {
                this.currentColor = color;
                this.isCapped = true;
            }

            public void capOff () {
                this.isCapped = false;
            }

            public void capOn () {
                this.isCapped = true;
            }

        public String draw () {
        if (isCapped) {
            return "";
        } else {
            return "Drawing  " + currentColor;
        }
    }

            public void changeColor (Color newColor){
                if (!isCapped) {
                    return;
                }
                this.currentColor = newColor;
            }
        }

