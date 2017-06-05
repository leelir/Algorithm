/*
 * 从递归和非递归两种方法进行二分查找
 */
public class BinarySearch {

  /*
   * 非递归二分查找算法
   * 参数:整型数组,需要比较的数.
   */
  public static int binSearch(int num[], int tar){
    int left = 0;
    int right = num.length - 1;
    while (left <= right) {
      int middle = (right + left) / 2;
      if (num[middle] == tar) {
        return middle;
      }
      else if (num[middle] > tar) {
        right = middle - 1;
      }
      else {
        left = middle + 1;
      }
      System.out.println(middle);
    }
    return -1;
  }

  /*
   * 递归方法实现二分查找法.
   */
   public static int binarySearch(int num[], int tar, int left, int right){
     if (left <= right) {
       int middle = (right + left) / 2;
       if (tar == num[middle]) {
         return middle;
       }
       else if (tar < num[middle]) {
         return binarySearch(num, tar, left, middle-1);
       }
       else {
         return binarySearch(num, tar, middle+1, right);
       }
     }
     else {
       return -1;
     }
   }

   public static void main(String[] args) {
     int num[] = {1,3,4,6,7,8,11,14,18};
     int tar = 1;
    //  int index = binSearch(num, tar);
     int index = binarySearch(num, tar, 0, num.length-1);
     if (index != -1) {
       System.out.println("the index of target is " + index);
     }else{
       System.out.println("can't find out target number!!!");
     }
   }
}
