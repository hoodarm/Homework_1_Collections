import ibadts.Collection;

public class Main {
    public static void main(String[] args) {
        Collection<String> NAMES = new Collection<>();
        NAMES.add(new String[]{"John", "Marie"});
        for (int COUNT = 0; COUNT <= 2; COUNT++) {
            NAMES.resetNext();
            while (NAMES.hasNext())
                System.out.println(NAMES.getNext());
        }
    }
}