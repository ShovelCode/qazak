import java.util.HashMap;
public class Demo {
public static void main(String[] args ) {
HashMap <String, String> alph = new Map<String, String>();
alph.put("А", "A");
alph.put("а", "a");
alph.put("Ә", "Ä");
alph.put("ә", "ä");
    
/*
Б B
б b

В V
в v

Г G
г g

Ғ Ğ
ғ ğ

Д D
д d

Е E
е e

Ё Yo
ё yo

Ж Zh
ж zh

З Z
з z

И I
и i

Й Y
й y

К K
к k

Қ Q
қ q

Л L
л l

М M
м m

Н N
н n

Ң Ŋ
ң ŋ

О O
о o

Ө Ö
ө ö

П P
п p

Р R
р r

С S
с s

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

