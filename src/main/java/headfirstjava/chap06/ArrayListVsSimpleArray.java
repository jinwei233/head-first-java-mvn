/**
 * 一般数组
 *
 * <p>- 创建时确定大小
 *
 * <p>- 根据索引存放
 */
package chap06;

import java.util.ArrayList;

class ArrayListVsSimpleArray {
  private void simpleArrayPrint() {
    System.out.println("simple array print");
    String[] myList = new String[2];
    myList[0] = new String("first line");
    myList[1] = new String("2nd line");
    System.out.println("myList length=" + myList.length);
    System.out.println("for loop a simple array");
    for (String line : myList) {
      System.out.println(line);
    }
  }

  private void arrayListPrint() {
    System.out.println("array list print");
    ArrayList<String> myList = new ArrayList<String>();
    myList.add(new String("first line"));
    myList.add(new String("2nd line"));
    System.out.println("myList.size = " + myList.size());
    System.out.println("get(0)" + myList.get(0));
  }

  public static void main(String[] args) {
    ArrayListVsSimpleArray ins = new ArrayListVsSimpleArray();
    ins.simpleArrayPrint();
    ins.arrayListPrint();
  }
}
