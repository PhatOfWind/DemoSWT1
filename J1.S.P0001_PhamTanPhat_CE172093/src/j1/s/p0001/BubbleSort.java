package j1.s.p0001;

import java.util.Random;

/**
 *
 * @author Pham Tan Phat_CE172093
 */
public class BubbleSort {

    private int[] array;
    private int input;
    private Validiation valid;

    /**
     * Hàm tạo mảng ngẫu nhiên với số lượng phần tử nhập từ bàn phím.
     */
    public void createArray() {
        input = valid.getPosInteger();
        //tạo random
        Random ran = new Random();
        //tạo mảng từ độ dài nhập từ bàn phím
        array = new int[input];
        //vòng lặp tạo phần tử ngẫu nhiên và đưa chúng vào mảng
        for (int i = 0; i < input; i++) {
            int a = ran.nextInt(input);
            array[i] = a;
        }
    }

    /**
     * Thuật toán: Sắp xếp nổi bọt. Thuật toán sẽ so sánh 2 số liền kề và đổi
     * chỗ cho nhau nếu phần tử phía trước lớn hơn phần tử phía sau
     */
    public void bubblesort() {
        //vòng lặp lớn thực hiện số lần lặp để sắp xếp
        for (int i = 0; i < input; i++) {
            //vòng lặp để nổi bọt
            for (int j = 0; j < input-1 ; j++) {
                //Nếu phần tử hiện tại lớn hơn phần tử phía sau thì đổi chỗ
                if (array[j] > array[j + 1]) {
                    //đặt phần tử tại j vào biến temp
                    int temp = array[j];
                    //phần tử kế tiếp trở thành phần tử tại j 
                    array[j] = array[j + 1];
                    //biến temp sẽ đặt vào phần tử kế tiếp của j
                    array[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Hàm in ra mảng. Với các phần tử đầu tiên của mảng sẽ không có dấu phẩy
     * phía trước
     */
    public void display() {
        System.out.print("[");
        //vòng lặp in ra mảng
        for (int i = 0; i < input; i++) {
            //nếu i bằng 0, đó là phần tử đầu tiên, không có phẩy phía trước
            if (i == 0) {
                System.out.print(array[i]);
            //nếu i khác 0, là những phần tử phía sau, có phẩy phía trước
            } else {
                System.out.print(", " + array[i]);
            }
        }
        System.out.println("]");
    }

    /**
     * Khởi tạo đối tượng Validiation.
     */
    public BubbleSort() {
        this.valid = new Validiation();
    }

    public BubbleSort(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

}
