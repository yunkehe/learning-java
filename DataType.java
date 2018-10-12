class DataType {
    // byte a = 8;
    // short b = 16;
    // int c = 32;
    // long d = 64;

    // 你需要声明一个变量存放指定类型的值
    public static void main(String[] args) {
        System.out.println("hell");

        System.out.println("byte " + Byte.SIZE);  
        System.out.println("java.lang.Byte");  
        System.out.println("Byte.MIN_VALUE=" + Byte.MIN_VALUE);  
        System.out.println("Byte.MAX_VALUE=" + Byte.MAX_VALUE);  
        System.out.println();  
  
        // short  
        System.out.println("short " + Short.SIZE);  
        System.out.println("java.lang.Short");  
        System.out.println("Short.MIN_VALUE=" + Short.MIN_VALUE);  
        System.out.println("hort.MAX_VALUE=" + Short.MAX_VALUE);  
        System.out.println();  
  
        // int  
        System.out.println("int " + Integer.SIZE);  
        System.out.println("java.lang.Integer");  
        System.out.println("Integer.MIN_VALUE=" + Integer.MIN_VALUE);  
        System.out.println("eger.MAX_VALUE=" + Integer.MAX_VALUE);  
        System.out.println();  
  
        // long  
        System.out.println("long " + Long.SIZE);  
        System.out.println("java.lang.Long");  
        System.out.println("Long.MIN_VALUE=" + Long.MIN_VALUE);  
        System.out.println("Long.MAX_VALUE=" + Long.MAX_VALUE);  
        System.out.println();  
  
        // float  
        System.out.println("float " + Float.SIZE);  
        System.out.println("java.lang.Float");  
        System.out.println("Float.MIN_VALUE=" + Float.MIN_VALUE);  
        System.out.println("loat.MAX_VALUE=" + Float.MAX_VALUE);  
        System.out.println();  
  
        // double  
        System.out.println("double " + Double.SIZE);  
        System.out.println("java.lang.Double");  
        System.out.println("Double.MIN_VALUE=" + Double.MIN_VALUE);  
        System.out.println("uble.MAX_VALUE=" + Double.MAX_VALUE);  
        System.out.println();  
  
        // char  
        System.out.println("char " + Character.SIZE);  
        System.out.println("java.lang.Character");  
        // 以数值形字符形式将Character.MIN_VALUE输出到控制台  
        System.out.println("Character.MIN_VALUE="  
                + (int) Character.MIN_VALUE);  
        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台  
        System.out.println("Character.MAX_VALUE="  
                + (int) Character.MAX_VALUE);  
    } 

    // 在 Java 中使用 final 关键字来修饰常量
    // 自动类型转换
    // 强制类型转换
}