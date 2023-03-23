public class R {

    public static void main(String[] args) {

        String carta1 = "\u001B[34m+-----------------+\n" +
                                    "|                 |\n" +
                                    "|        |        |\n" +
                                    "|        |        |\n" +
                                    "|        |        |\n" +
                                    "|        |        |\n" +
                                    "|                 |\n" +
                                    "|                 |\n" +
                                    "|       AZUL      |\n" +
                                    "|                 |\n" +
                                    "+-----------------+ \u001B[0m";

        String carta2 = "\u001B[31m+-----------------+\n" +
                                    "|                 |\n" +
                                    "|      ----+      |\n" +
                                    "|          |      |\n" +
                                    "|      +---+      |\n" +
                                    "|      |          |\n" +
                                    "|      +----      |\n" +
                                    "|                 |\n" +
                                    "|     AMARELO     |\n" +
                                    "|                 |\n" +
                                    "+-----------------+ \u001B[0m";

        String carta3 = "\u001B[32m+-----------------+\n" +
                                    "|                 |\n" +
                                    "|      ----+      |\n" +
                                    "|          |      |\n" +
                                    "|      ----|      |\n" +
                                    "|          |      |\n" +
                                    "|      ----+      |\n" +
                                    "|                 |\n" +
                                    "|      VERDE      |\n" +
                                    "|                 |\n" +
                                    "+-----------------+ \u001B[0m";

        String carta4 = "\u001B[33m+-----------------+\n" +
                                    "|                 |\n" +
                                    "|     |     |     |\n" +
                                    "|     |     |     |\n" +
                                    "|     +-----+     |\n" +
                                    "|           |     |\n" +
                                    "|           |     |\n" +
                                    "|                 |\n" +
                                    "|     AMARELO     |\n" +
                                    "|                 |\n" +
                                    "+-----------------+ \u001B[0m";

        String[] todasCartas = {  "\u001B[34m+-----------------+\n" +
                                  "\u001B[34m|                 |\n" +
                                  "\u001B[34m|        |        |\n" +
                                  "\u001B[34m|        |        |\n" +
                                  "\u001B[34m|        |        |\n" +
                                  "\u001B[34m|        |        |\n" +
                                  "\u001B[34m|                 |\n" +
                                  "\u001B[34m|                 |\n" +
                                  "\u001B[34m|      AZUL#1     |\n" +
                                  "\u001B[34m|                 |\n" +
                                  "\u001B[34m+-----------------+",

                                "\u001B[34m+-----------------+\n" +
                                "\u001B[34m|                 |\n" +
                                "\u001B[34m|      ----+      |\n" +
                                "\u001B[34m|          |      |\n" +
                                "\u001B[34m|      +---+      |\n" +
                                "\u001B[34m|      |          |\n" +
                                "\u001B[34m|      +----      |\n" +
                                "\u001B[34m|                 |\n" +
                                "\u001B[34m|      AZUL#2     |\n" +
                                "\u001B[34m|                 |\n" +
                                "\u001B[34m+-----------------+",

                                "\u001B[34m+-----------------+\n" +
                                "\u001B[34m|                 |\n" +
                                "\u001B[34m|      ----+      |\n" +
                                "\u001B[34m|          |      |\n" +
                                "\u001B[34m|      ----|      |\n" +
                                "\u001B[34m|          |      |\n" +
                                "\u001B[34m|      ----+      |\n" +
                                "\u001B[34m|                 |\n" +
                                "\u001B[34m|      AZUL#3     |\n" +
                                "\u001B[34m|                 |\n" +
                                "\u001B[34m+-----------------+",

                                "\u001B[34m+-----------------+\n" +
                                "\u001B[34m|                 |\n" +
                                "\u001B[34m|     |     |     |\n" +
                                "\u001B[34m|     |     |     |\n" +
                                "\u001B[34m|     +-----+     |\n" +
                                "\u001B[34m|           |     |\n" +
                                "\u001B[34m|           |     |\n" +
                                "\u001B[34m|                 |\n" +
                                "\u001B[34m|      AZUL#4     |\n" +
                                "\u001B[34m|                 |\n" +
                                "\u001B[34m+-----------------+",

                                "\u001B[34m+-----------------+\n" +
                                "\u001B[34m|                 |\n" +
                                "\u001B[34m|     +------     |\n" +
                                "\u001B[34m|     |           |\n" +
                                "\u001B[34m|     +-----+     |\n" +
                                "\u001B[34m|           |     |\n" +
                                "\u001B[34m|     ------+     |\n" +
                                "\u001B[34m|                 |\n" +
                                "\u001B[34m|      AZUL#5     |\n" +
                                "\u001B[34m|                 |\n" +
                                "\u001B[34m+-----------------+",

                                "\u001B[34m+-----------------+\n" +
                                "\u001B[34m|                 |\n" +
                                "\u001B[34m|     +------     |\n" +
                                "\u001B[34m|     |           |\n" +
                                "\u001B[34m|     +-----+     |\n" +
                                "\u001B[34m|     |     |     |\n" +
                                "\u001B[34m|     +-----+     |\n" +
                                "\u001B[34m|                 |\n" +
                                "\u001B[34m|      AZUL#6     |\n" +
                                "\u001B[34m|                 |\n" +
                                "\u001B[34m+-----------------+",

                                "\u001B[34m+-----------------+\n" +
                                "\u001B[34m|                 |\n" +
                                "\u001B[34m|     -------+    |\n" +
                                "\u001B[34m|           /     |\n" +
                                "\u001B[34m|          /      |\n" +
                                "\u001B[34m|         /       |\n" +
                                "\u001B[34m|        /        |\n" +
                                "\u001B[34m|                 |\n" +
                                "\u001B[34m|      AZUL#7     |\n" +
                                "\u001B[34m|                 |\n" +
                                "\u001B[34m+-----------------+",

                                "\u001B[34m+-----------------+\n" +
                                "\u001B[34m|                 |\n" +
                                "\u001B[34m|     +------+    |\n" +
                                "\u001B[34m|     |      |    |\n" +
                                "\u001B[34m|     +------+    |\n" +
                                "\u001B[34m|     |      |    |\n" +
                                "\u001B[34m|     +------+    |\n" +
                                "\u001B[34m|                 |\n" +
                                "\u001B[34m|      AZUL#8     |\n" +
                                "\u001B[34m|                 |\n" +
                                "\u001B[34m+-----------------+",

                                "\u001B[34m+-----------------+\n" +
                                "\u001B[34m|                 |\n" +
                                "\u001B[34m|     +------+    |\n" +
                                "\u001B[34m|     |      |    |\n" +
                                "\u001B[34m|     +------+    |\n" +
                                "\u001B[34m|            |    |\n" +
                                "\u001B[34m|            |    |\n" +
                                "\u001B[34m|                 |\n" +
                                "\u001B[34m|      AZUL#9     |\n" +
                                "\u001B[34m|                 |\n" +
                                "\u001B[34m+-----------------+",

                                "\u001B[34m+-----------------+\n" +
                                "\u001B[34m|                 |\n" +
                                "\u001B[34m|     +------+    |\n" +
                                "\u001B[34m|     |      |    |\n" +
                                "\u001B[34m|     +      +    |\n" +
                                "\u001B[34m|     |      |    |\n" +
                                "\u001B[34m|     +------+    |\n" +
                                "\u001B[34m|                 |\n" +
                                "\u001B[34m|      AZUL#9     |\n" +
                                "\u001B[34m|                 |\n" +
                                "\u001B[34m+-----------------+",

                "\u001B[33m+-----------------+\n" +
                        "\u001B[33m|                 |\n" +
                        "\u001B[33m|        |        |\n" +
                        "\u001B[33m|        |        |\n" +
                        "\u001B[33m|        |        |\n" +
                        "\u001B[33m|        |        |\n" +
                        "\u001B[33m|                 |\n" +
                        "\u001B[33m|                 |\n" +
                        "\u001B[33m|   AMARELO #1   |\n" +
                        "\u001B[33m|                 |\n" +
                        "\u001B[33m+-----------------+",

                "\u001B[33m+-----------------+\n" +
                        "\u001B[33m|                 |\n" +
                        "\u001B[33m|      ----+      |\n" +
                        "\u001B[33m|          |      |\n" +
                        "\u001B[33m|      +---+      |\n" +
                        "\u001B[33m|      |          |\n" +
                        "\u001B[33m|      +----      |\n" +
                        "\u001B[33m|                 |\n" +
                        "\u001B[33m|   AMARELO #2   |\n" +
                        "\u001B[33m|                 |\n" +
                        "\u001B[33m+-----------------+",

                "\u001B[33m+-----------------+\n" +
                        "\u001B[33m|                 |\n" +
                        "\u001B[33m|      ----+      |\n" +
                        "\u001B[33m|          |      |\n" +
                        "\u001B[33m|      ----|      |\n" +
                        "\u001B[33m|          |      |\n" +
                        "\u001B[33m|      ----+      |\n" +
                        "\u001B[33m|                 |\n" +
                        "\u001B[33m|   AMARELO #3   |\n" +
                        "\u001B[33m|                 |\n" +
                        "\u001B[33m+-----------------+",

                "\u001B[33m+-----------------+\n" +
                        "\u001B[33m|                 |\n" +
                        "\u001B[33m|     |     |     |\n" +
                        "\u001B[33m|     |     |     |\n" +
                        "\u001B[33m|     +-----+     |\n" +
                        "\u001B[33m|           |     |\n" +
                        "\u001B[33m|           |     |\n" +
                        "\u001B[33m|                 |\n" +
                        "\u001B[33m|   AMARELO #4   |\n" +
                        "\u001B[33m|                 |\n" +
                        "\u001B[33m+-----------------+",

                "\u001B[33m+-----------------+\n" +
                        "\u001B[33m|                 |\n" +
                        "\u001B[33m|     +------     |\n" +
                        "\u001B[33m|     |           |\n" +
                        "\u001B[33m|     +-----+     |\n" +
                        "\u001B[33m|           |     |\n" +
                        "\u001B[33m|     ------+     |\n" +
                        "\u001B[33m|                 |\n" +
                        "\u001B[33m|   AMARELO #5   |\n" +
                        "\u001B[33m|                 |\n" +
                        "\u001B[33m+-----------------+",

                "\u001B[33m+-----------------+\n" +
                        "\u001B[33m|                 |\n" +
                        "\u001B[33m|     +------     |\n" +
                        "\u001B[33m|     |           |\n" +
                        "\u001B[33m|     +-----+     |\n" +
                        "\u001B[33m|     |     |     |\n" +
                        "\u001B[33m|     +-----+     |\n" +
                        "\u001B[33m|                 |\n" +
                        "\u001B[33m|   AMARELO #6   |\n" +
                        "\u001B[33m|                 |\n" +
                        "\u001B[33m+-----------------+",

                "\u001B[33m+-----------------+\n" +
                        "\u001B[33m|                 |\n" +
                        "\u001B[33m|     -------+    |\n" +
                        "\u001B[33m|           /     |\n" +
                        "\u001B[33m|          /      |\n" +
                        "\u001B[33m|         /       |\n" +
                        "\u001B[33m|        /        |\n" +
                        "\u001B[33m|                 |\n" +
                        "\u001B[33m|   AMARELO #7   |\n" +
                        "\u001B[33m|                 |\n" +
                        "\u001B[33m+-----------------+",

                "\u001B[33m+-----------------+\n" +
                        "\u001B[33m|                 |\n" +
                        "\u001B[33m|     +------+    |\n" +
                        "\u001B[33m|     |      |    |\n" +
                        "\u001B[33m|     +------+    |\n" +
                        "\u001B[33m|     |      |    |\n" +
                        "\u001B[33m|     +------+    |\n" +
                        "\u001B[33m|                 |\n" +
                        "\u001B[33m|   AMARELO #8   |\n" +
                        "\u001B[33m|                 |\n" +
                        "\u001B[33m+-----------------+",

                "\u001B[33m+-----------------+\n" +
                        "\u001B[33m|                 |\n" +
                        "\u001B[33m|     +------+    |\n" +
                        "\u001B[33m|     |      |    |\n" +
                        "\u001B[33m|     +------+    |\n" +
                        "\u001B[33m|            |    |\n" +
                        "\u001B[33m|            |    |\n" +
                        "\u001B[33m|                 |\n" +
                        "\u001B[33m|   AMARELO #9   |\n" +
                        "\u001B[33m|                 |\n" +
                        "\u001B[33m+-----------------+",

                "\u001B[33m+-----------------+\n" +
                        "\u001B[33m|                 |\n" +
                        "\u001B[33m|     +------+    |\n" +
                        "\u001B[33m|     |      |    |\n" +
                        "\u001B[33m|     +      +    |\n" +
                        "\u001B[33m|     |      |    |\n" +
                        "\u001B[33m|     +------+    |\n" +
                        "\u001B[33m|                 |\n" +
                        "\u001B[33m|   AMARELO #9   |\n" +
                        "\u001B[33m|                 |\n" +
                        "\u001B[33m+-----------------+"






        };

        String message5 = "\u001B[34m+-----------------+\n" +
                          "\u001B[34m|                 |\n" +
                          "\u001B[34m|        |        |\n" +
                          "\u001B[34m|        |        |\n" +
                          "\u001B[34m|        |        |\n" +
                          "\u001B[34m|        |        |\n" +
                          "\u001B[34m|                 |\n" +
                          "\u001B[34m|                 |\n" +
                          "\u001B[34m|      AZUL#1     |\n" +
                          "\u001B[34m|                 |\n" +
                          "\u001B[34m+-----------------+";

        String message6 = "\u001B[31m+-----------------+\n" +
                          "\u001B[31m|                 |\n" +
                          "\u001B[31m|      ----+      |\n" +
                          "\u001B[31m|          |      |\n" +
                          "\u001B[31m|      +---+      |\n" +
                          "\u001B[31m|      |          |\n" +
                          "\u001B[31m|      +----      |\n" +
                          "\u001B[31m|                 |\n" +
                          "\u001B[31m|   AMARELO 2     |\n" +
                          "\u001B[31m|                 |\n" +
                          "\u001B[31m+-----------------+";

        String message7 = "\u001B[32m+-----------------+\n" +
                          "\u001B[32m|                 |\n" +
                          "\u001B[32m|      ----+      |\n" +
                          "\u001B[32m|          |      |\n" +
                          "\u001B[32m|      ----|      |\n" +
                          "\u001B[32m|          |      |\n" +
                          "\u001B[32m|      ----+      |\n" +
                          "\u001B[32m|                 |\n" +
                          "\u001B[32m|     VERDE#3     |\n" +
                          "\u001B[32m|                 |\n" +
                          "\u001B[32m+-----------------+";

        String message8 = "\u001B[33m+-----------------+\n" +
                          "\u001B[33m|                 |\n" +
                          "\u001B[33m|     |     |     |\n" +
                          "\u001B[33m|     |     |     |\n" +
                          "\u001B[33m|     +-----+     |\n" +
                          "\u001B[33m|           |     |\n" +
                          "\u001B[33m|           |     |\n" +
                          "\u001B[33m|                 |\n" +
                          "\u001B[33m|    AMARELO#4    |\n" +
                          "\u001B[33m|                 |\n" +
                          "\u001B[33m+-----------------+";

        String formatarHorizontal = "";
        int comecosubString = 0;
        int finalsubString = 24;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < todasCartas.length; j++) {

                formatarHorizontal += todasCartas[j].substring(comecosubString,finalsubString) + " ";

            }

            comecosubString += 25;
            finalsubString += 25;
            System.out.println(formatarHorizontal);

        }

//        System.out.println(message5.substring(0,24) + message5.substring(24, 43) +  message5.substring(43, 62) +  message5.substring(62,86));
        System.out.println(message5.substring(0, 24) + " " + message6.substring(0, 24) + " " + message7.substring(0, 24) + " " + message8.substring(0, 24));
        System.out.println(message5.substring(25, 49) + " " + message6.substring(25, 49) + " " + message7.substring(25, 49) + " " + message8.substring(25, 49));
        System.out.println(message5.substring(50, 74) + " " + message6.substring(50, 74) + " " + message7.substring(50, 74) + " " + message8.substring(50, 74));
        System.out.println(message5.substring(75, 99) + " " + message6.substring(75, 99) + " " + message7.substring(75, 99) + " " + message8.substring(75, 99));
        System.out.println(message5.substring(100, 124) + " " + message6.substring(100, 124) + " " + message7.substring(100, 124) + " " + message8.substring(100, 124));
        System.out.println(message5.substring(125, 149) + " " + message6.substring(125, 149) + " " + message7.substring(125, 149) + " " + message8.substring(125, 149));
        System.out.println(message5.substring(150, 174) + " " + message6.substring(150, 174) + " " + message7.substring(150, 174) + " " + message8.substring(150, 174));
        System.out.println(message5.substring(175, 199) + " " + message6.substring(175, 199) + " " + message7.substring(175, 199) + " " + message8.substring(175, 199));
        System.out.println(message5.substring(200, 224) + " " + message6.substring(200, 224) + " " + message7.substring(200, 224) + " " + message8.substring(200, 224));
        System.out.println(message5.substring(225, 249) + " " + message6.substring(225, 249) + " " + message7.substring(225, 249) + " " + message8.substring(225, 249));
        System.out.println(message5.substring(250, 274) + " " + message6.substring(250, 274) + " " + message7.substring(250, 274) + " " + message8.substring(250, 274));
        System.out.println("\u001B[0m         1         " + "          2         " + "          3         " + "          4         ");
        System.out.println("Escolha a carta a ser jogada");

//        System.out.println(message2);
//        System.out.println(message3);
//        System.out.println(message4);


    }

}
