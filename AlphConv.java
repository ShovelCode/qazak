import java.util.HashMap;
public class Demo {
public static void main(String[] args ) {
HashMap <String, String> alph = new Map<String, String>();
alph.put("А", "A");
alph.put("а", "a");
alph.put("Ә", "Ä");
alph.put("ә", "ä");
alph.put("Б", "B");
alph.put("б", "b");
alph.put("В", "V");
alph.put("в", "v");
alph.put("Г", "G");
alph.put("г", "v");
alph.put("Ғ", "Ğ");
alph.put("ғ", "ğ");
alph.put("Д", "D");
alph.put("д", "d");
alph.put("Е", "E");
alph.put("е", "e");
alph.put("Ё", "Yo");
alph.put("ё", "yo");
alph.put("Ж", "Zh");
alph.put("ж", "zh");
alph.put("З", "Z");
alph.put("з", "z");
alph.put("И", "I");
alph.put("и", "i");
alph.put("Й", "Y");
alph.put("й", "y");
alph.put("К", "K");
alph.put("к", "k");
alph.put("Қ", "Q");
alph.put("қ", "q");
alph.put("Л", "L");
alph.put("л", "l");
alph.put("М", "M");
alph.put("м", "m");
alph.put("Н", "N");
alph.put("н", "n");
alph.put("Ң", "Ŋ");
alph.put("ң", "ŋ");
alph.put("О", "O");
alph.put("о", "o");
alph.put("Ө", "Ö");
alph.put("ө", "ö");
alph.put("П", "P");
alph.put("п", "p");
alph.put("Р", "R");
alph.put("р", "r");
alph.put("С", "S");
alph.put("с", "s");
alph.put("", "");
alph.put("", ""); 
alph.put("", "");
alph.put("", "");
alph.put("", "");
alph.put("", "");
    
/*
Т T
т t

У U
у u

Ұ U
ұ u

Ү Ü
ү ü

Ф F
ф f

Х H
х h

Һ H
һ h

Ц C
ц c

Ч Ç
ч ç

Ш Ş
ш ş

Щ Şç
щ şç

Ъ "
ъ "

Ы Y
ы y

І İ
і i

Ь '
ь '

Э E
э e

Ю Yu
ю yu

Я Ya
я ya
*/
System.out.println("The Size of alph is : " + alph.size());
// Remove an element from the HashMap
capitals.remove("United Kingdom");
// To display size of the hashtmap
System.out.println("The Size of alph Map is : " + alph.size());
// Check the existence of key in the Hashmap
String key = ""; //put cyrillic letter here
if (capitals.containsKey( key )) {
System.out.println("The Latin of " + key + " is: " + alph.get( key ));
} else {
System.out.println("There is no entry for the capital of " + key);
} //end else
} //end main method
} //end class definition of Demo

