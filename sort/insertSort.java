/*
insert Sort By SIM
从第一个数开始，将第一个数看作是已经排好序的元素，然后将后边的
数与之比较，如果比他小就交换，排好序后再对下一个数排序。
*/
public class insertSort{
  public static void insertSort(int num[]){
    int temp;
    for (int i = 1;i < num.length;i++ ) {
      temp = num[i];//temp为将要排序的元素
      for (int j = i-1;j >= 0 ;j-- ) {
        //将temp的值与已经排好序的i-1个元素比较
        if (num[j] > temp) {
          num[j+1] = num[j];
          num[j] = temp;
        }
      }
    }
    for (int i = 0;i < num.length ;i++ ) {
      System.out.println(num[i]);
    }
  }
  public static void main(String[] args) {
    int num[] = {6,2,4,1,3,7,9,4,8,5};
    insertSort(num);
  }
}
