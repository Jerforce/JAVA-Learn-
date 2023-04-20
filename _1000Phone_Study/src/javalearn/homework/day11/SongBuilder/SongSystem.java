package javalearn.homework.day11.SongBuilder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

import static java.util.Comparator.comparingInt;

/**
 * @author Jerforce
 * @date 2023/4/11 星期二 17:38:46
 */
public class SongSystem {
   public static void main(String[] args) {
      Song s1 = new Song("Psychic", "Connor Price", 190);
      Song s2 = new Song("Violet", "Severus Snape", 220);
      Song s3 = new Song("Don'tRush", "George R.R. Martin", 189);
      Song s4 = new Song("The End of the World", "The Beatles", 210);
      Song s5 = new Song("Obsessed", "Metallica", 190);
      Song s6 = new Song("Raye", "John Spliff", 199);
      Song s7 = new Song("Be Like the Wind", "The Rolling Stones", 220);
      Song s8 = new Song("So far Away", "The Beatles", 205);
      Song s9 = new Song("Never Sleep for the Night", "The Beatles", 206);
      Song s10 = new Song("You For Me", "The Beatles", 207);

      ArrayList<Song> songs = new ArrayList<>();
      songs.add(s1);
      songs.add(s2);
      songs.add(s3);
      songs.add(s4);
      songs.add(s5);
      songs.add(s6);
      songs.add(s7);
      songs.add(s8);
      songs.add(s9);
      songs.add(s10);

   }
   //遍历所有的歌曲,调用play方法显示歌曲信息
   public static  void forRReach(ArrayList<Song> songs){
      for (Song song : songs) {
         song.play();
      }
   }
   //输入歌曲名,在集合中查找该歌曲
   public static void searchSong(ArrayList<Song> songs) {
      System.out.println("请输入歌曲名:");
      Scanner scanner = new Scanner(System.in);
      String name = scanner.next();
      for (Song song : songs) {
         if (song.getName().equals(name)) {
            song.play();
         }
      }
   }
   //输入整数索引，删除该位置的歌曲
   public static void deleteSong(ArrayList<Song> songs) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("请输入你要删除的歌曲索引:");
      int index = scanner.nextInt();
      songs.remove(index);
   }
   //找出播放时间最长的歌曲
   public static void findLongestSong(ArrayList<Song> songs) {
      Song s = Collections.max(songs, comparingInt(Song::getPlaytime));
      System.out.println("最长播放时间是:" + s.getPlaytime() / 60 + "分钟" + s.getPlaytime() % 60 + "秒");
   }
   //将所有歌曲复制到LinkedList集合中
   public static void copySong(ArrayList<Song> songs) {
      LinkedList<Song> songs1 = new LinkedList<>();
      for (Song song : songs) {
         songs1.add(song);
      }
   }
    // 将所有的歌曲根据播放时长排序，并显示
   public static void sortSong(ArrayList<Song> songs) {
      Collections.sort(songs, comparingInt(Song::getPlaytime));
      for (Song song : songs) {
         song.play();
      }
   }

}