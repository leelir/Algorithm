/*
Quick Sort By SIM
快速排序的思路是：
首先，选择第一个数作为基准数字。
然后，比较后边数字一基准数字的大小，如果比基准大放右边，比基准小放左边。
最后，一遍完成后，采用分治的思想，以基数为界限划分为两部分，继续递归排序。
时间复杂度
最优时间复杂度
О(nlogn)
平均时间复杂度
О(nlogn)
最坏时间复杂度
О(n²)
*/
public class QuickSort {
//选择基准以后将排序元素分开
  public static int partition(int num[], int start, int end){
    int key = num[start];
    int i = start;
    int j = end;
    while (i < j) {
      while (i < j && num[j] >= key) {
        --j;
      }
      num[i] = num[j];
      while (i < j && num[i] <= key) {
        ++i;
      }
      num[j] = num[i];
    }
    num[i] = key;
    return i;
  }
//分治方法排序
  public static void sort(int num[], int start, int end){
    if (start < end) {
      int key = partition(num, start, end);
      for (int i = 0;i < num.length ;i++ ) {
        System.out.print(num[i]+"\t");
      }
      System.out.println();
      sort(num, key+1, end);
      sort(num,start, key-1);
    }
  }
  public static void qsort(int num[]){
    sort(num, 0, num.length-1);
  }
  public static void main(String[] args) {
    int num[] = {6,2,4,1,3,7,9,4,8,5};
    qsort(num);
  }

}
