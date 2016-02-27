package serialization;

import java.io.*;

public class MainClass {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Shape rectangle = new Rectangle(4.3, 7);
        Shape circle = new Circle(2.5);
        Shape isoscelesTriangle = new IsoscelesTriangle(2, 4.6);

        System.out.println(isoscelesTriangle);

        File file = new File("text.txt");
        if (file.exists()) file.createNewFile();

        writeToFile(file, isoscelesTriangle);
        getClonedObject(file);

    }

    public static void writeToFile(File file, Shape shape) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(shape);
        objectOutputStream.close();
    }

    public static void getClonedObject(File file) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Object o = objectInputStream.readObject();

        if (o instanceof Shape) {
            Shape clone = (Shape) o;
            System.out.println(clone);
        }
    }
}
