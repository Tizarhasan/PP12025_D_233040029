package Pertemuan3;

public class ListMain {
    public static void main(String[] args) {
        // Latihan 4
        StrukturList list = new StrukturList();
        list.addTail(3);
        list.addTail(4);
        list.addTail(5);
        
        System.out.println("Elemen : ");
        list.displayElement();


        // tes 1 a
        StrukturList list2 = new StrukturList();
        list2.addTail(3);
        list2.addTail(2);
        list2.addTail(1);
        
        System.out.println("Elemen Tes 1 a: ");
        list2.displayElement();


        
        // tes 1 b
        StrukturList list3 = new StrukturList();
        list3.addTail(1);
        list3.addTail(4);
        list3.addTail(5);
        list3.addTail(7);
        
        System.out.println("Elemen Tes 1 b: ");
        list3.displayElement();

        // tes 2
        StrukturList list4 = new StrukturList();
        list4.addHead(5);
        list4.addHead(4);
        list4.addHead(3);
        
        System.out.println("Elemen Tes 2: ");
        list4.displayElement();

        // tes 3 a
        StrukturList list5 = new StrukturList();
        list5.addHead(1);
        list5.addHead(2);
        list5.addHead(3);
        
        System.out.println("Elemen Tes 3 a: ");
        list5.displayElement();

        // tes 3 b
        StrukturList list6 = new StrukturList();
        list6.addHead(7);
        list6.addHead(5);
        list6.addHead(4);
        list6.addHead(1);
        
        System.out.println("Elemen Tes 3 b: ");
        list6.displayElement();

    }
}