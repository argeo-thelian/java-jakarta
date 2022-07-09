public class StringsTestConcatTime {
    public static void main(String[] args) {
    
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            // c = c.concat(a).concat(b).concat("\n"); //500 => 9ms, 10000 => 221, 1000000 => 30mins o mas
            // c += a + b + "\n"; // 500 => 0ms, 10000 => 191 ms, 1000000 =>30mins o mas 
            sb.append(a)
              .append(b)
              .append("\n"); // 500 => 2ms, 10000 => 5 ms, 1000000 => 93ms
        }

        long stopTime = System.currentTimeMillis();

        System.out.println(stopTime - startTime);
        System.out.println("c = " + c);
        // System.out.println("sb = " + sb.toString());
    }
    
}
