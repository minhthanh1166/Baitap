import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Thisinh> ts_list = new ArrayList<>(10);


        for (int i = 0; i < 2; i++) {
            Thisinh ts = new Thisinh();
            System.out.println("\n Nhập thí sinh thứ " + (i+1));
            ts.input();
            ts_list.add(ts);

        }

        int j=1;
        for (Thisinh t: ts_list) {
            System.out.println("\n Thí sinh " + (j++));
            if (t.Tongdiem() >= 15) {
                t.Output();
                System.out.println("--------------------------------");
            } else if (t.Tongdiem() < 15) {
                t.Output();
                System.out.println("Bạn học rất dốt, vui lòng đúp lại môn !!!");
            }
        }


    }
}
