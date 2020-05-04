/* program to Create an array to store different type of Objects including primitives and get them in the same way inserted.*/


class Main {

  public static void main(String[] args) {
    //System.out.println("Hello world!");
    //declare object array

    StringBuilder sn = new StringBuilder();
    Object[] JavaObjectArray = new Object[7];
    JavaObjectArray[0] = 10;
    JavaObjectArray[1] = "Hello Java";
    JavaObjectArray[2] = 1.87;
    JavaObjectArray[3] = 7.29;
    JavaObjectArray[4] = "Superb";
    JavaObjectArray[5] = sn.append("String");
    JavaObjectArray[6] = 8.88;

    //printing objects

    for(Object javaobj: JavaObjectArray)
    {
      System.out.println(javaobj);
    }

  }
}
