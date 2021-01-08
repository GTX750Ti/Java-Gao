import java.util.Arrays;

class MyarrayList10 {
    public int[] elem;
    public int usedSize;//有效的数据个数
    public final static int intCapacity = 10;//初始容量

    /**
     * 构造方法并初始化
     */
    public MyarrayList10() {
        this.elem = new int[intCapacity];
        this.usedSize = 0;
    }

    /**
     * 数组为空
     *
     * @return
     */
    public boolean isEmpty() {
        return this.usedSize == 0;
    }

    /**
     * pos 合法性
     *
     * @param pos
     */
    private void checkPos(int pos) {
        if (pos < 0 || pos > this.usedSize) {
            throw new RuntimeException("pos不合法");
        }
    }

    /**
     * 打印顺序表
     */

    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i] + " ");
        }
    }

    /**
     * 在 pos 位置新添元素
     *
     * @param pos
     * @param data
     */
    public void add(int pos, int data) {
        //数组满的时候处理方式：二倍扩容
        if (isEmpty()) {
            this.elem = Arrays.copyOf(this.elem, 2 * this.elem.length);
            //            return;
        }
        //pos不合理的情况
        /*if (pos < 0 || pos > this.usedSize) {
            return;
        }*/
        checkPos(pos);
        //挪数据
        for (int i = this.usedSize - 1; i >= pos; --i) {
            this.elem[i + 1] = elem[i];
        }
        //循环完毕之后，挪完数据
        this.elem[pos] = data;
        ++this.usedSize;
    }

    /**
     * 判定是否包含某个元素
     *
     * @param toFind
     * @return
     */
    public boolean contains(int toFind) {
        return (Arrays.binarySearch(this.elem, toFind) >= 0) && (Arrays.binarySearch(this.elem, toFind) < this.usedSize);
    }

    /**
     * 查找某个元素对应的下标
     *
     * @param toFind
     * @return
     */
    public int search(int toFind) {
        //顺序表是否为空
        if (isEmpty()) {
            throw new RuntimeException("顺序表为空！");
        }
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == toFind) {
                return this.elem[i];
            }
        }
        return -1;
    }

    /**
     * 获取 pos 位置
     *
     * @param pos
     * @return
     */
    public int getPos(int pos) {
        //顺序表是否为空
        if (isEmpty()) {
            throw new RuntimeException("顺序表为空！");
        }
        //pos 合法性
        checkPos(pos);
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == this.elem[pos]) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 给 pos 位置的元素设置为 value
     *
     * @param pos
     * @param value
     */
    public void setPos(int pos, int value) {
        //顺序表是否为空
        if (isEmpty()) {
            throw new RuntimeException("顺序表为空！");
        }
        //pos 合法性
        checkPos(pos);
        this.elem[pos] = value;
    }

    /**
     * 删除第一次出现的关键字key
     *
     * @param toRemove
     */
    public void remove(int toRemove) {
        //判断数组是否包含toRomve：包含的话一定可以找到指定的下标，因此不用继续判断下标合法性
        int index = search(toRemove);
        if (index == -1) {
            System.out.println("没有此元素");
        } else {
            for (int i = index; i < this.usedSize - 1; i++) {
                this.elem[i] = this.elem[i + 1];
            }
            --this.usedSize;
        }
    }

    /**
     * 获取顺序表的长度
     *
     * @return
     */
    public int size() {
        return this.usedSize;
    }

    /**
     * 清空顺序表
     */
    public void clear() {
        this.usedSize = 0;
    }
}

public class day10顺序表 {
    public static void main(String[] args) {
        MyarrayList10 myarrayList1 = new MyarrayList10();
        for (int i = 0; i < 5; i++) {
            myarrayList1.add(i, i);
        }
        myarrayList1.display();
//        myarrayList1.add(111,111);
        System.out.println("\n******************");
        System.out.println("存在情况：" + myarrayList1.contains(2));
        System.out.println("下标查找结果：" + myarrayList1.search(2));
        System.out.println("获取元素：" + myarrayList1.getPos(2));
        System.out.println("顺序表长度：" + myarrayList1.size());
        myarrayList1.setPos(2, 3);
        myarrayList1.display();
        myarrayList1.remove(1);
        System.out.print("\n删除后：");
        myarrayList1.display();
        System.out.println("\n清空");
        myarrayList1.clear();
        myarrayList1.display();
    }
}
