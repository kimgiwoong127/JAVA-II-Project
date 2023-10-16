package MapEditor;

import java.io.*;

public class loadMap {
    public static int[][] loadMap() {
        int[][] map = new int[21][12];
        try {
            BufferedReader reader = new BufferedReader(new FileReader("MapEditor/map.txt"));
            for (int y = 0; y < 12; y++) {
                String[] values = reader.readLine().trim().split(" ");
                for (int x = 0; x < 21; x++) {
                    if (values[x].equals("")) {
                        map[x][y] = 0; // 빈 공간을 0으로 표시
                    } else {
                        map[x][y] = Integer.parseInt(values[x]);
                    }
                }
            }
            reader.close();
            System.out.println("Map loaded successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }
}