package cl.albert.datastructure.array;

/**
 * ClassName: DynamicArray
 * Package: cl.albert.datastructure.array
 * Description: 动态数组实现
 *
 * @Author Albert
 * @Create 2024/12/16 21:32
 * @Version 1.0
 */
public class DynamicArray {
    private int size = 0; // 逻辑大小
    private int capacity = 8; // 初始容量
    private int[] array = new int[capacity];

    /**
     * 向最后位置 [size] 添加元素
     *
     * @param element 待添加元素
     */
    public void addLast(int element){
//        array[size] = element;
//        size++;
        add(size, element);
    }

    public void add(int index, int element){
        // 在指定索引处添加元素
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        // index >= 0 &&
        if(index < size){ // 保证插入的元素连续
            // 索引后元素后移
            System.arraycopy(array, index,
                    array, index + 1, size - index);
        }
        array[index] = element;
        size++;
    }

    /**
     * 查询元素
     *
     * @param index 索引位置, 在 [0..size) 区间内
     * @return 该索引位置的元素
     */
    public int get(int index) {
        return array[index];
    }
}
