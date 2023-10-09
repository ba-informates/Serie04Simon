public class Codes {

    public static void main(String[] args) {

        final char[] fromChar = {'*', '9', 'w'};

        for (char mychar: fromChar) {
            int unicode = (int) mychar;
            System.out.println("Unicode de "+ mychar +" : " + unicode);
        }

        final int[] fromUnicode = {34, 65, 123};

        for (int myint: fromUnicode) {
            char mychar = (char) myint;
            System.out.println("Caractere correspondant a l'Unicode "+myint+" : "+mychar);
        }

    }

}