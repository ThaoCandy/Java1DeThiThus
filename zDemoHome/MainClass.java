package zDemoHome;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int i = 1;

        while (true) {
            System.out.printf("Doi tuong thu %d: ", i);
            String x = sc.nextLine();
            
            // Sử dụng equals để so sánh chuỗi và kiểm tra chuỗi rỗng
            if (x.equals("") || x == null) {
                break;
            }

            list.add(x);
            i++;
        }

        // Kiểm tra xem có ít nhất 3 phần tử trong danh sách trước khi truy cập phần tử thứ 3
        
            int a = Integer.parseInt(list.get(2));
            int b = a + 4;
            System.out.println(b);
        
    }
}
