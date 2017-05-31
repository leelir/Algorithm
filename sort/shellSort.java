/*
shell Sort By SIM
希尔排序是在直接插入排序的基础上进行了改进，通过加入排序数据元素间隔gap,gap = gap*3-1;
复杂度根据gap的不同而不同，已知最好的是On(nlog^2n).
*/

public class shellSort {
  public static void shSort(int num[]){
    int gap = 0;
    while (gap < num.length) {
      gap = gap * 3 + 1;
    }

    while(gap > 0){
      for (int i = gap; i < num.length ;i+=gap ) {
        if (num[i] < num[i-gap]) {
          int temp = num[i];
          for (int j = i-gap; j>=0; j-=gap) {
            if (num[j] > temp) {
              num[j+gap] = num[j];
              num[j] = temp;
            }
          }
        }
      }
      gap = (gap-1)/3;
      for (int i = 0;i < num.length ;i++ ) {
        System.out.print(num[i]+"\t");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    int num[] = {6,2,4,1,3,7,9,4,8,5};
    shSort(num);
  }
}
