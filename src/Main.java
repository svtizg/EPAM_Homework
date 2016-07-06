public class Main {

    public static void main(String[] args) {
        MyArray a = new MyArray();
        a.add(4);
        a.add(8);
        a.add(new Integer(15));
        a.add(new Integer(23));

        for (int i=0; i<a.getSize();i++){
            System.out.print(a.getValue(i)+"   ");
        }
        System.out.println();

        a.add(16, 3);
        for (int i=0; i<a.getSize();i++){
            System.out.print(a.getValue(i)+"   ");
        }
        System.out.println();

        a.addUnique(42);
        a.addUnique(8);

        for (int i=0; i<a.getSize();i++){
            System.out.print(a.getValue(i)+"   ");
        }
        System.out.println();

        a.delete(0);
        a.delete(2);
        for (int i=0; i<a.getSize();i++){
            System.out.print(a.getValue(i)+"   ");
        }
        System.out.println();
    }
}
