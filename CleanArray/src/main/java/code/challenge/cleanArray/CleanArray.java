package code.challenge.cleanArray;

import java.util.ArrayList;
import java.util.List;

public class CleanArray {

    /*
     *  solucion sin arrayList
     */

    public static Object[] cleanArray(Object[] array) {

        if (array == null || array.length == 0) {
            return new Object[0];
        }

        int size = CleanArray.sizeArray(array);
        Object[] arrayResult = new Object[size];

        int index = 0;

        CleanArray.concatArrays(arrayResult, array, index);

        return arrayResult;
    }

    public static int concatArrays(Object[] arrayResult, Object[] subArray, int index) {
        for (int i = 0; i < subArray.length; i++) {
            if (subArray[i] instanceof Object[]) {
               index = CleanArray.concatArrays(arrayResult, (Object[]) subArray[i], index);
            }else{
                arrayResult[index] = subArray[i];
                index++;
            }
        }
        return index;
    }

    public static int sizeArray(Object[] array) {
        int cont = 0;
        if (array == null || array.length == 0) {
            return cont;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof Object[]) {
                Object[] temp = (Object[]) array[i];
                cont += CleanArray.sizeArray(temp);
            }else {
                cont++;
            }
        }

        return cont;
    }

//    public static Object[] cleanArray(Object[] array) {
//        if (array == null || array.length == 0) {
//            return new Object[0];
//        }
//
//        List<Object> resultList = new ArrayList<>();
//        flattenArray(array, resultList);
//
//        return resultList.toArray();
//    }
//
//    private static void flattenArray(Object[] array, List<Object> resultList) {
//        for (Object element : array) {
//            if (element instanceof Object[]) {
//                // Llamada recursiva para aplanar subarrays
//                flattenArray((Object[]) element, resultList);
//            } else {
//                resultList.add(element);
//            }
//        }
//    }

}
