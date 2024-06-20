public class Main {
    public static void main(String[] args) {
        String comparatorResult = stringComparator("Ciao mi chiamo Mario","Ciao mi chiamo Mario");
        System.out.println(comparatorResult);

    }

    public static String stringComparator(String string1, String string2){
        String[] arrayString1 = string1.split(" ");
        String[] arrayString2 = string2.split(" ");
        StringBuilder stringBuilder = new StringBuilder().append("Le due stringhe sono: ");



        if(arrayString1.length != arrayString2.length){
            return stringBuilder.append("Diverse").toString();
        }

        int tmp = 0;
        for(int i = 0; i < arrayString1.length; i++){
            if(arrayString1[i].equals(arrayString2[i]) ){
                tmp++;
            }
        }

        if(tmp == arrayString1.length){
            return stringBuilder.append("Uguali").toString();
        }
            return stringBuilder.append("Diverse").toString();
    }
}