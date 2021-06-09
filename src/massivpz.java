public class massivpz {
        int[] data;
        int x, y;

        public massivpz(int[] data, int x, int y) {
            this.data = data;
            this.x = x;
            this.y = y;
        }

        int[][] resize() {
            int[][] res = new int[x][y];
            int start = 0;
            for (int i = 0; i < x; i++) {
                for (int j = start; j < start + y; j++) {
                    res[i][j - start] = data[j];
                }
                start += y;
            }
            return res;
        }
    }

    class ToLine {
        int[][] data;

        public ToLine(int[][] data) {
            this.data = data;
        }

        int[] resize() {
            // склеиваем двумерный массив в один при помощи start
            int[] res = new int[data.length * data[0].length];
            int start = 0;
            for (int[] datum : data) {
                for (int j = 0; j < datum.length; j++) {
                    res[start + j] = datum[j];
                }
                start += datum.length;
            }
            return res;
        }

}
