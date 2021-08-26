package missedCalls;

import missedCalls.Contacts;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.TreeMap;

public class MissedCalls {
    private Map<LocalDateTime, String> storage = new TreeMap<>();

    public void addMissedCals(String numberPhone) {
        storage.put(LocalDateTime.now(), numberPhone);
    }

    public String printMissedCalls(Contacts contacts) {
        if(storage.isEmpty())  System.out.println("Нет пропущенных");
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<LocalDateTime, String> missedCals : storage.entrySet()) {
            sb
                    .append(missedCals.getKey())
                    .append("\t")
                    .append(
                            (contacts.contains(missedCals.getValue())) ?
                                    contacts.get(missedCals.getValue()).getName() :
                                    missedCals.getValue())
                    .append("\n");
        }
        return sb.toString();
    }

    public void clearMissedCalls() {
        storage.clear();
    }

}