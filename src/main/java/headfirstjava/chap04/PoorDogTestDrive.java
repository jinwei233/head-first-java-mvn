package chap04;

public class PoorDogTestDrive {
  public static void main(String[] args) {
    PoorDog one = new PoorDog();
    // 实例变量总是有默认值!

    // int 类型的默认值是 0
    System.out.println("Dog size is " + one.getSize());
    // string 类型的默认值 null
    System.out.println("Dog name is " + one.getName());
  }
}
