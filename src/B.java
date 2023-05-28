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

        String b = "\u001B[31m┌─────────────────┐\n" +
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

        String c = "\u001B[31m┌─────────────────┐\n" +
                "\u001B[31m│                 │\n" +
                "\u001B[31m│                 │\n" +
                "\u001B[31m│    ──────>      │\n" +
                "\u001B[31m│                 │\n" +
                "\u001B[31m│     <──────     │\n" +
                "\u001B[31m│                 │\n" +
                "\u001B[31m│                 │\n" +
                "\u001B[31m│  VERMELHO #RR   │\n" +
                "\u001B[31m│                 │\n" +
                "\u001B[31m└─────────────────┘";

        String d = "\u001B[32m┌─────────────────┐\n" +
                "\u001B[32m│                 │\n" +
                "\u001B[32m│     │     │     │\n" +
                "\u001B[32m│     │     │     │\n" +
                "\u001B[32m│     └─────┤     │\n" +
                "\u001B[32m│           │     │\n" +
                "\u001B[32m│           │     │\n" +
                "\u001B[32m│                 │\n" +
                "\u001B[32m│     VERDE #4    │\n" +
                "\u001B[32m│                 │\n" +
                "\u001B[32m└─────────────────┘";

//        String z = a.substring(0,24) + " " + b.substring(0,24);
//        String q = a.substring(25,24) + " " + b.substring(0,24);

        int n1 = 0;
        int n2 = 24;
        for (int i = 0; i < 11; i++) {
            System.out.println(a.substring(n1, n2) + " " +b.substring(n1, n2) + " " +c.substring(n1, n2) + " " +d.substring(n1, n2));
            n1 = n1 + 25;
            n2 = n2 + 25;
        }





       // System.out.println(z);


        //String b = "AMARELO#14";

        //System.out.println(b.substring(0,b.length()-3));

    }




}
