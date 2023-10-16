// import javazoom.jl.player.Player;
// import java.io.FileInputStream;

// public class SoundPlayer {
//     private Player player;

//     public SoundPlayer(String soundFilePath) {
//         try {
//             FileInputStream fis = new FileInputStream(soundFilePath);
//             player = new Player(fis);
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }

//     public void play() {
//         new Thread(() -> {
//             try {
//                 player.play();
//             } catch (Exception e) {
//                 e.printStackTrace();
//             }
//         }).start();
//     }

//     public void stop() {
//         player.close();
//     }
// }
