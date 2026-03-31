// Adryan Julianto Panjaitan - 12S24013

package driver;
import src.model.*;
import java.util.*;

public class Driver1 {
    public static void main(String[] args) {
        Map<String, Account> akun = new HashMap<>();
Scanner sc = new Scanner(System.in);
        String line;
        sc.useDelimiter("\n");
        while (sc.hasNextLine()) {
            line = sc.nextLine().trim();
            if (line.equals("---")) break;
            String[] parts = line.split("#");
            if (parts[0].equals("create-account")) {
                String name = parts[1];
                String user = parts[2];
                AccountType type = AccountType.valueOf(parts[3]);
                akun.put(user, new Account(name, user, type));
            }
        }
        akun.values().stream().forEach(System.out::println);
    }
}