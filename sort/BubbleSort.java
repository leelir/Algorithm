/*
Bubble Sort By SIM
它重复地走访过要排序的数列，一次比较两个元素，如果他们的顺序错误就把他们交换过来。
时间复杂度
最优时间复杂度
О(n)
平均时间复杂度
О(n²)
最差时间复杂度
O(n²)
*/

public class BubbleSort {

  public static void bubblesort(int num[]){
    int temp;
    for (int i = num.length-1; i >= 0; i--) {
      for (int j = 0; j < i; j++ ) {
        if (num[j] > num[j+1]) {
          temp = num[j+1];
          num[j+1] = num[j];
          num[j] = temp;
        }
      }
      for (int k = 0;k < num.length ;k++ ) {
        System.out.print(num[k]+"\t");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    int num[] = {6,2,4,1,3,7,9,4,8,5};
    bubblesort(num);
  }
}
