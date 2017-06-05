public class LinearSearch{

  public static int linSearch(int num[], int tar){
    for (int i = 0; i < num.length; i++) {
      if (num[i] == tar) {
        return i+1;
      }
    }
    return -1;
  }

public static void main(String[] args) {
    int num[] = {6,2,4,1,3,7,9,4,8,5};
    int tar = 4;
    int index = linSearch(num, tar);
    if (index != -1) {
      System.out.println("the index of target is " + index);
    }else{
      System.out.println("can't find out target number!!!");
    }
  }
}
