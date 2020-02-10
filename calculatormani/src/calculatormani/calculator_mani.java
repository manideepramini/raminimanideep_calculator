package calculatormani;
import java.util.*;
public class calculator_mani {


static void add(int p,int o) {
		int k=p;
		int y=o;
		int z=k+y;
		System.out.println("*"+z+" *");
	}
static void sub(int p,int o) {
	int r=p-o;
	System.out.println("*"+r+"  *");
}
static void mul(int p,int o) {
	int b=p*o;
	System.out.println("*"+b+" *");
}
static void div(int p,int o) {
	int y=p/o;
	System.out.println("*"+y+" *");
}
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int t=0;
	while(t==0) {
	System.out.println("**********************Calculator****************************");
	System.out.println("*1)Addition                                                *");
	System.out.println("*2)Substration                                             *");
	System.out.println("*3)multiplication                                          *");
	System.out.println("*4)Division                                                *");
	System.out.println("************************************************************");
	int a=sc.nextInt();
	System.out.println("*enter two numbers                                         *");
	int p=sc.nextInt();
	int o=sc.nextInt();
	if(a==1) {
		add(p,o);
	}
	else if(a==2) {
		sub(p,o);
	}
	else if(a==3) {
		mul(p,o);
	}
	else if(a==4) {
		div(p,o);
	}
	else {
		System.out.println("please enter a valid instruction");
	}
	System.out.println("*press 0 to do it again                                    *");
	t=sc.nextInt();
	}


}
}
