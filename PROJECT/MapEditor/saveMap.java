package MapEditor;

import java.io.*;

public class saveMap {
    public static void saveMap(int[][] map) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter("MapEditor/map.txt"));
            for (int y = 0; y < 12; y++) {
                for (int x = 0; x < 21; x++) {
                    if (map[x][y] == -1) {
                        writer.print(" ");
                    } else {
                        writer.print(map[x][y] + " ");
                    }
                }
                writer.println();
            }
            writer.close();
            System.out.println("Map saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}