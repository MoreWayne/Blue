package ch01;
import org.junit.Test;
import chapter1.Main;
/*
 *    �������ȷ���Ĳμ�����---- ����ʱ����,����������������
 *    ���������ȷ��������---- �ų������ܵ�,ʣ�¾��ǿ��ܵ�
 * 
 */
public class Tuilun {
	@Test
	public void test1(){

		/*
		 * 1��  0 ����
		 * a==0 c==1 d==1 d==0
		 * ö���������, �������������������һ�ֲ�����
		 */

		for (int a = 0; a <=1; a++) {
			for (int b = 0; b <=1; b++) {
				for (int c = 0; c <=1; c++) {
					for (int d = 0; d <=1; d++) {
						int temp = 0;
						if(a==0){
							temp+=1;
						}
						if(c==1){
							temp+=1;
						}
						if(d==1){
							temp+=1;
						}
						if(d==0){
							temp+=1;
						}
						if(temp==3&&a+b+c+d==1){
							System.out.println(a+" "+b+" "+c+" "+d+" ");
						}
					}
				}
			}
		}
	}
	@Test
	public void test2(){
		/*
		 *  
		 *  �μ� 1 ���μ� 0
		 *  1�������¡��á��ġ�������ѧ���п��ܲμӼ�����������������������ж���Щ �˲μ��˾�����  
		 *  ���������μ�ʱ����Ҳ�μӣ�    
			�������ºͣ�ֻ��һ���˲μӣ�     
			�������úͣĻ��߶��μӣ����߶����μӣ�    
			�������ĺͣ���������һ���˲μӣ�     
			����������Ųμӣ���ô���ͣ�Ҳ���μӡ� ----> 
			����1: �ų��෴�����
		 */
		int a,b,c,d,e;
		for (a = 0; a <2; a++) {
			for (b = 0; b <2; b++) {
				for (c = 0; c <2; c++) {
					for (d = 0; d <2; d++) {
						for (e = 0; e <2; e++) {
							if(a==1&&b==0){//1
								continue;
							}
							if((b==0&&c==0)||(b==1&&c==1)){//2
								continue;
							}
							if((c==0&&d==1)||(c==1&&d==0)){//3
								continue;
							}
							if((d==0&&e==0)){//4
								continue;
							}
							if((e==1&&((a==1&&d==0)||(a==0&&d==1)||(a==0&&d==0)))){//5
								continue;
							}
							System.out.printf("%d %d %d %d %d ",a,b,c,d,e);
							System.out.println();
						}
					}
				}
			}
		}
	}
	@Test
	public void test22(){
		/*
		 *  
		 *  �μ� 1 ���μ� 0
		 *  1�������¡��á��ġ�������ѧ���п��ܲμӼ�����������������������ж���Щ �˲μ��˾�����  
		 *  ���������μ�ʱ����Ҳ�μӣ�    
			�������ºͣ�ֻ��һ���˲μӣ�     
			�������úͣĻ��߶��μӣ����߶����μӣ�    
			�������ĺͣ���������һ���˲μӣ�     
			����������Ųμӣ���ô���ͣ�Ҳ���μӡ� ----> 
			����2: ����
		 */
		int a,b,c,d,e;
		for (a = 0; a <2; a++) {
			for (b = 0; b <2; b++) {
				for (c = 0; c <2; c++) {
					for (d = 0; d <2; d++) {
						for (e = 0; e <2; e++) {
							if(a+b==2)
							System.out.printf("%d %d %d %d %d ",a,b,c,d,e);
							System.out.println();
						}
					}
				}
			}
		}
		
	}
	
	
	
	@Test
	public void test3(){
		/*
		 * ĳ���ӽӵ�һ���������Ҫ����A��B��C��D��E��F������Ա�о����ܶ���������ˣ�������������������  
			1)A��B����������ȥһ�ˣ�  
			2)A��D����һ��ȥ��  
			3)A��E��F������Ҫ������ȥ�� 
			4)B��C��ȥ�򶼲�ȥ�� 
			5)C��D������ȥһ���� 
			 6)��D��ȥ����EҲ��ȥ��   d ȥ   E �п���ȥ�п��ܲ�ȥ 
			  �Ա�дһ�����������Ӧ�����ļ�����ȥ��
		
			  
		 */
		int a,b,c,d,e,f;
		for(a = 0 ; a <=1; a++){
			for(b= 0 ; b <=1; b++){
				for(c = 0 ; c <=1; c++){
					for(d = 0 ; d <=1; d++){
						for(e = 0 ; e <=1; e++){
							for(f = 0 ; f <=1 ; f++){
//							����     undo
//							if(a+b==0){//1
//								continue;
//							}
//							if(a+d==1||a+d==0){// 2(a==1&&d==0)||(a==0&&b==1)||(a==0&b==0)
//								continue;
//							}
//							if(a+e+f==3||a+e+f==1||a+e+f==0){//3
//								continue;
//							}
//							if(b+c==1){//4
//								continue;
//							}
//							if(c==d){
//								continue;
//							}
//							if(d+e!=0){
//								continue;
//							}
//							System.out.printf("%d %d %d %d %d %d ",a,b,c,d,e,f);
//							System.out.println();
//							����  do
								if(a+b>=1&&a+d!=2&&a+e+f==2&&b==c&&c+d==1&&(d+e==0||d==1)){
									System.out.printf("a= %d, b= %d, c= %d, d= %d, e=%d, f=%d ",a,b,c,d,e,f);
									System.out.println();
								}
							}
							
						}	
					}
				}
			}
		}
		
		
		
	}

}
