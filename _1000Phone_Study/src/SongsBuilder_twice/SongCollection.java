package SongsBuilder_twice;
import java.util.*;
/**
 * @author Jerforce
 * @date 2023/4/12 星期三 22:03:28
 */


public class SongCollection {
    public static void main(String[] args) {
        HashMap<String, Song> songs = new HashMap<String, Song>();
        songs.put("Psychic", new Song("Psychic", "Connor Price", 190));
        songs.put("Violet", new Song("Violet", "Severus Snape", 220));
        songs.put("Don'tRush", new Song("Don'tRush", "George R.R. Martin", 189));
        songs.put("The End of the World", new Song("The End of the World", "The Beatles", 210));
        songs.put("Obsessed", new Song("Obsessed", "Metallica", 190));
        songs.put("Raye", new Song("Raye", "John Spliff", 199));
        songs.put("Be Like the Wind", new Song("Be Like the Wind", "The Rolling Stones", 220));
        songs.put("So far Away", new Song("So far Away", "The Beatles", 205));
        songs.put("Never Sleep for the Night", new Song("Never Sleep for the Night", "The Beatles", 206));
        songs.put("You For Me", new Song("You For Me", "The Beatles", 207));

        System.out.println("All songs in the collection:");
        for (Song song : songs.values()) {
            System.out.println(song.toString());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a song name to search:");
        String searchName = scanner.nextLine();
        Song searchedSong = songs.get(searchName);
        if (searchedSong != null) {
            System.out.println("Searched song details: " + searchedSong.toString());

        } else {
            System.out.println("Song not found in the collection.");
        }

        System.out.println("========================================================");

        System.out.println("Enter a song name to remove:");
        String removeName = scanner.nextLine();
        Song removedSong = songs.remove(removeName);
        if (removedSong != null) {
            System.out.println("Removed song details: " + removedSong.toString());
            System.out.println("after Removing, the song Collections:");
            for (Song song : songs.values()) {
                System.out.println(song.toString());
            }

        } else {
            System.out.println("Song not found in the collection.");
        }

        System.out.println("========================================================");

        TreeMap<Integer, Song> sortedSongsByDuration = new TreeMap<Integer, Song>();
        for (Song song : songs.values()) {
            sortedSongsByDuration.put(song.getPlaytime(), song);
        }

        System.out.println("All songs in the collection sorted by duration:");
        for (Song song : sortedSongsByDuration.values()) {
            System.out.println(song.toString());
        }

        System.out.println("========================================================");

        HashSet<Song> songSet = new HashSet<Song>();
        songSet.add(new Song("You For Me", "The Beatles", 207));
        songSet.add(new Song("Raye", "John Spliff", 199));
        songSet.add(new Song("Raye", "Severus Snape", 220));
        songSet.add(new Song("Never Sleep for the Night", "The Beatles", 206));
        songSet.add(new Song("Raye", "George R.R. Martin", 189));
        songSet.add(new Song("Be Like the Wind", "The Rolling Stones", 220));
        songSet.add(new Song("Raye", "John Spliff", 199));
        songSet.add(new Song("Psychic", "Connor Price", 190));
        songSet.add(new Song("Violet", "Severus Snape", 220));
        songSet.add(new Song("Never Sleep for the Night", "The Beatles", 206));
        songSet.add(new Song("So far Away", "The Beatles", 205));
        songSet.add(new Song("Obsessed", "Metallica", 190));
        System.out.println("All songs in the set (before removing duplicates):");
        songSet.forEach(System.out::println);
        HashSet<Song> uniqueSongs = new HashSet<Song>(songSet);
        System.out.println("去重后的歌曲：");
        uniqueSongs.forEach(System.out::println);

        System.out.println("========================================================");

        TreeSet<Song> sortedSongsByDurationSet = new TreeSet<Song>(new Comparator<Song>() {
            public int compare(Song song1, Song song2) {
                return song1.getPlaytime() - song2.getPlaytime();
            }
        });

        sortedSongsByDurationSet.addAll(songs.values());

        System.out.println("All songs in the set sorted by duration:(after removing duplicates)");
        for (Song song : sortedSongsByDurationSet) {
            System.out.println(song.toString());
        }
    }
}

