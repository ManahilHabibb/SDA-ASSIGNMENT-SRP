class MusicPlayer {
    private static MusicPlayer instance;
    private String currentSong;

    // Private constructor to prevent multiple object creation
    private MusicPlayer() {
        System.out.println("Music Player Initialized!");
    }

    // Public method to get the single instance
    public static MusicPlayer getInstance() {
        if (instance == null) {
            instance = new MusicPlayer();
        }
        return instance;
    }

    // Play song
    public void playSong(String song) {
        currentSong = song;
        System.out.println("Playing: " + song);
    }

    // Pause song
    public void pauseSong() {
        if (currentSong != null) {
            System.out.println("Music Paused: " + currentSong);
        } else {
            System.out.println("No song is currently playing.");
        }
    }

    // Stop song
    public void stopSong() {
        if (currentSong != null) {
            System.out.println("Music Stopped.");
            currentSong = null;
        } else {
            System.out.println("No song is currently playing.");
        }
    }
}

// Main class to test Singleton
public class Main {
    public static void main(String[] args) {
        MusicPlayer player1 = MusicPlayer.getInstance();
        MusicPlayer player2 = MusicPlayer.getInstance();

        // Using the Music Player instance
        player1.playSong("Shape of You");
        player2.pauseSong();
        player1.stopSong();

        // Checking if both references point to the same instance
        System.out.println(player1 == player2); // Output: true
    }
}
