package cl.albert.datastructure;

/**
 * ClassName: DynamicArray
 * Package: cl.albert.datastructure
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

    public void addLast(int element){
        // 最后处添加元素
        array[size] = element;
        size++;
    }

    public void add(int index, int element){
        // 在指定索引处添加元素
        if(index >= 0 && index < size){ // 保证插入的元素连续
            // 索引后元素后移
            System.arraycopy(array, index,
                    array, index + 1, size - index);
            array[index] = element;
            size++;
        }

    }
}
