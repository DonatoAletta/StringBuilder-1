public class Main {
    public static void main(String[] args) {
        String comparatorResult = stringComparator("Ciao mi chiamo Mario","Ciao mi chiamo Mario");
        System.out.println(comparatorResult);

    }

    public static String stringComparator(String string1, String string2){

        StringBuilder stringBuilder = new StringBuilder().append("Le due stringhe sono: ");

        if(string1.equals(string2)){
            return stringBuilder.append("Uguali").toString();
        }
        return stringBuilder.append("Diverse").toString();
    }
}