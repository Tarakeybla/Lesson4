package task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class PhoneTable {

    private HashMap<String, String> phoneTable = new HashMap<>();

    public void add (String phone, String name) {
        phoneTable.put(phone, name);
    }

    public String get (String name) {
        if (phoneTable.containsValue(name)){
            String result = "Номер телефона:\n";
            for (String key: phoneTable.keySet()) {
                if (phoneTable.get(key).equals(name)) result +=name + " - " + key + "; \n";
            }
            return result;
        }
        else return "Пользователь с именем " + name + " не найден";
    }
}
