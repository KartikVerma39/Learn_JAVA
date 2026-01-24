import java.util.Scanner;

public class SymbolMatrix {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int column;
        int row;
        char symbol;

        System.out.print("Tell the number of columns : ");
        column = scanner.nextInt();

        System.out.print("Tell the number of rows : ");
        row = scanner.nextInt();

        System.out.print("Tell the symbol for which you want the matrix : ");
        symbol = scanner.next().charAt(0);

        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < column ; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }

        scanner.close();
    }
}
