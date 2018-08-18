package chap04;

class LocalVar {
  public static void main(String[] args) {
    int a;
    int b = 12;
    // 编译不通过: 局部变量不会被初始化，赋予默认值
    System.out.printf("a+b=%d", a + b);
  }
}
