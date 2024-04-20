package LR_2;

      import java.util.Scanner;
      import java.util.Random;

        public class MatrixOperations {
            private int[][] matrix;
            private int width;
            private int height;
            private final int MAX_SIZE = 20;
            private final int MIN_RANDOM = 1;
            private final int MAX_RANDOM = 100;

            public void createMatrix() {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Enter the width of the matrix (not more than 20):");
                width = Math.min(scanner.nextInt(), MAX_SIZE);

                System.out.println("Enter the height of the matrix (not more than 20):");
                height = Math.min(scanner.nextInt(), MAX_SIZE);

                matrix = new int[height][width];

                System.out.println("Choose how to fill the matrix:");
                System.out.println("1. Manual input");
                System.out.println("2. Random input");
                int choice = scanner.nextInt();

                if (choice == 1) {
                    manualInput(scanner);
                } else if (choice == 2) {
                    randomInput();
                } else {
                    System.out.println("Invalid choice. Using random input by default.");
                    randomInput();
                }
            }

            private void manualInput(Scanner scanner) {
                System.out.println("Enter the elements of the matrix:");
                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < width; j++) {
                        matrix[i][j] = scanner.nextInt();
                    }
                }
            }

            private void randomInput() {
                Random random = new Random();
                System.out.println("Generating random matrix...");
                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < width; j++) {
                        matrix[i][j] = random.nextInt(MAX_RANDOM - MIN_RANDOM + 1) + MIN_RANDOM;
                    }
                }
            }

            public void findMinMaxAndAverage() {
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                int sum = 0;

                for (int[] row : matrix) {
                    for (int element : row) {
                        min = Math.min(min, element);
                        max = Math.max(max, element);
                        sum += element;
                    }
                }

                double average = (double) sum / (width * height);

                System.out.println("Minimum element: " + min);
                System.out.println("Maximum element: " + max);
                System.out.println("Average: " + average);
            }

            public static void main(String[] args) {
                MatrixOperations matrixOperations = new MatrixOperations();
                matrixOperations.createMatrix();
                matrixOperations.findMinMaxAndAverage();
            }
        }

