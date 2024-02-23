import capers.Utils;

import java.io.File;
import java.io.IOException;

class Example {
    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("user.dir")+"我是谁");
        File f = new File("dummy.txt");
        Utils.writeContents(f, "Hello World");
        try {
            f.createNewFile();
        } finally {
            System.out.println("创建成功");
        }

    }
}
