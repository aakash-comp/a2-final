package a2;


public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(6);
        list.removeOdds();
        System.out.println(list.toString());
    }
}
