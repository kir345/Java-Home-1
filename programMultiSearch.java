package HOME;

import java.util.ArrayList;

// 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
// 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

public class programMultiSearch {
    public static ArrayList<Integer> arrayNotMult(int i, int n, int max){

    //public static ArrayList<Integer> arrayNotMult(int i, int n, int min){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int j = i + 1; j >= max; j++){
            if(j % n == 0){
        //for (int j = i - 1; j >= min; j--){
            //if(j % n != 0){
                list.add(j);
            }

        }
        return list;
    }
    
}
