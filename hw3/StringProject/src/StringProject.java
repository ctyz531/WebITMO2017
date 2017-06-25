import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by ASUS on 13.05.2017.
 */
public class StringProject {
    public static void main(String args[]) throws IOException {
        Locale.setDefault(Locale.ENGLISH);

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = new String();
        TreeMap<String, Integer> words = new TreeMap<String, Integer>();
//Разбиваем строку на слова

        s = in.readLine();
        StringTokenizer st = new StringTokenizer(s, "., -\"!?:;");
//Считаем количество слова в строке. Каждое слово хранится в TreeMap и является ключом.
//А количество таких слов - значением. Еси слово уже встречаолсь, удаляем его из TreeMap
//и возвращаем пару с таким же ключом, но со значением на 1 больше
        while (st.hasMoreTokens()) {
            String buf = st.nextToken().toLowerCase();
            if (words.containsKey(buf)) {
                int i = words.get(buf);
                words.remove(buf);
                i++;
                words.put(buf, i);
            } else {
                words.put(buf, 1);
            }
        }
//Переписываем пары ключ-значение в массив слов в формате "ключ" + значение. И выводим массив
        String[] arrString = new String[words.size()];
        int i = 0;
        for (Map.Entry w : words.entrySet()){
            arrString[i] = w.getKey() + ": " + w.getValue();
            System.out.println(arrString[i]);
            i++;
        }
    }
}
