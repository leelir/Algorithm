/*
binary insert Sort By SIM
将二分查找加入到排序中，是插入排序的小改进。在二分查找完成以后
将left后边的数右移，left的值就是待排序的temp值。
*/

public class binaryInsertSort {
  public static void biSort(int num[]){
    int temp, left, right, middle;
    for (int i = 1;i < num.length ;i++ ) {
      temp = num[i];
      left = 0;
      right = i-1;
//二分查找
      while(left <= right){
        middle = (left + right)/2;
        if (num[middle] > temp) {
          right = middle - 1;
        }else {
          left = middle + 1;
        }
      }
//右移left后边的值
      for (int j = i-1;j >= left ;j-- ) {
        num [j+1] = num[j];
      }
      num[left] = temp;
    }

    for (int i = 0;i < num.length ;i++ ) {
      System.out.println(num[i]);
    }
  }

  public static void main(String[] args) {
    int num[] = {6,2,4,1,3,7,9,4,8,5};
    biSort(num);
  }
}
