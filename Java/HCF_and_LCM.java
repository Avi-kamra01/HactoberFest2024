import java.util.Scanner;

public class HCF_and_LCM {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

// HCF AND LCM
        int nu1 = obj.nextInt();
        int nu2 = obj.nextInt();
        int hcf = 1;

        int min = (nu1<nu2)?nu1:nu2;

        for(int j=1;j<min;j++){
        if(nu1%j==0 && nu2%j==0){
        hcf = j;
        }
        }

        int lcm = nu1*nu2/hcf;

        System.out.println("hcf = "+hcf);
        System.out.println("lcm = "+lcm);

        
        obj.close();
    }
}
