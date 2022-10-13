package Lesson4;

import java.util.Random;
import java.util.Scanner;

    public class TicTacToe {
        public static int size = 3;
        public static int dotsToWin = 3;
        public static final char DOT_EMPTY = '•';
        public static final char DOT_X = 'X';
        public static final char DOT_O = 'O';
        public static char[][] map;
        public static Scanner sc = new Scanner(System.in);
        public static Random rand = new Random();
        public static void main(String[] args) {
            do {
                inputMapSize();
                inputDotsToWin();
                System.out.println("Рыба карась, игра началась!");
                initMap();
                printMap();
                playGame();
                System.out.println("Игра закончена. Хотите повторить? (y/n)");
            } while (switch (sc.next()) {
                case "y", "да", "+" -> true;
                default -> false;
            });
            System.out.println("Спасибо за игру!");
        }

        private static void inputDotsToWin() {
            int minDotSize = 3;
            int maxDotSize = 5;
            System.out.print("Введите количество символов для победы: ");
            dotsToWin = inpNumberCheckRange(minDotSize, maxDotSize);
        }

        public static void playGame() {
            int[] turnRes;
            while (true) {
                turnRes = humanTurn();
                printMap();
                if (checkWin(turnRes[0], turnRes[1], DOT_X)) {
                    System.out.println("Победил человек");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Ничья");
                    break;
                }
                turnRes = aiTurn();
                printMap();
                if (checkWin(turnRes[0], turnRes[1], DOT_O)) {
                    System.out.println("Победил Искуственный Интеллект");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Ничья");
                    break;
                }
            }
        }

        public static int inpNumber() {
            while (true) {
                if (sc.hasNextInt()) {
                    return sc.nextInt();
                } else {
                    System.out.printf("Введено не целое число = %s. Повторите ввод: ", sc.next());
                }
            }
        }

        public static int inpNumberCheckRange(int min, int max) {
            int res;
            while (true) {
                res = inpNumber();
                if (res >= min && res <= max) {
                    return res;
                }
                System.out.printf("Вводимое число должно быть в диапазоне [%d, %d]. Повторите ввод: ", min, max);
            }
        }

        public static void inputMapSize() {
            int minMapSize = 3;
            int maxMapSize = 10;
            System.out.print("Введите размер игрового поля: ");
            size = inpNumberCheckRange(minMapSize, maxMapSize);

        }
        public static boolean checkWin(int rowNumber, int colNumber, char symbol) {
            return checkRow(rowNumber, symbol)
                    || checkColumn(colNumber, symbol)
                    || checkDiag1(rowNumber, colNumber, symbol)
                    || checkDiag2(rowNumber, colNumber, symbol)
                    ;
        }

        private static boolean checkDiag2(int rowNumber, int colNumber, char symbol) {
            int i = Math.min(rowNumber + colNumber, size - 1);
            int j = rowNumber + colNumber - i;
            int counter = 0;
            while (i >= 0 && j < size) {
                if (map[i][j] == symbol) {
                    counter++;
                } else {
                    counter = 0;
                }
                if (counter == dotsToWin) {
                    return true;
                }
                i--;
                j++;
            }
            return false;
        }

        private static boolean checkDiag1(int rowNumber, int colNumber, char symbol) {
            int i = rowNumber - Math.min(rowNumber, colNumber);
            int j = colNumber - Math.min(rowNumber, colNumber);
            int counter = 0;
            for (int k = 0; i + k < size && j + k < size; k++) {
                if (map[i + k][j + k] == symbol) {
                    counter++;
                } else {
                    counter = 0;
                }
                if (counter == dotsToWin) {
                    return true;
                }

            }
            return false;
        }

        private static boolean checkRow(int rowNumber, char symbol) {
            int counter = 0;
            for (int i = 0; i < size; i++) {
                if (map[rowNumber][i] == symbol) {
                    counter++;
                } else {
                    counter = 0;
                }
                if (counter == dotsToWin) {
                    return true;
                }
            }
            return false;
        }

        private static boolean checkColumn(int colNumber, char symbol) {
            int counter = 0;
            for (int i = 0; i < size; i++) {
                if (map[i][colNumber] == symbol) {
                    counter++;
                } else {
                    counter = 0;
                }
                if (counter == dotsToWin) {
                    return true;
                }
            }
            return false;
        }
        public static boolean isMapFull() {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (map[i][j] == DOT_EMPTY) return false;
                }
            }
            return true;
        }
        public static int[] aiTurn() {
            int x, y;
            do {
                x = rand.nextInt(size);
                y = rand.nextInt(size);
            } while (!isCellValid(x, y));
            System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y +
                    1));
            map[y][x] = DOT_O;
            return new int[]{y, x};
        }
        public static int[] humanTurn() {
            int x, y;
            do {
                System.out.print("Введите координату столбца X: ");
                x = inpNumberCheckRange(1, size) - 1;
                System.out.print("Введите координату строки Y: ");
                y = inpNumberCheckRange(1, size) - 1;
            } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
            map[y][x] = DOT_X;
            return new int[]{y, x};
        }
        public static boolean isCellValid(int x, int y) {
            if (x < 0 || x >= size || y < 0 || y >= size) {
                System.out.println("Координаты за границами поля. Повторите ввод.");
                return false;
            }
            if (map[y][x] == DOT_EMPTY) return true;
            System.out.printf("Точка (%d, %d) уже занята. Повторите ввод.%n", y + 1, x + 1);
            return false;
        }
        public static void initMap() {
            map = new char[size][size];
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    map[i][j] = DOT_EMPTY;
                }
            }
        }
        public static void printMap() {
            for (int i = 0; i <= size; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            for (int i = 0; i < size; i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < size; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
