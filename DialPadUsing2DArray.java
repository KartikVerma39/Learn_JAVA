public class DialPadUsing2DArray {
    public static void main(String[] args){
        char[][] dialPad = {{'1','2','3'},
                            {'4','5','6'},
                            {'7','8','9'},
                            {'*','0','#'}};

        for(char[] row:dialPad){
            for(char it:row){
                System.out.print(it + " ");
            }
            System.out.println();
        }
    }
}
