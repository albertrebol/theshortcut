package cl.albert.datastructure.array;

import org.junit.Test;

/**
 * ClassName: TestDynamicArray
 * Package: cl.albert.datastructure.array
 * Description:
 *
 * @Author Albert
 * @Create 2024/12/17 19:23
 * @Version 1.0
 */
public class TestDynamicArray {

    @Test
    public void test1(){
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.addLast(1);
        dynamicArray.addLast(2);
        dynamicArray.addLast(3);
        dynamicArray.addLast(4);
//        dynamicArray.addLast(5);

        dynamicArray.add(2, 5);

        for (int i = 0; i < 5; i++) {
            System.out.println(dynamicArray.get(i));

        }
    }
}
