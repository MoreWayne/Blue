package ch01;
import org.junit.Test;
import chapter1.Main;
/*
 *    如果给出确定的参加人数---- 设临时变量,用来计算条件成立
 *    如果不给出确定的数量---- 排除不可能的,剩下就是可能的
 * 
 */
public class Tuilun {
	@Test
	public void test1(){

		/*
		 * 1是  0 不是
		 * a==0 c==1 d==1 d==0
		 * 枚举所有情况, 并且以上情况三种满足一种不满足
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
		 *  参加 1 不参加 0
		 *  1、Ａ、Ｂ、Ｃ、Ｄ、Ｅ五名学生有可能参加计算机竞赛，根据下列条件判断哪些 人参加了竞赛：  
		 *  （１）Ａ参加时，Ｂ也参加；    
			（２）Ｂ和Ｃ只有一个人参加；     
			（３）Ｃ和Ｄ或者都参加，或者都不参加；    
			（４）Ｄ和Ｅ中至少有一个人参加；     
			（５）如果Ｅ参加，那么Ａ和Ｄ也都参加。 ----> 
			做法1: 排除相反的情况
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
		 *  参加 1 不参加 0
		 *  1、Ａ、Ｂ、Ｃ、Ｄ、Ｅ五名学生有可能参加计算机竞赛，根据下列条件判断哪些 人参加了竞赛：  
		 *  （１）Ａ参加时，Ｂ也参加；    
			（２）Ｂ和Ｃ只有一个人参加；     
			（３）Ｃ和Ｄ或者都参加，或者都不参加；    
			（４）Ｄ和Ｅ中至少有一个人参加；     
			（５）如果Ｅ参加，那么Ａ和Ｄ也都参加。 ----> 
			做法2: 正向
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
		 * 某侦察队接到一项紧急任务，要求在A、B、C、D、E、F六个队员中尽可能多地挑若干人，但有以下限制条件：  
			1)A和B两人中至少去一人；  
			2)A和D不能一起去；  
			3)A、E和F三人中要派两人去； 
			4)B和C都去或都不去； 
			5)C和D两人中去一个； 
			 6)若D不去，则E也不去。   d 去   E 有可能去有可能不去 
			  试编写一个程序，输出问应当让哪几个人去？
		
			  
		 */
		int a,b,c,d,e,f;
		for(a = 0 ; a <=1; a++){
			for(b= 0 ; b <=1; b++){
				for(c = 0 ; c <=1; c++){
					for(d = 0 ; d <=1; d++){
						for(e = 0 ; e <=1; e++){
							for(f = 0 ; f <=1 ; f++){
//							逆向     undo
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
//							正向  do
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
