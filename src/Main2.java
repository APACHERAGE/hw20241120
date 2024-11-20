import java.io.*;
import java.util.Scanner;

/*2
С помощью методов File создайте папку
\temp Напишите метод который, позволяет пользователю вводить строки со сканнера и записывать их в файл
\temp\input.txt
Как только пользователь введет "-exit" ваша программа должна вывести на экран весь введенный пользователем текст.

 */
public class Main2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        File folder = new File("temp");

        if (folder.mkdir()) {
            System.out.println("Folder created: " + folder.getAbsolutePath());
        } else {
            System.out.println("");
        }
        File file = new File(folder,"input.txt");
        System.out.println("Enter your input");
        FileWriter fw = new FileWriter(file);

        while (true) {
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("-exit")) {
                break;
            }

            fw.write(userInput + System.lineSeparator());
        }
        fw.close();

        System.out.println("data is written to the file " + file.getAbsolutePath());
        System.out.println("File:");


        Scanner fr = new Scanner(file);
        while (fr.hasNextLine()) {
            System.out.println(fr.nextLine());
        }
        fr.close();
        try (BufferedReader br = new BufferedReader(new FileReader("temp/input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    }

