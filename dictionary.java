public class DictionaryExample {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();

        // Add key-value pairs
        dictionary.put("Apple", "A fruit");
        dictionary.put("Java", "A programming language");
        dictionary.put("Car", "A vehicle");

        // Get value
        System.out.println(dictionary.get("Java"));

        // Check if key exists
        System.out.println(dictionary.containsKey("Apple"));

        // Remove an entry
        dictionary.remove("Car");

        // Print all entries
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
