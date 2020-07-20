public class ParenthesesPattern {
    int n=2;

    public void check(){
        for (int i=0; i<=n; i++){
            for(int j=0;j<n; j++) {
                System.out.print("(");

                for (int m=0; m<=n; m++){
                    for(int h=0;h<m; h++){
                        System.out.print(")");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ParenthesesPattern pattern =new ParenthesesPattern();
        pattern.check();
    }
}