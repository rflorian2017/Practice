package sample;

import java.io.*;

public class FunWithThreads {

    public static void main(String[] args) {
        MyThread myMusicReadThread = new MyThread("music.txt");
        Thread thread = new Thread(myMusicReadThread);
        thread.start();

        MyThread myMoviesReadThread = new MyThread("movies.txt");
        Thread thread2 = new Thread(myMoviesReadThread);
        thread2.start();

        System.out.println("Main method!");
        System.out.println("Main method finished!");
    }


}

class MyThread implements Runnable {
    final String path = "c:\\Users\\Public\\Documents\\hangman\\categories\\";

    private String fileName;

    public MyThread(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        BufferedReader bufferedReader ;
        File file = new File(path + fileName);
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
        System.out.println("Lines count " + count);
        System.out.println("I finished my work for " + fileName);
    }
}
