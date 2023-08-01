  import java.util.Scanner;

public class arry {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
	    int cur_pos=0,opt=0;
	    int[] arry = new int[10];
        while (opt <4) {
            System.out.println("1. Push\n2. Pop\n3. Show \n4. Exit ");
    	    opt =  sc.nextInt();
            switch (opt) {
                case 1:
                    if(cur_pos>9){
                        System.out.println("overflow");
                    }
                    else
                    {
                        int temp_ele = sc.nextInt();
                        arry[cur_pos] = temp_ele;
                        cur_pos++;
                    }
                    break;
                case 2:
                    if (cur_pos<1) {
                        System.out.println("underflow");
                    }
                    else{
                        System.out.println(arry[cur_pos-1]);
                        cur_pos--;
                    }
                    break;
                case 3:
                    for (int i=0;i<cur_pos;i++)
                    {
                        System.out.print(arry[i]+" ");
                    }
                    System.out.println();
                    break;
                case 4:
                    opt = 12;
            }
        }
        sc.close();
	    
    }
}
