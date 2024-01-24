package j1.s.p0001;

import java.util.Scanner;

/**
 *
 * @author Pham Tan Phat
 */
public class Validiation {

    /**
     * Input positive integer.
     *
     * @return user's input
     * @throws Exception when input negative number
     */
    public int getPosInteger() {
        Scanner sc = new Scanner(System.in);
        boolean Accept = true;
        //vòng lập để nhập số, nếu không hợp lệ thì báo lỗi nhập lại.
        while (Accept) {
            try {
                System.out.println("Enter number of array: ");
                int res = Integer.parseInt(sc.nextLine());
                //Nếu nhập số âm, ném ra ngoại lệ
                if (res <= 0) {
                    throw new Exception();
                }
                return res;
            } catch (Exception e) {
                System.out.println("Invalid"); 
            }
        }
        return 0;
    }
}
