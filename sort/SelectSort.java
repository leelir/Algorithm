/*
Select Sort By SIM
首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，
然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
以此类推，直到所有元素均排序完毕。
时间复杂度
最优时间复杂度
О(n²)
平均时间复杂度
О(n²)
*/
public class SelectSort{

  public static void selectSort(int num[]){
    int min,temp;

    for (int i = 0; i < num.length; i++ ) {
      min = i;
      //查找最小元素并与min交换
      for (int j = num.length-1; j >= i; j-- ) {
        if (num[min] > num[j]) {
          min = j;
        }
      }
      //交换最小值
      if (min != i) {
        temp = num[min];
        num[min] = num[i];
        num[i] = temp;
      }
    }
    for (int i = 0;i < num.length ;i++ ) {
      System.out.print(num[i]+"\t");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    int num[] = {6,2,4,1,3,7,9,4,8,5};
    selectSort(num);
  }
}
