import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Test test;

        System.out.print("This program can store any item u want.\nFirst type a name to add first item.\nadd ");
        test = new Test(sc.next());
        Test cache = test;
        System.out.println("Great!Let's start this program!!You can type 'help' to get command list");

        while (true) {

            String st = sc.next();

            if (st.equals("exit")) {
                System.exit(0);
            } else if (st.equals("add")) {
                cache.setNext(sc.next());
                cache = cache.getNext();
            } else if (st.equals("show")) {
                int flag = 0;
                System.out.println("Now You Have " + test.getLength() + " Item,and This Is List:\n");
                for (Test t = test; flag == 0; t = t.getNext()) {
                    System.out.print(t.getString() + " ");
                    if (t.getNext() == null)
                        flag = 1;
                }
                System.out.println();
            } else if (st.equals("length")) {
                System.out.println(test.getLength());
            } else if (st.equals("help")) {
                System.out.println("This is the command list:");
                System.out.println("  add    -to add item");
                System.out.println("  show   -to show the item list you have");
                System.out.println("  exit   -to stop this program");
                System.out.println("  help   -to show command list");
            } else
                System.out.println("Can't find that command!!!");

        }
    }
}

class Test {

    private static int length = 0;
    private Test next;
    private String obj;

    public String getString() {
        return obj;
    }


    Test(String obj) {

        this.obj = obj;

    }

    public void setNext(String obj) {
        Test cache = new Test(obj);
        this.next = cache;
        length++;

    }

    public Test getNext() {
        return this.next;
    }

    public int getLength() {
        return length;
    }
}
