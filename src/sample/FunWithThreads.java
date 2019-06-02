package sample;

import java.io.*;

public class FunWithThreads {

    public static void main(String[] args) {
        final String path = "c:\\Users\\Public\\Documents\\hangman\\categories\\";
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles) {
            if (file.isFile()) {
                MyRunnableImplementation myRunnableImplementation = new MyRunnableImplementation(path + file.getName());
                Thread thread = new Thread(myRunnableImplementation);
                thread.start();
            }
        }

        for (File file : listOfFiles) {
            if (file.isFile()) {

                MyThread thread= new MyThread(path + file.getName());
                thread.start();
            }
        }




        System.out.println("Main method!");
        System.out.println("Main method finished!");
    }


}

class MyRunnableImplementation implements Runnable {


    private String fileName;

    public MyRunnableImplementation(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        BufferedReader bufferedReader ;
        File file = new File(fileName);
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }

        int count = 0;
        try {
            while (bufferedReader.readLine() != null) {
                count++;

            }

        }
        catch (IOException ex) {

        }
        System.out.println("Runnable: Lines count " + count);
        System.out.println("I finished my runnable work for " + fileName);
    }
}

class MyThread extends Thread {


    private String fileName;

    public MyThread(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        BufferedReader bufferedReader ;
        File file = new File(fileName);
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }

        int count = 0;
        try {
            while (bufferedReader.readLine() != null) {
                count++;

            }

        }
        catch (IOException ex) {

        }
        System.out.println("Thread: Lines count " + count);
        System.out.println("I finished my thread work for " + fileName);
    }
}

