import java.io.File;
import java.util.Scanner;

/*

1
Ваша программа должна запросить у пользователя строку -
 название файла или папки Если такой файл или папка есть в папке проекта программа должна сообщить об этом и корректно определить файл это или папка.
  При этом, если это файл, необходима определить его размер, если это папка, необходимо вывести ее содержимое (т.е. список файлов и папок в ней)
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file name or the directory name");
        String str = scanner.nextLine();
        File file = new File(str);
        System.out.println(file.exists());
        if (file.exists()) {
            System.out.println("Existst");
            if (file.isDirectory()) {
                System.out.println("It is a directory");
                File[] files = file.listFiles();
                if (files != null && files.length > 0) {
                    System.out.println("List of items");
                    for (File s : files) {
                        if (s.isFile()) {
                            System.out.println("File: " + s.getName());
                        } else if (file.isDirectory()) {
                            System.out.println("Directory: " + s.getName());
                        }
                    }
                } else {
                    System.out.println("Directory is empty");
                }
            }
            }
            if (file.isFile()) {
                System.out.println("It is a file");
                System.out.println(file.length());

            }
    }
}