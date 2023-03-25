public class B {

    public static void main(String[] args) {

        String a = "\u001B[31m┌─────────────────┐\n" +
                "\u001B[31m│                 │\n" +
                "\u001B[31m│     ┌────/┐     │\n" +
                "\u001B[31m│     │   / │     │\n" +
                "\u001B[31m│     │  /  │     │\n" +
                "\u001B[31m│     │ /   │     │\n" +
                "\u001B[31m│     └/────┘     │\n" +
                "\u001B[31m│                 │\n" +
                "\u001B[31m│   VERMELHO #B   │\n" +
                "\u001B[31m│                 │\n" +
                "\u001B[31m└─────────────────┘";

        System.out.println(a.substring(0,24));

        String b = "AMARELO#14";

        System.out.println(b.substring(0,b.length()-3));

    }




}
