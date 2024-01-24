package j1.s.p0001;

/**
 *
 * @author Pham Tan Phat-CE170293
 */
public class Management {

    private final BubbleSort BS;

    /**
     * Tạo đối tượng Bubblesort.
     */
    public Management() {
        this.BS = new BubbleSort();
    }

    /**
     * Hàm gọi phương thức tạo mảng, in ra mảng chưa xếp, sắp xếp mảng, in ra
     * mảng đã xếp.
     */
    public void Management() {
        BS.createArray();
        System.out.print("Unsorted array: ");
        BS.display();
        BS.bubblesort();
        System.out.print("Sorted Array: ");
        BS.display();
    }

}
